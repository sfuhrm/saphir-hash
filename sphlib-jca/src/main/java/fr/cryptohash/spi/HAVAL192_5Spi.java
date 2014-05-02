package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL192_5.
 * @author fury
 */
public final class HAVAL192_5Spi extends GenericAdapterSpi {
    public HAVAL192_5Spi() {
        super(new HAVAL192_5());
    }
}
