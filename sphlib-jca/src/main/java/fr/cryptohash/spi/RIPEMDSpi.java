package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for RIPEMD.
 * @author fury
 */
public final class RIPEMDSpi extends GenericAdapterSpi {
    public RIPEMDSpi() {
        super(new RIPEMD());
    }
}
