package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Whirlpool.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class WhirlpoolSpi extends GenericAdapterSpi {
    public WhirlpoolSpi() {
        super(new Whirlpool());
    }
}
