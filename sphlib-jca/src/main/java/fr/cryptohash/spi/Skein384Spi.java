package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Skein384.
 * @author fury
 */
public final class Skein384Spi extends GenericAdapterSpi {
    public Skein384Spi() {
        super(new Skein384());
    }
}
