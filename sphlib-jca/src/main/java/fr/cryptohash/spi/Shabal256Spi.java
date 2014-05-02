package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Shabal256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Shabal256Spi extends GenericAdapterSpi {
    public Shabal256Spi() {
        super(new Shabal256());
    }
}
