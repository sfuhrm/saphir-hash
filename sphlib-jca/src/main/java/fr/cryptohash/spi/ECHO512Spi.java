package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for ECHO512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class ECHO512Spi extends GenericAdapterSpi {
    public ECHO512Spi() {
        super(new ECHO512());
    }
}
