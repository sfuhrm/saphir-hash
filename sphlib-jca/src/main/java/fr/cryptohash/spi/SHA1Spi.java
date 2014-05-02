package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA1.
 * @author fury
 */
public final class SHA1Spi extends GenericAdapterSpi {
    public SHA1Spi() {
        super(new SHA1());
    }
}
