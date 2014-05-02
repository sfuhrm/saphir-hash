package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL192_3.
 * @author fury
 */
public final class HAVAL192_3Spi extends GenericAdapterSpi {
    public HAVAL192_3Spi() {
        super(new HAVAL192_3());
    }
}
