package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL256_3.
 * @author fury
 */
public final class HAVAL256_3Spi extends GenericAdapterSpi {
    public HAVAL256_3Spi() {
        super(new HAVAL256_3());
    }
}
