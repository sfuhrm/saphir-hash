package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHAvite512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SHAvite512Spi extends GenericAdapterSpi {
    public SHAvite512Spi() {
        super(new SHAvite512());
    }
}
