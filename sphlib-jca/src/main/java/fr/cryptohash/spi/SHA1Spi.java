package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA1.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SHA1Spi extends GenericAdapterSpi {
    public SHA1Spi() {
        super(new SHA1());
    }
}
