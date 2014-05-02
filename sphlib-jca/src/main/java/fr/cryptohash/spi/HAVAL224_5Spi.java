package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL224_5.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class HAVAL224_5Spi extends GenericAdapterSpi {
    public HAVAL224_5Spi() {
        super(new HAVAL224_5());
    }
}
