package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL256_4.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class HAVAL256_4Spi extends GenericAdapterSpi {
    public HAVAL256_4Spi() {
        super(new HAVAL256_4());
    }
}
