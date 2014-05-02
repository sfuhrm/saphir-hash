package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL224_4.
 * @author fury
 */
public final class HAVAL224_4Spi extends GenericAdapterSpi {
    public HAVAL224_4Spi() {
        super(new HAVAL224_4());
    }
}
