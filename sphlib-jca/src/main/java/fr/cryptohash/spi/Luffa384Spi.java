package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Luffa384.
 * @author fury
 */
public final class Luffa384Spi extends GenericAdapterSpi {
    public Luffa384Spi() {
        super(new Luffa384());
    }
}
