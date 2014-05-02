package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for SHAvite256.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class SHAvite256Spi extends GenericAdapterSpi {
    public SHAvite256Spi() {
        super(new SHAvite256());
    }
}
