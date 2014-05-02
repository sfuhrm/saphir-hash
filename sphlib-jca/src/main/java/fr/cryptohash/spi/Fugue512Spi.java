package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Fugue512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Fugue512Spi extends GenericAdapterSpi {
    public Fugue512Spi() {
        super(new Fugue512());
    }
}
