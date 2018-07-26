package fr.cryptohash.test.additions;

import fr.cryptohash.SHA384;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for SHA384.
 * * Test data comes from https://de.wikipedia.org/wiki/SHA-2
 */
public class SHA384Test extends AbstractCryptoTest<SHA384> {
    public SHA384Test() {
        super(SHA384.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "", "38b060a751ac96384cd9327eb1b1e36a21fdb71114be07434c0cc7bf63f6e1da274edebfe76f65fbd51ad2f14898b95b");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "Franz jagt im komplett verwahrlosten Taxi quer durch Bayern", "71e8383a4cea32d6fd6877495db2ee353542f46fa44bc23100bca48f3366b84e809f0708e81041f427c6d5219a286677");
    }

    @Test
    public void testWithDogDot() {
        CryptoHelpers.testAsciiAndHex(instance(), "Frank jagt im komplett verwahrlosten Taxi quer durch Bayern", "ef9cd8873a92190f68a85edccb823649e3018ab4da3aeff54215187c0972f7d77922c72f7c0d90fca01cf3e46af664d2");
    }
}

