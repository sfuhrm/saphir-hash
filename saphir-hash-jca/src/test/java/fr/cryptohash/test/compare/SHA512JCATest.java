package fr.cryptohash.test.compare;

import fr.cryptohash.test.AbstractCompareToSunJCATest;

/**
 * Test for SHA512.
 * @author Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 */
public class SHA512JCATest extends AbstractCompareToSunJCATest {
    
    @Override
    protected String getMessageDigestName() {
        return "SHA-512";
    }
}
