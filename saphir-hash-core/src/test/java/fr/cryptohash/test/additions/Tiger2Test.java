package fr.cryptohash.test.additions;

import fr.cryptohash.Tiger2;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for SHA1.
 * * Test data comes from https://en.wikipedia.org/wiki/Tiger_(cryptography)
 */
public class Tiger2Test extends AbstractCryptoTest<Tiger2> {
    public Tiger2Test() {
        super(Tiger2.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "4441be75f6018773c206c22745374b924aa8313fef919f41");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy dog", "976abff8062a2e9dcea3a1ace966ed9c19cb85558b4976d8");
    }

    @Test
    public void testWithCog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy cog", "09c11330283a27efb51930aa7dc1ec624ff738a8d9bdd3df");
    }
}

