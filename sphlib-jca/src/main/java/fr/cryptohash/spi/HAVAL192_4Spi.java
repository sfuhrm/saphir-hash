package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for HAVAL192_4.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class HAVAL192_4Spi extends GenericAdapterSpi {
    public HAVAL192_4Spi() {
        super(new HAVAL192_4());
    }
}
