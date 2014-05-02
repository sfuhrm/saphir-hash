package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Fugue256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Fugue256Spi extends GenericAdapterSpi {
    public Fugue256Spi() {
        super(new Fugue256());
    }
}
