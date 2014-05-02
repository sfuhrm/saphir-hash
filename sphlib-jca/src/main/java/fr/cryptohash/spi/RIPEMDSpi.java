package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for RIPEMD.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class RIPEMDSpi extends GenericAdapterSpi {
    public RIPEMDSpi() {
        super(new RIPEMD());
    }
}
