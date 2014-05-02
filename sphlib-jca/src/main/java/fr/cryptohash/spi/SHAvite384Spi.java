package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHAvite384.
 * @author fury
 */
public final class SHAvite384Spi extends GenericAdapterSpi {
    public SHAvite384Spi() {
        super(new SHAvite384());
    }
}
