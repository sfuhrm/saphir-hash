package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL160_3.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class HAVAL160_3Spi extends GenericAdapterSpi {
    public HAVAL160_3Spi() {
        super(new HAVAL160_3());
    }
}
