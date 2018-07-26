package fr.cryptohash.test.additions;

import fr.cryptohash.Whirlpool0;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for Whirlpool0.
 * * Test data comes from https://en.wikipedia.org/wiki/Whirlpool_(cryptography)
 */
public class Whirlpool0Test extends AbstractCryptoTest<Whirlpool0> {
    public Whirlpool0Test() {
        super(Whirlpool0.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "B3E1AB6EAF640A34F784593F2074416ACCD3B8E62C620175FCA0997B1BA23473" +
                "39AA0D79E754C308209EA36811DFA40C1C32F1A2B9004725D987D3635165D3C8");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy dog", "4F8F5CB531E3D49A61CF417CD133792CCFA501FD8DA53EE368FED20E5FE0248C" +
                "3A0B64F98A6533CEE1DA614C3A8DDEC791FF05FEE6D971D57C1348320F4EB42D");
    }

    @Test
    public void testWithEog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy eog", "228FBF76B2A93469D4B25929836A12B7D7F2A0803E43DABA0C7FC38BC11C8F2A" +
                "9416BBCF8AB8392EB2AB7BCB565A64AC50C26179164B26084A253CAF2E012676");
    }
}

