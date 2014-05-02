package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL224_3.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class HAVAL224_3Spi extends GenericAdapterSpi {
    public HAVAL224_3Spi() {
        super(new HAVAL224_3());
    }
}
