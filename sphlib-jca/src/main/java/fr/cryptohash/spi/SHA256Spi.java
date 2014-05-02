package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA256.
 * @author fury
 */
public final class SHA256Spi extends GenericAdapterSpi {
    public SHA256Spi() {
        super(new SHA256());
    }
}
