package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Keccak512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Keccak512Spi extends GenericAdapterSpi {
    public Keccak512Spi() {
        super(new Keccak512());
    }
}
