package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for ECHO384.
 * @author fury
 */
public final class ECHO384Spi extends GenericAdapterSpi {
    public ECHO384Spi() {
        super(new ECHO384());
    }
}
