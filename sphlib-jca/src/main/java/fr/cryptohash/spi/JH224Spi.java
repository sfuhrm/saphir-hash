package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for JH224.
 * @author fury
 */
public final class JH224Spi extends GenericAdapterSpi {
    public JH224Spi() {
        super(new JH224());
    }
}
