package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for RadioGatun32.
 * @author fury
 */
public final class RadioGatun32Spi extends GenericAdapterSpi {
    public RadioGatun32Spi() {
        super(new RadioGatun32());
    }
}
