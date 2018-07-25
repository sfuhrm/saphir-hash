package fr.cryptohash.test.additions;

import fr.cryptohash.MD5;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for MD5.
 * * Test data comes from https://en.wikipedia.org/wiki/MD5
 */
public class MD5Test extends AbstractCryptoTest<MD5> {
    public MD5Test() {
        super(MD5.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "d41d8cd98f00b204e9800998ecf8427e");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy dog", "9e107d9d372bb6826bd81d3542a419d6");
    }

    @Test
    public void testWithDogDot() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy dog.", "e4d909c290d0fb1ca068ffaddf22cbd0");
    }
}

