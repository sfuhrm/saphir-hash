package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Groestl256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Groestl256Spi extends GenericAdapterSpi {
    public Groestl256Spi() {
        super(new Groestl256());
    }
}
