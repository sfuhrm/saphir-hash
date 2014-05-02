package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for RadioGatun32.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class RadioGatun32Spi extends GenericAdapterSpi {
    public RadioGatun32Spi() {
        super(new RadioGatun32());
    }
}
