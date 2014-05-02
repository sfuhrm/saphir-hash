package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SIMD512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SIMD512Spi extends GenericAdapterSpi {
    public SIMD512Spi() {
        super(new SIMD512());
    }
}
