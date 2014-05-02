/*
 * Copyright (c) 2014, Stephan Fuhrmann <stephan@tynne.de>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package fr.cryptohash.test.speed;

import fr.cryptohash.JCAProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Test;

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
    
    @Test
    public void testSpeed() throws NoSuchAlgorithmException {
        JCAProvider sphlib = new JCAProvider();
        BouncyCastleProvider bouncy = new BouncyCastleProvider();

        // get SUN provider by getting the MD5 digest as an example
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        Provider providers[] = new Provider[]{md5.getProvider(), sphlib, bouncy};

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
    private void test(String algo, TestSpec spec, MessageDigest md, boolean verbose, boolean first) {
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
