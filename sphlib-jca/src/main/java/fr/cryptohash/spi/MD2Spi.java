package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for MD2.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class MD2Spi extends GenericAdapterSpi {
    public MD2Spi() {
        super(new MD2());
    }
}
