package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SIMD384.
 * @author fury
 */
public final class SIMD384Spi extends GenericAdapterSpi {
    public SIMD384Spi() {
        super(new SIMD384());
    }
}
