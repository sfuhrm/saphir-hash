package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for RIPEMD160.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class RIPEMD160Spi extends GenericAdapterSpi {
    public RIPEMD160Spi() {
        super(new RIPEMD160());
    }
}
