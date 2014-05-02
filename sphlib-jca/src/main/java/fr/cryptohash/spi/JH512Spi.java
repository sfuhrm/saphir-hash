package fr.cryptohash.spi;

import fr.cryptohash.*;

/**
 * Implementation for JH512.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
public final class JH512Spi extends GenericAdapterSpi {
    public JH512Spi() {
        super(new JH512());
    }
}
