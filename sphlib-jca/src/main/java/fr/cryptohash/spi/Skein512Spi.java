package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Skein512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Skein512Spi extends GenericAdapterSpi {
    public Skein512Spi() {
        super(new Skein512());
    }
}
