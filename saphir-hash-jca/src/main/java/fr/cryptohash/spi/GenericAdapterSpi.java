/*
 * Copyright (c) 2014, Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package fr.cryptohash.spi;

import fr.cryptohash.Digest;
import java.security.DigestException;
import java.security.MessageDigestSpi;

/**
 * Generic implementation adapter from JCA MD to Cryptohash MD.
 * @author Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 */
class GenericAdapterSpi extends MessageDigestSpi implements Cloneable {

    /** Crypto hash digest algorithm. */
    private final Digest messageDigest;
    
    /** 
     * Constructor for a new adapter.
     * @param messageDigest the cryptohash digest to adapt to.
     * @throws NullPointerException if messageDigest is {@code null}.
     */
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
