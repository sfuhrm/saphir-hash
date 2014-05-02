package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for PANAMA.
 * @author fury
 */
public final class PANAMASpi extends GenericAdapterSpi {
    public PANAMASpi() {
        super(new PANAMA());
    }
}
