package fr.cryptohash;

import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A JCA provider implementation for SPH-Lib.
 * The provider is called <code>SPH</code> derived from the original 
 * "Projet RNRT SAPHIR" by the french government.
 *
 * @see <a href="http://www.saphir2.com/sphlib/">Original sphlib 3.0 Website</a>
 * @see <a
 * href="http://docs.oracle.com/javase/7/docs/technotes/guides/security/crypto/HowToImplAProvider.html">How
 * to Implement a Provider in the Java Cryptography Architecture</a>
 * @author Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 */
public final class JCAProvider extends Provider {

    /** The provider name as passed to JCA. */
    public final static String PROVIDER_NAME = "SPH";
    
    public JCAProvider() {
        super(PROVIDER_NAME, 3.0, "SPH-Library provider v3.0, implementing "
                + "multiple message digest algorithms.");

        Map<String,String> names = getNames();
        putAll(names);
    }
    
    private static Map<String, String> getNames() {
        Map<String,String> result = new HashMap<String, String>();
        fillNames(result);
        result.putAll(createAliases(result));
        return result;
    }
    
    /** Fills some aliases. */
    private static Map<String,String> createAliases(Map<String, String> map) {
        Map<String, String> aliases = new HashMap<String, String>();
        Pattern pattern = Pattern.compile("([^0-9]*)([0-9]+)");
        for (Map.Entry<String,String> entry : map.entrySet()) {
            Matcher matcher = pattern.matcher(entry.getKey());
            if (matcher.matches()) {
                
                // adds for MessageDigest.SHA512 an alias like MessageDigest.SHA-512
                aliases.put(
                        matcher.group(1)+
                                "-"+
                                matcher.group(2), entry.getValue());
            }
        }
        return aliases;
    }
        
    private static void fillNames(Map<String, String> map) {
        map.put("MessageDigest.BLAKE224", "fr.cryptohash.spi.BLAKE224Spi");
        map.put("MessageDigest.BLAKE256", "fr.cryptohash.spi.BLAKE256Spi");
        map.put("MessageDigest.BLAKE384", "fr.cryptohash.spi.BLAKE384Spi");
        map.put("MessageDigest.BLAKE512", "fr.cryptohash.spi.BLAKE512Spi");
        map.put("MessageDigest.BMW224", "fr.cryptohash.spi.BMW224Spi");
        map.put("MessageDigest.BMW256", "fr.cryptohash.spi.BMW256Spi");
        map.put("MessageDigest.BMW384", "fr.cryptohash.spi.BMW384Spi");
        map.put("MessageDigest.BMW512", "fr.cryptohash.spi.BMW512Spi");
        map.put("MessageDigest.CubeHash224", "fr.cryptohash.spi.CubeHash224Spi");
        map.put("MessageDigest.CubeHash256", "fr.cryptohash.spi.CubeHash256Spi");
        map.put("MessageDigest.CubeHash384", "fr.cryptohash.spi.CubeHash384Spi");
        map.put("MessageDigest.CubeHash512", "fr.cryptohash.spi.CubeHash512Spi");
        map.put("MessageDigest.ECHO224", "fr.cryptohash.spi.ECHO224Spi");
        map.put("MessageDigest.ECHO256", "fr.cryptohash.spi.ECHO256Spi");
        map.put("MessageDigest.ECHO384", "fr.cryptohash.spi.ECHO384Spi");
        map.put("MessageDigest.ECHO512", "fr.cryptohash.spi.ECHO512Spi");
        map.put("MessageDigest.Fugue224", "fr.cryptohash.spi.Fugue224Spi");
        map.put("MessageDigest.Fugue256", "fr.cryptohash.spi.Fugue256Spi");
        map.put("MessageDigest.Fugue384", "fr.cryptohash.spi.Fugue384Spi");
        map.put("MessageDigest.Fugue512", "fr.cryptohash.spi.Fugue512Spi");
        map.put("MessageDigest.Groestl224", "fr.cryptohash.spi.Groestl224Spi");
        map.put("MessageDigest.Groestl256", "fr.cryptohash.spi.Groestl256Spi");
        map.put("MessageDigest.Groestl384", "fr.cryptohash.spi.Groestl384Spi");
        map.put("MessageDigest.Groestl512", "fr.cryptohash.spi.Groestl512Spi");
        map.put("MessageDigest.Hamsi224", "fr.cryptohash.spi.Hamsi224Spi");
        map.put("MessageDigest.Hamsi256", "fr.cryptohash.spi.Hamsi256Spi");
        map.put("MessageDigest.Hamsi384", "fr.cryptohash.spi.Hamsi384Spi");
        map.put("MessageDigest.Hamsi512", "fr.cryptohash.spi.Hamsi512Spi");
        map.put("MessageDigest.HAVAL128_3", "fr.cryptohash.spi.HAVAL128_3Spi");
        map.put("MessageDigest.HAVAL128_4", "fr.cryptohash.spi.HAVAL128_4Spi");
        map.put("MessageDigest.HAVAL128_5", "fr.cryptohash.spi.HAVAL128_5Spi");
        map.put("MessageDigest.HAVAL160_3", "fr.cryptohash.spi.HAVAL160_3Spi");
        map.put("MessageDigest.HAVAL160_4", "fr.cryptohash.spi.HAVAL160_4Spi");
        map.put("MessageDigest.HAVAL160_5", "fr.cryptohash.spi.HAVAL160_5Spi");
        map.put("MessageDigest.HAVAL192_3", "fr.cryptohash.spi.HAVAL192_3Spi");
        map.put("MessageDigest.HAVAL192_4", "fr.cryptohash.spi.HAVAL192_4Spi");
        map.put("MessageDigest.HAVAL192_5", "fr.cryptohash.spi.HAVAL192_5Spi");
        map.put("MessageDigest.HAVAL224_3", "fr.cryptohash.spi.HAVAL224_3Spi");
        map.put("MessageDigest.HAVAL224_4", "fr.cryptohash.spi.HAVAL224_4Spi");
        map.put("MessageDigest.HAVAL224_5", "fr.cryptohash.spi.HAVAL224_5Spi");
        map.put("MessageDigest.HAVAL256_3", "fr.cryptohash.spi.HAVAL256_3Spi");
        map.put("MessageDigest.HAVAL256_4", "fr.cryptohash.spi.HAVAL256_4Spi");
        map.put("MessageDigest.HAVAL256_5", "fr.cryptohash.spi.HAVAL256_5Spi");
        map.put("MessageDigest.HMAC", "fr.cryptohash.spi.HMACSpi");
        map.put("MessageDigest.JH224", "fr.cryptohash.spi.JH224Spi");
        map.put("MessageDigest.JH256", "fr.cryptohash.spi.JH256Spi");
        map.put("MessageDigest.JH384", "fr.cryptohash.spi.JH384Spi");
        map.put("MessageDigest.JH512", "fr.cryptohash.spi.JH512Spi");
        map.put("MessageDigest.Keccak224", "fr.cryptohash.spi.Keccak224Spi");
        map.put("MessageDigest.Keccak256", "fr.cryptohash.spi.Keccak256Spi");
        map.put("MessageDigest.Keccak384", "fr.cryptohash.spi.Keccak384Spi");
        map.put("MessageDigest.Keccak512", "fr.cryptohash.spi.Keccak512Spi");
        map.put("MessageDigest.Luffa224", "fr.cryptohash.spi.Luffa224Spi");
        map.put("MessageDigest.Luffa256", "fr.cryptohash.spi.Luffa256Spi");
        map.put("MessageDigest.Luffa384", "fr.cryptohash.spi.Luffa384Spi");
        map.put("MessageDigest.Luffa512", "fr.cryptohash.spi.Luffa512Spi");
        map.put("MessageDigest.MD2", "fr.cryptohash.spi.MD2Spi");
        map.put("MessageDigest.MD4", "fr.cryptohash.spi.MD4Spi");
        map.put("MessageDigest.MD5", "fr.cryptohash.spi.MD5Spi");
        map.put("MessageDigest.PANAMA", "fr.cryptohash.spi.PANAMASpi");
        map.put("MessageDigest.RadioGatun32", "fr.cryptohash.spi.RadioGatun32Spi");
        map.put("MessageDigest.RadioGatun64", "fr.cryptohash.spi.RadioGatun64Spi");
        map.put("MessageDigest.RIPEMD128", "fr.cryptohash.spi.RIPEMD128Spi");
        map.put("MessageDigest.RIPEMD160", "fr.cryptohash.spi.RIPEMD160Spi");
        map.put("MessageDigest.RIPEMD", "fr.cryptohash.spi.RIPEMDSpi");
        map.put("MessageDigest.SHA0", "fr.cryptohash.spi.SHA0Spi");
        map.put("MessageDigest.SHA", "fr.cryptohash.spi.SHA1Spi");
        map.put("MessageDigest.SHA1", "fr.cryptohash.spi.SHA1Spi");
        map.put("MessageDigest.SHA224", "fr.cryptohash.spi.SHA224Spi");
        map.put("MessageDigest.SHA256", "fr.cryptohash.spi.SHA256Spi");
        map.put("MessageDigest.SHA384", "fr.cryptohash.spi.SHA384Spi");
        map.put("MessageDigest.SHA512", "fr.cryptohash.spi.SHA512Spi");
        map.put("MessageDigest.Shabal192", "fr.cryptohash.spi.Shabal192Spi");
        map.put("MessageDigest.Shabal224", "fr.cryptohash.spi.Shabal224Spi");
        map.put("MessageDigest.Shabal256", "fr.cryptohash.spi.Shabal256Spi");
        map.put("MessageDigest.Shabal384", "fr.cryptohash.spi.Shabal384Spi");
        map.put("MessageDigest.Shabal512", "fr.cryptohash.spi.Shabal512Spi");
        map.put("MessageDigest.ShabalGeneric", "fr.cryptohash.spi.ShabalGenericSpi");
        map.put("MessageDigest.SHAvite224", "fr.cryptohash.spi.SHAvite224Spi");
        map.put("MessageDigest.SHAvite256", "fr.cryptohash.spi.SHAvite256Spi");
        map.put("MessageDigest.SHAvite384", "fr.cryptohash.spi.SHAvite384Spi");
        map.put("MessageDigest.SHAvite512", "fr.cryptohash.spi.SHAvite512Spi");
        map.put("MessageDigest.SIMD224", "fr.cryptohash.spi.SIMD224Spi");
        map.put("MessageDigest.SIMD256", "fr.cryptohash.spi.SIMD256Spi");
        map.put("MessageDigest.SIMD384", "fr.cryptohash.spi.SIMD384Spi");
        map.put("MessageDigest.SIMD512", "fr.cryptohash.spi.SIMD512Spi");
        map.put("MessageDigest.Skein224", "fr.cryptohash.spi.Skein224Spi");
        map.put("MessageDigest.Skein256", "fr.cryptohash.spi.Skein256Spi");
        map.put("MessageDigest.Skein384", "fr.cryptohash.spi.Skein384Spi");
        map.put("MessageDigest.Skein512", "fr.cryptohash.spi.Skein512Spi");
        map.put("MessageDigest.Tiger2", "fr.cryptohash.spi.Tiger2Spi");
        map.put("MessageDigest.Tiger", "fr.cryptohash.spi.TigerSpi");
        map.put("MessageDigest.Whirlpool0", "fr.cryptohash.spi.Whirlpool0Spi");
        map.put("MessageDigest.Whirlpool1", "fr.cryptohash.spi.Whirlpool1Spi");
        map.put("MessageDigest.Whirlpool", "fr.cryptohash.spi.WhirlpoolSpi");        
    }
}
