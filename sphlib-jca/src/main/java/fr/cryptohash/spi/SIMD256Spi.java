package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SIMD256.
 * @author fury
 */
public final class SIMD256Spi extends GenericAdapterSpi {
    public SIMD256Spi() {
        super(new SIMD256());
    }
}
