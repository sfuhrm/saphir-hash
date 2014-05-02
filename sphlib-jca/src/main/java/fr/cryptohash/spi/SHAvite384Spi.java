package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHAvite384.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SHAvite384Spi extends GenericAdapterSpi {
    public SHAvite384Spi() {
        super(new SHAvite384());
    }
}
