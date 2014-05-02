package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BLAKE512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class BLAKE512Spi extends GenericAdapterSpi {
    public BLAKE512Spi() {
        super(new BLAKE512());
    }
}
