package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SHA512Spi extends GenericAdapterSpi {
    public SHA512Spi() {
        super(new SHA512());
    }
}
