package fr.cryptohash.test.additions;

import fr.cryptohash.RIPEMD128;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for RIPEMD128.
 * * Test data comes from http://homes.esat.kuleuven.be/~bosselae/ripemd160.html
 */
public class RIPEMD128Test extends AbstractCryptoTest<RIPEMD128> {
    public RIPEMD128Test() {
        super(RIPEMD128.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "cdf26213a150dc3ecb610f18f6b38b46");
    }

    @Test
    public void testWithLength1() {
        CryptoHelpers.testAsciiAndHex(instance(), "a", "86be7afa339d0fc7cfc785e72f578d33");
    }

    @Test
    public void testWithLength3() {
        CryptoHelpers.testAsciiAndHex(instance(), "abc", "c14a12199c66e4ba84636b0f69144c77");
    }

    @Test
    public void testWithLengthN() {
        CryptoHelpers.testAsciiAndHex(instance(), "message digest", "9e327b3d6e523062afc1132d7df9d1b8");
    }

    @Test
    public void testWithEight() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append("1234567890");
        }
        CryptoHelpers.testAsciiAndHex(instance(), sb.toString(), "3f45ef194732c2dbb2c4a2c769795fa3");
    }
}

