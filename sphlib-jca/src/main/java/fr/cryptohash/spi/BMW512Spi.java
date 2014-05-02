package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BMW512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class BMW512Spi extends GenericAdapterSpi {
    public BMW512Spi() {
        super(new BMW512());
    }
}
