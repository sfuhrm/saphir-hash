package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for RIPEMD128.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class RIPEMD128Spi extends GenericAdapterSpi {
    public RIPEMD128Spi() {
        super(new RIPEMD128());
    }
}
