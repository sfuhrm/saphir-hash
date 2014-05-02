package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BLAKE384.
 * @author fury
 */
public final class BLAKE384Spi extends GenericAdapterSpi {
    public BLAKE384Spi() {
        super(new BLAKE384());
    }
}
