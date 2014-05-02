package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Groestl224.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Groestl224Spi extends GenericAdapterSpi {
    public Groestl224Spi() {
        super(new Groestl224());
    }
}
