package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for MD4.
 * @author fury
 */
public final class MD4Spi extends GenericAdapterSpi {
    public MD4Spi() {
        super(new MD4());
    }
}
