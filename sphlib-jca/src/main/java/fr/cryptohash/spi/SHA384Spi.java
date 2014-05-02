package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA384.
 * @author fury
 */
public final class SHA384Spi extends GenericAdapterSpi {
    public SHA384Spi() {
        super(new SHA384());
    }
}
