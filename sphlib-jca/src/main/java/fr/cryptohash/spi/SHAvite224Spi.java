package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHAvite224.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SHAvite224Spi extends GenericAdapterSpi {
    public SHAvite224Spi() {
        super(new SHAvite224());
    }
}
