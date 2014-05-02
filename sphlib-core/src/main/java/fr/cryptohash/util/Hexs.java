/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.cryptohash.util;

/**
 * Hexadecimal utils.
 * @author Stephan Fuhrmann
 */
public final class Hexs {
    
    private Hexs() {
        // no instance
    }
    
    final private static char[] hexArray = "0123456789ABCDEF".toCharArray();

    /** Converts bytes to a hex String. 
     * @param bytes the input bytes to convert.
     * @return hexadecimal chars (upper case) representing the input.
     * @see #hexArray
     */
    public static String bytesToHexString(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
    
    /** Converts a hex String to bytes. 
     * @param str a hexadecimal String.
     * @return the parsed bytes.
     * @throws NumberFormatException if the {@code String}
     * does not contain a parsable {@code int}.
     */
    public static byte[] hexStringToBytes(String str) {
        int blen = str.length() / 2;
        byte[] buf = new byte[blen];
        for (int i = 0; i < blen; i++) {
            String bs = str.substring(i * 2, i * 2 + 2);
            buf[i] = (byte) Integer.parseInt(bs, 16);
        }
        return buf;
    }
}
