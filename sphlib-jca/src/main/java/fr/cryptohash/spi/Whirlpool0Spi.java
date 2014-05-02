package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Whirlpool0.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Whirlpool0Spi extends GenericAdapterSpi {
    public Whirlpool0Spi() {
        super(new Whirlpool0());
    }
}
