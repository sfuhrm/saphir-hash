package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Fugue256.
 * @author fury
 */
public final class Fugue256Spi extends GenericAdapterSpi {
    public Fugue256Spi() {
        super(new Fugue256());
    }
}
