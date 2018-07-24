package fr.cryptohash.test.additions;

import fr.cryptohash.RIPEMD128;
import fr.cryptohash.test.AbstractCryptoTest;
import org.junit.Test;

/**
 * JUnit test with example data for RIPEMD128.
 * * Test data comes from http://homes.esat.kuleuven.be/~bosselae/ripemd160.html
 */
public class RIPEMD128Test extends AbstractCryptoTest {

    @Test
    public void testWithLength0() {
        testAsciiAndHex(new RIPEMD128(),
                "",
                "cdf26213a150dc3ecb610f18f6b38b46");
    }

    @Test
    public void testWithLength1() {
        testAsciiAndHex(new RIPEMD128(),
                "a",
                "86be7afa339d0fc7cfc785e72f578d33");
    }

    @Test
    public void testWithLength3() {
        testAsciiAndHex(new RIPEMD128(),
                "abc",
                "c14a12199c66e4ba84636b0f69144c77");
    }

    @Test
    public void testWithLengthN() {
        testAsciiAndHex(new RIPEMD128(),
                "message digest",
                "9e327b3d6e523062afc1132d7df9d1b8");
    }
}

