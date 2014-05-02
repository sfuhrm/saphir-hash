/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.cryptohash.spi;

import fr.cryptohash.Digest;
import java.security.DigestException;
import java.security.MessageDigestSpi;

/**
 * Generic implementation adapter from JCA MD to Cryptohash MD.
 * @author Stephan Fuhrmann <stephan@tynne.de>
 */
class GenericAdapterSpi extends MessageDigestSpi implements Cloneable {

    /** Crypto hash digest algorithm. */
    private final Digest messageDigest;
    
    protected GenericAdapterSpi(Digest messageDigest) {
        if (messageDigest == null)
            throw new NullPointerException("messageDigest is null");
        this.messageDigest = messageDigest;
    }
    
    @Override
    protected int engineGetDigestLength() {
        return messageDigest.getDigestLength();
    }
    
    @Override
    protected final void engineUpdate(byte input) {
        messageDigest.update(input);
    }

    @Override
    protected final void engineUpdate(byte[] input, int offset, int len) {
        messageDigest.update(input, offset, len);
    }

    @Override
    protected final byte[] engineDigest() {
        return messageDigest.digest();
    }
    
    @Override
    protected int engineDigest(byte[] buf, int offset, int len)
                                                throws DigestException {
        return messageDigest.digest(buf, len, len);
    }    

    @Override
    protected final void engineReset() {
        messageDigest.reset();
    }
    
    /**
     * Returns a clone if the implementation is cloneable.
     *
     * @return a clone if the implementation is cloneable.
     *
     * @exception CloneNotSupportedException if this is called on an
     * implementation that does not support {@code Cloneable}.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        if (this instanceof Cloneable) {
            return super.clone();
        } else {
            throw new CloneNotSupportedException();
        }
    }    
}
