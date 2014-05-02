package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for CubeHash384.
 * @author fury
 */
public final class CubeHash384Spi extends GenericAdapterSpi {
    public CubeHash384Spi() {
        super(new CubeHash384());
    }
}
