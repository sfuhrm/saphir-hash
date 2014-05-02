package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for Shabal384.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class Shabal384Spi extends GenericAdapterSpi {
    public Shabal384Spi() {
        super(new Shabal384());
    }
}
