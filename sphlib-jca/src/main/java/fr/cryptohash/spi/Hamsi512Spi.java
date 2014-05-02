package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Hamsi512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Hamsi512Spi extends GenericAdapterSpi {
    public Hamsi512Spi() {
        super(new Hamsi512());
    }
}
