package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL128_4.
 * @author fury
 */
public final class HAVAL128_4Spi extends GenericAdapterSpi {
    public HAVAL128_4Spi() {
        super(new HAVAL128_4());
    }
}
