package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA0.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SHA0Spi extends GenericAdapterSpi {
    public SHA0Spi() {
        super(new SHA0());
    }
}
