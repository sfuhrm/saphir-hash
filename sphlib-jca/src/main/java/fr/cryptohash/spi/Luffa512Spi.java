package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Luffa512.
 * @author fury
 */
public final class Luffa512Spi extends GenericAdapterSpi {
    public Luffa512Spi() {
        super(new Luffa512());
    }
}
