package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BLAKE224.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class BLAKE224Spi extends GenericAdapterSpi {
    public BLAKE224Spi() {
        super(new BLAKE224());
    }
}
