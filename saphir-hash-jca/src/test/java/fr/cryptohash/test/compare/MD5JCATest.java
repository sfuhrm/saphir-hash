package fr.cryptohash.test.compare;

import fr.cryptohash.test.AbstractCompareToSunJCATest;

/**
 * Test for MD5.
 * @author Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 */
public class MD5JCATest extends AbstractCompareToSunJCATest {
    
    @Override
    protected String getMessageDigestName() {
        return "MD5";
    }
}
