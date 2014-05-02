/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.cryptohash.test;

import fr.cryptohash.JCAProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Test;

/**
 * Compares speed of SH-Lib and SUN providers.
 *
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public class SpeedTest {

    private final static String ALGORITHM_NAMES[] = new String[]{
        "MD2",
        "MD5",
        "SHA",
        "SHA-224",
        "SHA-256",
        "SHA-384",
        "SHA-512"
    };

    private final static int K = 1024;
    public final static int TEST_SIZES[] = new int[]{K, 10 * K, 100 * K, K * K, 100 * K * K};
    public final static String TEST_NAMES[] = new String[]{"1K", "10K", "100K", "1M", "100M"};

    @Test
    public void testSpeed() throws NoSuchAlgorithmException {
        JCAProvider sphlib = new JCAProvider();
        BouncyCastleProvider bouncy = new BouncyCastleProvider();

        MessageDigest md5 = MessageDigest.getInstance("MD5");

        Provider providers[] = new Provider[]{md5.getProvider(), sphlib, bouncy};

        for (String algo : ALGORITHM_NAMES) {

            for (int size : TEST_SIZES) {
                boolean first = true;
                for (Provider provider : providers) {
                    MessageDigest messageDigest = MessageDigest.getInstance(algo, provider);
                    // once without output to hopefully JIT compile
                    test(algo, size, messageDigest, false, first);
                    // once with output
                    test(algo, size, messageDigest, true, first);
                    
                    first = false;
                }
                
                System.out.println();
            }
        }
    }

    private void test(String algo, int size, MessageDigest md, boolean verbose, boolean first) {
        byte oneK[] = new byte[K];

        long start = System.nanoTime();

        for (int count = 0; count < size; count += oneK.length) {
            md.update(oneK);
        }
        md.digest();

        long end = System.nanoTime();

        if (verbose) {
            int i = Arrays.binarySearch(TEST_SIZES, size);
            String name = TEST_NAMES[i];
            
            if (first) {
                System.out.print(algo + "," + name + "," + md.getProvider().getName() + ","  + (end - start));
            } else {
                System.out.print(","+md.getProvider().getName() + ","  + (end - start));
            }
        }
    }
}
