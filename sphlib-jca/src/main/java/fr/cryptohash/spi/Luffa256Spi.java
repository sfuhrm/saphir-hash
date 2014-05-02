package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Luffa256.
 * @author fury
 */
public final class Luffa256Spi extends GenericAdapterSpi {
    public Luffa256Spi() {
        super(new Luffa256());
    }
}
