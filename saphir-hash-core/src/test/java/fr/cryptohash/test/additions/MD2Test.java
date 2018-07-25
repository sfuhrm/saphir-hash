package fr.cryptohash.test.additions;

import fr.cryptohash.MD2;
import fr.cryptohash.RIPEMD128;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for MD2.
 * * Test data comes from https://en.wikipedia.org/wiki/MD2_(cryptography)
 */
public class MD2Test extends AbstractCryptoTest {

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(new MD2(),"","8350e5a3e24c153df2275c9f80692773");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(new MD2(),"The quick brown fox jumps over the lazy dog","03d85a0d629d2c442e987525319fc471");
    }

    @Test
    public void testWithCog() {
        CryptoHelpers.testAsciiAndHex(new MD2(),"The quick brown fox jumps over the lazy cog","6b890c9292668cdbbfda00a4ebf31f05");
    }
}

