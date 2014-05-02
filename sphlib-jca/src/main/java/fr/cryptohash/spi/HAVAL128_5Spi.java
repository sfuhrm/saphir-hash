package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL128_5.
 * @author fury
 */
public final class HAVAL128_5Spi extends GenericAdapterSpi {
    public HAVAL128_5Spi() {
        super(new HAVAL128_5());
    }
}
