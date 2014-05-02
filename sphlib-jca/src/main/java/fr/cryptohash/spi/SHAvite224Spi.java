package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHAvite224.
 * @author fury
 */
public final class SHAvite224Spi extends GenericAdapterSpi {
    public SHAvite224Spi() {
        super(new SHAvite224());
    }
}
