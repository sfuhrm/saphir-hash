package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Shabal224.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Shabal224Spi extends GenericAdapterSpi {
    public Shabal224Spi() {
        super(new Shabal224());
    }
}
