package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Groestl384.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Groestl384Spi extends GenericAdapterSpi {
    public Groestl384Spi() {
        super(new Groestl384());
    }
}
