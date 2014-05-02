package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Skein512.
 * @author fury
 */
public final class Skein512Spi extends GenericAdapterSpi {
    public Skein512Spi() {
        super(new Skein512());
    }
}
