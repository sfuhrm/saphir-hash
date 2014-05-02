package de.tynne.sphlib;


import fr.cryptohash.JCAProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * Compares speed of SH-Lib, Bouncy castle and SUN providers.
 *
 * @see <a href="https://www.bouncycastle.org/">Bouncy Castle Project</a>
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public class SpeedTest {

    /** These algorithms are also in the standard JDK. */
    private final static String ALGORITHM_NAMES[] = new String[]{
        "MD2",
        "MD5",
        "SHA",
        "SHA-224",
        "SHA-256",
        "SHA-384",
        "SHA-512"
    };
    
    private static class TestSpec {
        long byteSize;
        String name;

        public TestSpec(long byteSize, String name) {
            this.byteSize = byteSize;
            this.name = name;
        }
    }

    /** Kilobyte. */
    private final static int K = 1024;
    
    private final static TestSpec TESTSPECS[] = new TestSpec[] {
        new TestSpec(K, "1K"),
        new TestSpec(10*K, "10K"),
        new TestSpec(100*K, "100K"),
        new TestSpec(K*K, "1M"),
        new TestSpec(100*K*K, "100M"),
    };
    
    public static void main(String args[]) throws NoSuchAlgorithmException {
        JCAProvider sphlib = new JCAProvider();
        BouncyCastleProvider bouncy = new BouncyCastleProvider();

        // get SUN provider by getting the MD5 digest as an example
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        Provider providers[];
        
        if (args.length == 0) {
            providers = new Provider[]{md5.getProvider(), sphlib, bouncy};
        } else {
            providers = new Provider[]{sphlib};
        }

        System.out.println("Algo,Size,SunProvider,SunDuration,SphProvider,SphDuration,BcProvider,SphDuration");
        
        for (String algo : ALGORITHM_NAMES) {

            for (TestSpec spec : TESTSPECS) {
                boolean first = true;
                for (Provider provider : providers) {
                    MessageDigest messageDigest = MessageDigest.getInstance(algo, provider);
                    // once without output to hopefully JIT compile
                    test(algo, spec, messageDigest, false, first);
                    // once with output
                    test(algo, spec, messageDigest, true, first);
                    
                    first = false;
                }
                
                System.out.println();
            }
        }
    }

    /** Speed test for one MD algo.
     * @param algo the algorithm name.
     * @param spec test description.
     * @param md the algorithm instance to use.
     * @param verbose whether to output the test result to  {@code System.out}.
     * @param first is this the first test for this algo? Used to format the output.
     */
    private static void test(String algo, TestSpec spec, MessageDigest md, boolean verbose, boolean first) {
        byte oneK[] = new byte[K];

        long start = System.nanoTime();

        for (int count = 0; count < spec.byteSize; count += oneK.length) {
            md.update(oneK);
        }
        md.digest();

        long end = System.nanoTime();

        if (verbose) {
            if (first) {
                System.out.print(algo + "," + spec.name + "," + md.getProvider().getName() + ","  + (end - start));
            } else {
                System.out.print(","+md.getProvider().getName() + ","  + (end - start));
            }
        }
    }
}
