/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.cryptohash.test;

import fr.cryptohash.JCAProvider;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests whether Sun and SPH Lib results are the same.
 * @author fury
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
