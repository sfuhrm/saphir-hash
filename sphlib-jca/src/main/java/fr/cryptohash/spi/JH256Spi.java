package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for JH256.
 * @author fury
 */
public final class JH256Spi extends GenericAdapterSpi {
    public JH256Spi() {
        super(new JH256());
    }
}
