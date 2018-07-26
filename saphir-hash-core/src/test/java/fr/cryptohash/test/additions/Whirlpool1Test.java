package fr.cryptohash.test.additions;

import fr.cryptohash.Whirlpool1;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for Whirlpool0.
 * * Test data comes from https://en.wikipedia.org/wiki/Whirlpool_(cryptography)
 */
public class Whirlpool1Test extends AbstractCryptoTest<Whirlpool1> {
    public Whirlpool1Test() {
        super(Whirlpool1.class);
    }

    @Test
    public void testWithLength0() {
        CryptoHelpers.testAsciiAndHex(instance(), "",
                "470F0409ABAA446E49667D4EBE12A14387CEDBD10DD17B8243CAD550A089DC0F" +
                        "EEA7AA40F6C2AAAB71C6EBD076E43C7CFCA0AD32567897DCB5969861049A0F5A");
    }

    @Test
    public void testWithDog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy dog",
                "3CCF8252D8BBB258460D9AA999C06EE38E67CB546CFFCF48E91F700F6FC7C183" +
                        "AC8CC3D3096DD30A35B01F4620A1E3A20D79CD5168544D9E1B7CDF49970E87F1");
    }

    @Test
    public void testWithEog() {
        CryptoHelpers.testAsciiAndHex(instance(), "The quick brown fox jumps over the lazy eog",
                "C8C15D2A0E0DE6E6885E8A7D9B8A9139746DA299AD50158F5FA9EECDDEF744F9" +
                        "1B8B83C617080D77CB4247B1E964C2959C507AB2DB0F1F3BF3E3B299CA00CAE3");
    }
}

