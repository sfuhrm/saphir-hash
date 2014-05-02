package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL160_4.
 * @author fury
 */
public final class HAVAL160_4Spi extends GenericAdapterSpi {
    public HAVAL160_4Spi() {
        super(new HAVAL160_4());
    }
}
