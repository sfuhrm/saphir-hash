package fr.cryptohash.utils;

import fr.cryptohash.util.Hexs;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit test for {@link Hexs}.
 * */
public class HexsTest {

    @Test
    public void bytesToHexStringWith0() {
        assertEquals("", Hexs.bytesToHexString(new byte[0]));
    }

    @Test
    public void bytesToHexStringWith2() {
        assertEquals("12", Hexs.bytesToHexString(new byte[] {(byte)0x12}));
        assertEquals("C2", Hexs.bytesToHexString(new byte[] {(byte)0xc2}));
    }

    @Test
    public void bytesToHexStringWith4() {
        assertEquals("3412", Hexs.bytesToHexString(new byte[] {(byte)0x34, (byte)0x12}));
        assertEquals("81C2", Hexs.bytesToHexString(new byte[] {(byte)0x81, (byte)0xc2}));
    }

    @Test
    public void hexStringToBytesWith0() {
        assertArrayEquals(new byte[0], Hexs.hexStringToBytes(""));
    }

    @Test
    public void hexStringToBytesWith1() {
        assertArrayEquals(new byte[] {0x12}, Hexs.hexStringToBytes("12"));
        assertArrayEquals(new byte[] {(byte)0x82}, Hexs.hexStringToBytes("82"));
    }

    @Test
    public void hexStringToBytesWith2() {
        assertArrayEquals(new byte[] {0x12, 0x00}, Hexs.hexStringToBytes("1200"));
        assertArrayEquals(new byte[] {(byte)0x82, (byte)0x12}, Hexs.hexStringToBytes("8212"));
    }
}

