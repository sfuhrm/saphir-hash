/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.cryptohash.test;

import fr.cryptohash.JCAProvider;
import fr.cryptohash.util.Hexs;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Some basic tests to see whether the JCA provider is working.
 * @author Stephan Fuhrmann
 */
public class JCAProviderTest {
    @Test
    public void testInstance() throws NoSuchAlgorithmException, NoSuchProviderException {
        MessageDigest.getInstance("MD5", new JCAProvider());
    }

    @Test
    public void testShortWithMD5() throws NoSuchAlgorithmException, NoSuchProviderException {
        
        MessageDigest mdDef = MessageDigest.getInstance("MD5");
        MessageDigest mdSH = MessageDigest.getInstance("MD5", new JCAProvider());
        
        mdDef.update("test".getBytes());
        mdSH.update("test".getBytes());
        
        byte mdDefDigest[] = mdDef.digest();
        byte mdSHDigest[] = mdSH.digest();
        
        Assert.assertEquals(Hexs.bytesToHexString(mdDefDigest), Hexs.bytesToHexString(mdSHDigest));
    }
    
    @Test
    public void testLongWithMD5() throws NoSuchAlgorithmException, NoSuchProviderException {
        
        MessageDigest mdDef = MessageDigest.getInstance("MD5");
        MessageDigest mdSH = MessageDigest.getInstance("MD5", new JCAProvider());
        
        for (int i=0; i < 1000; i++) {
            String str = i+"test";
            mdDef.update(str.getBytes());
            mdSH.update(str.getBytes());
        }
        
        byte mdDefDigest[] = mdDef.digest();
        byte mdSHDigest[] = mdSH.digest();
        
        Assert.assertEquals(Hexs.bytesToHexString(mdDefDigest), Hexs.bytesToHexString(mdSHDigest));
    }
}
