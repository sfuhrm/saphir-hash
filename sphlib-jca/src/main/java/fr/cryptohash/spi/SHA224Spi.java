package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA224.
 * @author fury
 */
public final class SHA224Spi extends GenericAdapterSpi {
    public SHA224Spi() {
        super(new SHA224());
    }
}
