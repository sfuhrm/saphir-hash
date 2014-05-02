package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL160_4.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class HAVAL160_4Spi extends GenericAdapterSpi {
    public HAVAL160_4Spi() {
        super(new HAVAL160_4());
    }
}
