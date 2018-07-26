package fr.cryptohash.test.additions;

import fr.cryptohash.HAVAL256_5;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for HAVAL 256 / 5.
 * * Test data comes from https://en.wikipedia.org/wiki/HAVAL
 */
public class Haval256_5Test extends AbstractCryptoTest<HAVAL256_5> {
    public Haval256_5Test() {
        super(HAVAL256_5.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "be417bb4dd5cfb76c7126f4f8eeb1553a449039307b1a3cd451dbfdc0fbbe330");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy dog", "b89c551cdfe2e06dbd4cea2be1bc7d557416c58ebb4d07cbc94e49f710c55be4");
    }

    @Test
    public void testWithCog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy cog", "60983bb8c8f49ad3bea29899b78cd741f4c96e911bbc272e5550a4f195a4077e");
    }
}

