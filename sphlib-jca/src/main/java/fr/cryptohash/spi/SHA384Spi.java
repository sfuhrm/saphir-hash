package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHA384.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SHA384Spi extends GenericAdapterSpi {
    public SHA384Spi() {
        super(new SHA384());
    }
}
