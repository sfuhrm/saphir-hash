package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Shabal192.
 * @author fury
 */
public final class Shabal192Spi extends GenericAdapterSpi {
    public Shabal192Spi() {
        super(new Shabal192());
    }
}
