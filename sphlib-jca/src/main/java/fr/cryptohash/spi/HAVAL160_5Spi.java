package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL160_5.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class HAVAL160_5Spi extends GenericAdapterSpi {
    public HAVAL160_5Spi() {
        super(new HAVAL160_5());
    }
}
