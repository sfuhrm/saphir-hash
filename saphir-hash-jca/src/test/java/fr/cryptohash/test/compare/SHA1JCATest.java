package fr.cryptohash.test.compare;

import fr.cryptohash.test.AbstractCompareToSunJCATest;

/**
 * Test for SHA1.
 * 
 * Note that in fact "SHA" seems to refer to SHA-0, but SUN thinks
 * SHA is SHA-1 (the corrected version).
 * @see <a href="http://en.wikipedia.org/wiki/Secure_Hash_Algorithm">Secure Hash Algorithm</a>
 * @author Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 */
public class SHA1JCATest extends AbstractCompareToSunJCATest {
    
    @Override
    protected String getMessageDigestName() {
        return "SHA";
    }
}
