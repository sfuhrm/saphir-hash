package fr.cryptohash.test.additions;

import fr.cryptohash.MD2;
import fr.cryptohash.MD4;
import fr.cryptohash.test.AbstractCryptoTest;
import org.junit.Test;

/**
 * JUnit test with example data for MD4.
 * * Test data comes from https://en.wikipedia.org/wiki/MD4
 */
public class MD4Test extends AbstractCryptoTest {

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(new MD4(),"","31d6cfe0d16ae931b73c59d7e0c089c0");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(new MD4(),"The quick brown fox jumps over the lazy dog","1bee69a46ba811185c194762abaeae90");
    }

    @Test
    public void testWithCog() {
        CryptoHelpers.testAsciiAndHex(new MD4(),"The quick brown fox jumps over the lazy cog","b86e130ce7028da59e672d56ad0113df");
    }

    @Test
    public void testWithNumbers() {
        CryptoHelpers.testAsciiAndHex(new MD4(),"12345678901234567890123456789012345678901234567890123456789012345678901234567890","e33b4ddc9c38f2199c3e7b164fcc0536");
    }


    @Test
    public void testWithCollision() {
        CryptoHelpers.testHex(new MD4(),"839c7a4d7a92cb5678a5d5b9eea5a7573c8a74deb366c3dc20a083b69f5d2a3bb3719dc69891e9f95e809fd7e8b23ba6318edd45e51fe39708bf9427e9c3e8b9","4d7e6a1defa93d2dde05b45d864c429b");

        CryptoHelpers.testHex(new MD4(),"839c7a4d7a92cbd678a5d529eea5a7573c8a74deb366c3dc20a083b69f5d2a3bb3719dc69891e9f95e809fd7e8b23ba6318edc45e51fe39708bf9427e9c3e8b9","4d7e6a1defa93d2dde05b45d864c429b");
    }
}

