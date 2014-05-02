package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for ECHO512.
 * @author fury
 */
public final class ECHO512Spi extends GenericAdapterSpi {
    public ECHO512Spi() {
        super(new ECHO512());
    }
}
