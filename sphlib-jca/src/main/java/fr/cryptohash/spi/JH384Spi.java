package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for JH384.
 * @author fury
 */
public final class JH384Spi extends GenericAdapterSpi {
    public JH384Spi() {
        super(new JH384());
    }
}
