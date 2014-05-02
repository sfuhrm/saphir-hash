package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Groestl512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Groestl512Spi extends GenericAdapterSpi {
    public Groestl512Spi() {
        super(new Groestl512());
    }
}
