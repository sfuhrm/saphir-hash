package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Skein224.
 * @author fury
 */
public final class Skein224Spi extends GenericAdapterSpi {
    public Skein224Spi() {
        super(new Skein224());
    }
}
