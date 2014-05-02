package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for RadioGatun64.
 * @author fury
 */
public final class RadioGatun64Spi extends GenericAdapterSpi {
    public RadioGatun64Spi() {
        super(new RadioGatun64());
    }
}
