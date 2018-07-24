package fr.cryptohash.test.compare;

import fr.cryptohash.test.AbstractCompareToSunJCATest;

/**
 * Test for SHA256.
 * @author Stephan Fuhrmann &lt;s@sfuhrm.de&gt;
 */
public class SHA256JCATest extends AbstractCompareToSunJCATest {

    @Override
    protected String getMessageDigestName() {
        return "SHA-256";
    }
}
