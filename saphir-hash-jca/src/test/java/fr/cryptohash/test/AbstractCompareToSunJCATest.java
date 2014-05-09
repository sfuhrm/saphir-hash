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
package fr.cryptohash.test;

import fr.cryptohash.JCAProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests whether Sun and SPH results are the same.
 * This only works for the algorithms that are existing in SPH and in SUN
 * JCA providers also.
 * @author Stephan Fuhrmann
 */
public abstract class AbstractCompareToSunJCATest {
    
    /** SUN implementation for reference. */
    private MessageDigest sun;
    
    /** SH-Lib implementation for test. */
    private MessageDigest sh;
    
    /** Returns the digest name as known to {@link MessageDigest#getInstance(java.lang.String) }.
     * @return the message digest algorithm name.
     */
    protected abstract String getMessageDigestName();
    
    @Before
    public void init() throws NoSuchAlgorithmException {
        sun = MessageDigest.getInstance(getMessageDigestName());
        sh= MessageDigest.getInstance(getMessageDigestName(), new JCAProvider());
    }
    
    @Test
    public void testClone() throws CloneNotSupportedException {
        MessageDigest sh2 = (MessageDigest) sh.clone();
        Assert.assertEquals(sh.getClass(), sh2.getClass());
        Assert.assertNotSame(sh, sh2);
    }
    
    @Test
    public void testGetDigestLength() {
        Assert.assertEquals(sun.getDigestLength(), sh.getDigestLength());
    }
    
    @Test
    public void testEmpty() {
        byte sunDigest[] = sun.digest();
        byte shDigest[] = sh.digest();
        
        Assert.assertArrayEquals(sunDigest, shDigest);
    }
        
    @Test
    public void test1k() {
        byte in[] = new byte[1024];
        byte sunDigest[] = sun.digest(in);
        byte shDigest[] = sh.digest(in);
        
        Assert.assertArrayEquals(sunDigest, shDigest);
    }
    
    @Test
    public void test1kWith3Calls() {
        byte in[] = new byte[1024];
        
        for (int i=0; i < in.length; i++) {
            in[i] = (byte)i;
        }
        
        sun.update(in, 0, 256);
        sh.update(in, 0, 256);
        sun.update(in, 256, 1024-256);
        sh.update(in, 256, 1024-256);
        
        byte sunDigest[] = sun.digest();
        byte shDigest[] = sh.digest();
        
        Assert.assertArrayEquals(sunDigest, shDigest);
    }
    
    @Test
    public void testWithByteUpdates() {
        byte in[] = new byte[1024];
        for (int i=0; i < in.length; i++) {
            in[i] = (byte)i;
        }

        for (int i=0; i < in.length; i++) {
            sun.update(in[i]);
            sh.update(in[i]);
        }
        
        byte sunDigest[] = sun.digest();
        byte shDigest[] = sh.digest();
        
        Assert.assertArrayEquals(sunDigest, shDigest);
    }
    
    @Test
    public void testMultipleWithByteUpdates() {
        byte in[] = new byte[1024];
        for (int i=0; i < in.length; i++) {
            in[i] = (byte)i;
        }

        for (int i = 0; i < in.length; i++) {

            sun.reset();
            sh.reset();
            
            for (int j = 0; i < in.length; i++) {
                sun.update(in[j]);
                sh.update(in[j]);
            }

            byte sunDigest[] = sun.digest();
            byte shDigest[] = sh.digest();

            Assert.assertArrayEquals(sunDigest, shDigest);
        }
    }    
}
