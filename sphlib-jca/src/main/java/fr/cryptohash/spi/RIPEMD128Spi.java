package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for RIPEMD128.
 * @author fury
 */
public final class RIPEMD128Spi extends GenericAdapterSpi {
    public RIPEMD128Spi() {
        super(new RIPEMD128());
    }
}
