package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Keccak256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Keccak256Spi extends GenericAdapterSpi {
    public Keccak256Spi() {
        super(new Keccak256());
    }
}
