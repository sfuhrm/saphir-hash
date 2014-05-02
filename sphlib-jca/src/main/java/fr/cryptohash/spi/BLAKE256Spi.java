package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BLAKE256.
 * @author fury
 */
public final class BLAKE256Spi extends GenericAdapterSpi {
    public BLAKE256Spi() {
        super(new BLAKE256());
    }
}
