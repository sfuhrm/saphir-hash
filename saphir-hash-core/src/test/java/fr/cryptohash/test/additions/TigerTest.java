package fr.cryptohash.test.additions;

import fr.cryptohash.SHA1;
import fr.cryptohash.Tiger;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for SHA1.
 * * Test data comes from https://en.wikipedia.org/wiki/Tiger_(cryptography)
 */
public class TigerTest extends AbstractCryptoTest<Tiger> {
    public TigerTest() {
        super(Tiger.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "3293ac630c13f0245f92bbb1766e16167a4e58492dde73f3");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy dog", "6d12a41e72e644f017b6f0e2f7b44c6285f06dd5d2c5b075");
    }

    @Test
    public void testWithCog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy cog", "a8f04b0f7201a0d728101c9d26525b31764a3493fcd8458f");
    }
}

