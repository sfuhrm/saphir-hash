package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Whirlpool0.
 * @author fury
 */
public final class Whirlpool0Spi extends GenericAdapterSpi {
    public Whirlpool0Spi() {
        super(new Whirlpool0());
    }
}
