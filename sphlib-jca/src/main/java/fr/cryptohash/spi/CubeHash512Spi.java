package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for CubeHash512.
 * @author fury
 */
public final class CubeHash512Spi extends GenericAdapterSpi {
    public CubeHash512Spi() {
        super(new CubeHash512());
    }
}
