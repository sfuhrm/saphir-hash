package fr.cryptohash.test.additions;

import fr.cryptohash.SHA512;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for SHA512.
 * * Test data comes from https://de.wikipedia.org/wiki/SHA-2
 */
public class SHA512Test extends AbstractCryptoTest<SHA512> {
    public SHA512Test() {
        super(SHA512.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "cf83e1357eefb8bdf1542850d66d8007d620e4050b5715dc83f4a921d36ce9ce47d0d13c5d85f2b0ff8318d2877eec2f63b931bd47417a81a538327af927da3e");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "Franz jagt im komplett verwahrlosten Taxi quer durch Bayern", "af9ed2de700433b803240a552b41b5a472a6ef3fe1431a722b2063c75e9f07451f67a28e37d09cde769424c96aea6f8971389db9e1993d6c565c3c71b855723c");
    }

    @Test
    public void testWithDogDot() {
        CryptoHelpers.testAsciiAndHex(instance(), "Frank jagt im komplett verwahrlosten Taxi quer durch Bayern", "90b30ef9902ae4c4c691d2d78c2f8fa0aa785afbc5545286b310f68e91dd2299c84a2484f0419fc5eaa7de598940799e1091c4948926ae1c9488dddae180bb80");
    }
}

