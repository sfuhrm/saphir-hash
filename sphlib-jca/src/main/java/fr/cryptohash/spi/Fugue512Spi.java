package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Fugue512.
 * @author fury
 */
public final class Fugue512Spi extends GenericAdapterSpi {
    public Fugue512Spi() {
        super(new Fugue512());
    }
}
