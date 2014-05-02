package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Whirlpool1.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Whirlpool1Spi extends GenericAdapterSpi {
    public Whirlpool1Spi() {
        super(new Whirlpool1());
    }
}
