package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Keccak224.
 * @author fury
 */
public final class Keccak224Spi extends GenericAdapterSpi {
    public Keccak224Spi() {
        super(new Keccak224());
    }
}
