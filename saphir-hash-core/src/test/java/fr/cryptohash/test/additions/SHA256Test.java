package fr.cryptohash.test.additions;

import fr.cryptohash.SHA256;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for SHA256.
 * * Test data comes from https://en.wikipedia.org/wiki/SHA-2
 */
public class SHA256Test extends AbstractCryptoTest<SHA256> {
    public SHA256Test() {
        super(SHA256.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "Franz jagt im komplett verwahrlosten Taxi quer durch Bayern", "d32b568cd1b96d459e7291ebf4b25d007f275c9f13149beeb782fac0716613f8");
    }

    @Test
    public void testWithDogDot() {
        CryptoHelpers.testAsciiAndHex(instance(), "Frank jagt im komplett verwahrlosten Taxi quer durch Bayern", "78206a866dbb2bf017d8e34274aed01a8ce405b69d45db30bafa00f5eeed7d5e");
    }
}

