package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Tiger.
 * @author fury
 */
public final class TigerSpi extends GenericAdapterSpi {
    public TigerSpi() {
        super(new Tiger());
    }
}
