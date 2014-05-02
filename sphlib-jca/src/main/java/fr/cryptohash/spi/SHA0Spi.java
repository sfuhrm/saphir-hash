package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA0.
 * @author fury
 */
public final class SHA0Spi extends GenericAdapterSpi {
    public SHA0Spi() {
        super(new SHA0());
    }
}
