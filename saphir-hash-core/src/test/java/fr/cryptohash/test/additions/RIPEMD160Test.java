package fr.cryptohash.test.additions;

import fr.cryptohash.RIPEMD160;
import fr.cryptohash.test.AbstractCryptoTest;
import org.junit.Test;

/**
 * JUnit test with example data for RIPEMD128.
 * * Test data comes from http://homes.esat.kuleuven.be/~bosselae/ripemd160.html
 */
public class RIPEMD160Test extends AbstractCryptoTest {

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(new RIPEMD160(),"","9c1185a5c5e9fc54612808977ee8f548b2258d31");
    }

    @Test
    public void testWithLength1() {
        CryptoHelpers.testAsciiAndHex(new RIPEMD160(),"a","0bdc9d2d256b3ee9daae347be6f4dc835a467ffe");
    }

    @Test
    public void testWithLength3() {
        CryptoHelpers.testAsciiAndHex(new RIPEMD160(),"abc","8eb208f7e05d987a9b044a8e98c6b087f15a0bfc");
    }

    @Test
    public void testWithLengthN() {
        CryptoHelpers.testAsciiAndHex(new RIPEMD160(),"message digest","5d0689ef49d2fae572b881b123a85ffa21595f36");
    }

    @Test
    public void testWithEight() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append("1234567890");
        }
        CryptoHelpers.testAsciiAndHex(new RIPEMD160(),sb.toString(),"9b752e45573d4b39f4dbd3323cab82bf63326bfb");
    }
}

