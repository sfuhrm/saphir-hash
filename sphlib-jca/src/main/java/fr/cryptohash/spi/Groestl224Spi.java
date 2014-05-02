package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Groestl224.
 * @author fury
 */
public final class Groestl224Spi extends GenericAdapterSpi {
    public Groestl224Spi() {
        super(new Groestl224());
    }
}
