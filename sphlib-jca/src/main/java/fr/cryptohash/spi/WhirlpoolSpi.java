package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Whirlpool.
 * @author fury
 */
public final class WhirlpoolSpi extends GenericAdapterSpi {
    public WhirlpoolSpi() {
        super(new Whirlpool());
    }
}
