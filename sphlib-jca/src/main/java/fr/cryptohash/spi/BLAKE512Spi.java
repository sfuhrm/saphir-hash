package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BLAKE512.
 * @author fury
 */
public final class BLAKE512Spi extends GenericAdapterSpi {
    public BLAKE512Spi() {
        super(new BLAKE512());
    }
}
