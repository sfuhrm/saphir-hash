package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for ECHO256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class ECHO256Spi extends GenericAdapterSpi {
    public ECHO256Spi() {
        super(new ECHO256());
    }
}
