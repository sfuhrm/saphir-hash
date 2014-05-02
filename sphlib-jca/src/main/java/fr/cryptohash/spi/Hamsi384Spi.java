package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Hamsi384.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Hamsi384Spi extends GenericAdapterSpi {
    public Hamsi384Spi() {
        super(new Hamsi384());
    }
}
