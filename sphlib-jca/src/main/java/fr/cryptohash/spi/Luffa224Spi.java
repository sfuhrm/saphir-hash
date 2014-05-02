package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Luffa224.
 * @author fury
 */
public final class Luffa224Spi extends GenericAdapterSpi {
    public Luffa224Spi() {
        super(new Luffa224());
    }
}
