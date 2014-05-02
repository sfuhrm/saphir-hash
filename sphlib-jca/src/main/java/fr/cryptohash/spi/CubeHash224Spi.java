package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for CubeHash224.
 * @author fury
 */
public final class CubeHash224Spi extends GenericAdapterSpi {
    public CubeHash224Spi() {
        super(new CubeHash224());
    }
}
