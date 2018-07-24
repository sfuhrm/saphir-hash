package fr.cryptohash.test.compare;

import fr.cryptohash.test.AbstractCompareToSunJCATest;

/**
 * Test for MD2.
 * @author Stephan Fuhrmann &lt;s@sfuhrm.de&gt;
 */
public class MD2JCATest extends AbstractCompareToSunJCATest {

    @Override
    protected String getMessageDigestName() {
        return "MD2";
    }
}
