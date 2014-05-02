/*
 * Copyright (c) 2014, Stephan Fuhrmann &lt;stephan@tynne.de&gt;
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
package de.tynne.sphlib;


import fr.cryptohash.JCAProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * Compares speed of SH-Lib, Bouncy castle and SUN providers.
 *
 * @see <a href="https://www.bouncycastle.org/">Bouncy Castle Project</a>
 * @author Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 */
public class SpeedTest {

    private final Arguments arguments;
    private final Map<String, Provider> providers;

    public SpeedTest(Arguments arguments) throws NoSuchAlgorithmException {
        this.arguments = arguments;
        
        providers = new HashMap<String, Provider>();
        providers.put("BC", new BouncyCastleProvider());
        providers.put("SPH", new JCAProvider());
        providers.put("SUN", MessageDigest.getInstance("MD5").getProvider());
        
    }    
    
    private static class TestSpec {
        long byteSize;
        String name;

        public TestSpec(long byteSize, String name) {
            this.byteSize = byteSize;
            this.name = name;
        }
    }
    
    public static void main(String args[]) throws NoSuchAlgorithmException, NoSuchProviderException {
        
        Arguments cliArgs = Arguments.parse(args);
        if (cliArgs == null) {
            return;
        }
        
        SpeedTest test = new SpeedTest(cliArgs);
        test.speedTest();
    }

    private void speedTest() throws NoSuchAlgorithmException, NoSuchProviderException {
        System.out.print("Algo,Size");
        for (String prov : arguments.getProviders())
            System.out.print(","+prov+"Name,"+prov+"TimeMillis");
        System.out.println();
        
        for (String algo : arguments.getAlgorithms()) {

            for (SizeWithMultiplier spec : arguments.getSizes()) {
                boolean first = true;
                
                for (String provider : arguments.getProviders()) {
                    
                    Provider providerInstance = providers.get(provider);
                    
                    MessageDigest messageDigest = MessageDigest.getInstance(algo, providerInstance);
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
    private static void test(String algo, SizeWithMultiplier spec, MessageDigest md, boolean verbose, boolean first) {
        byte oneK[] = new byte[1024];

        long start = System.nanoTime();

        for (int count = 0; count < spec.getNumber(); count += oneK.length) {
            md.update(oneK);
        }
        md.digest();

        long end = System.nanoTime();

        if (verbose) {
            if (first) {
                System.out.print(algo + "," + spec + "," + md.getProvider().getName() + ","  + (end - start));
            } else {
                System.out.print(","+md.getProvider().getName() + ","  + (end - start));
            }
        }
    }
}
