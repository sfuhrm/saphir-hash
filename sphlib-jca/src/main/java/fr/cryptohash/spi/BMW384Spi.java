package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for BMW384.
 * @author fury
 */
public final class BMW384Spi extends GenericAdapterSpi {
    public BMW384Spi() {
        super(new BMW384());
    }
}
