package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Shabal512.
 * @author fury
 */
public final class Shabal512Spi extends GenericAdapterSpi {
    public Shabal512Spi() {
        super(new Shabal512());
    }
}
