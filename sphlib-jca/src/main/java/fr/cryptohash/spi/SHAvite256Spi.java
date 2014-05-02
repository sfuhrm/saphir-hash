package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHAvite256.
 * @author fury
 */
public final class SHAvite256Spi extends GenericAdapterSpi {
    public SHAvite256Spi() {
        super(new SHAvite256());
    }
}
