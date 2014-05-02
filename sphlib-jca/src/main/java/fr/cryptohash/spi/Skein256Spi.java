package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Skein256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Skein256Spi extends GenericAdapterSpi {
    public Skein256Spi() {
        super(new Skein256());
    }
}
