package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for CubeHash256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class CubeHash256Spi extends GenericAdapterSpi {
    public CubeHash256Spi() {
        super(new CubeHash256());
    }
}
