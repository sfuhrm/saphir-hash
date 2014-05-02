package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Shabal224.
 * @author fury
 */
public final class Shabal224Spi extends GenericAdapterSpi {
    public Shabal224Spi() {
        super(new Shabal224());
    }
}
