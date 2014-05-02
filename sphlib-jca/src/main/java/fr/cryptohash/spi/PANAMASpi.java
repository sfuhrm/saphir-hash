package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for PANAMA.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class PANAMASpi extends GenericAdapterSpi {
    public PANAMASpi() {
        super(new PANAMA());
    }
}
