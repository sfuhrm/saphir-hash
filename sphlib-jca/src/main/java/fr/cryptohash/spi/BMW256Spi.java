package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BMW256.
 * @author fury
 */
public final class BMW256Spi extends GenericAdapterSpi {
    public BMW256Spi() {
        super(new BMW256());
    }
}
