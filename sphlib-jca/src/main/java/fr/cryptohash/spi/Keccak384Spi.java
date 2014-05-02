package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Keccak384.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Keccak384Spi extends GenericAdapterSpi {
    public Keccak384Spi() {
        super(new Keccak384());
    }
}
