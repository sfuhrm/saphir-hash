package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Hamsi224.
 * @author fury
 */
public final class Hamsi224Spi extends GenericAdapterSpi {
    public Hamsi224Spi() {
        super(new Hamsi224());
    }
}
