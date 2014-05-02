package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for ECHO224.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class ECHO224Spi extends GenericAdapterSpi {
    public ECHO224Spi() {
        super(new ECHO224());
    }
}
