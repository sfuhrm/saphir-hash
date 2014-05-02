package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SIMD224.
 * @author fury
 */
public final class SIMD224Spi extends GenericAdapterSpi {
    public SIMD224Spi() {
        super(new SIMD224());
    }
}
