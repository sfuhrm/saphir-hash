/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.cryptohash.test;

import java.security.Provider;
import java.security.Security;
import org.junit.Test;

/**
 * Outputs the MessageDigest names supported on this platform.
 * Not really a test, sorry.
 * @author fury
 */
public class SunNames {
    @Test
    public void sunNames() {
        Provider provs[] = Security.getProviders();
        for (Provider prov : provs) {
            System.out.println("Name: "+prov.getName());
            for (Provider.Service service : prov.getServices()) {
                if (service.getType().equals("MessageDigest")) {
                    System.out.println("Service " + service.getAlgorithm() + " " + service.getType());
                }
            }
        }
    }
}
