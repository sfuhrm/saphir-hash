package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Hamsi256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Hamsi256Spi extends GenericAdapterSpi {
    public Hamsi256Spi() {
        super(new Hamsi256());
    }
}
