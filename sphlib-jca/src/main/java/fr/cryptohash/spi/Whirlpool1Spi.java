package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Whirlpool1.
 * @author fury
 */
public final class Whirlpool1Spi extends GenericAdapterSpi {
    public Whirlpool1Spi() {
        super(new Whirlpool1());
    }
}
