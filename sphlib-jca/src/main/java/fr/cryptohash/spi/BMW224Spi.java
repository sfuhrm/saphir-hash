package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BMW224.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class BMW224Spi extends GenericAdapterSpi {
    public BMW224Spi() {
        super(new BMW224());
    }
}
