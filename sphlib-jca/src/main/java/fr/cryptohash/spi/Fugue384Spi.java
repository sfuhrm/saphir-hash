package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Fugue384.
 * @author fury
 */
public final class Fugue384Spi extends GenericAdapterSpi {
    public Fugue384Spi() {
        super(new Fugue384());
    }
}
