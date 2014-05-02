package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Fugue224.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Fugue224Spi extends GenericAdapterSpi {
    public Fugue224Spi() {
        super(new Fugue224());
    }
}
