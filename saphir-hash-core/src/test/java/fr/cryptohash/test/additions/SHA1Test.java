package fr.cryptohash.test.additions;

import fr.cryptohash.MD5;
import fr.cryptohash.SHA1;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for SHA1.
 * * Test data comes from https://en.wikipedia.org/wiki/SHA-1
 */
public class SHA1Test extends AbstractCryptoTest<SHA1> {
    public SHA1Test() {
        super(SHA1.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy dog", "2fd4e1c67a2d28fced849ee1bb76e7391b93eb12");
    }

    @Test
    public void testWithCog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy cog", "de9f2c7fd25e1b3afad3e85a0bd17d9b100db4b3");
    }
}

