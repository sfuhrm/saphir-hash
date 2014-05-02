package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for MD5.
 * @author fury
 */
public final class MD5Spi extends GenericAdapterSpi {
    public MD5Spi() {
        super(new MD5());
    }
}
