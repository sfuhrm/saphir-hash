package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL128_3.
 * @author fury
 */
public final class HAVAL128_3Spi extends GenericAdapterSpi {
    public HAVAL128_3Spi() {
        super(new HAVAL128_3());
    }
}
