package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL256_5.
 * @author fury
 */
public final class HAVAL256_5Spi extends GenericAdapterSpi {
    public HAVAL256_5Spi() {
        super(new HAVAL256_5());
    }
}
