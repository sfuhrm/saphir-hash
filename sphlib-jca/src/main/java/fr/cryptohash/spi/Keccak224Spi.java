package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Keccak224.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Keccak224Spi extends GenericAdapterSpi {
    public Keccak224Spi() {
        super(new Keccak224());
    }
}
