package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Skein256.
 * @author fury
 */
public final class Skein256Spi extends GenericAdapterSpi {
    public Skein256Spi() {
        super(new Skein256());
    }
}
