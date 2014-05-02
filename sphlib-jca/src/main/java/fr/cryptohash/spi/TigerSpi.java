package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Tiger.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class TigerSpi extends GenericAdapterSpi {
    public TigerSpi() {
        super(new Tiger());
    }
}
