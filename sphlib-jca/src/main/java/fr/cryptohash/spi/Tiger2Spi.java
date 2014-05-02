package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Tiger2.
 * @author fury
 */
public final class Tiger2Spi extends GenericAdapterSpi {
    public Tiger2Spi() {
        super(new Tiger2());
    }
}
