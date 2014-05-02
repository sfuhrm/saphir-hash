package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Fugue384.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Fugue384Spi extends GenericAdapterSpi {
    public Fugue384Spi() {
        super(new Fugue384());
    }
}
