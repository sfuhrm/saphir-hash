/*
 * Copyright (c) 2014, Stephan Fuhrmann &lt;s@sfuhrm.de&gt;
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
package fr.cryptohash.test;

import fr.cryptohash.Digest;
import fr.cryptohash.DigestEngine;
import fr.cryptohash.util.Hexs;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * Generic test utility class that gets extended from the digest test
 * classes.
 * @author Stephan Fuhrmann &lt;s@sfuhrm.de&gt;
 */
public abstract class AbstractCryptoTest<T extends Digest> {

    protected Class<T> clazz;
    protected T instance;

    protected AbstractCryptoTest(Class<T> inClass) {
        this.clazz = inClass;
    }

    @Before
    public void before() throws IllegalAccessException, InstantiationException {
        instance = clazz.newInstance();
    }

    public T instance() {
        return instance;
    }

    @Test
    public void testInstance() {
        assertNotNull(instance());
    }

    @Test
    public void testDigestWithEmpty() {
        T myInstance = instance();
        byte[] data = myInstance.digest();
        assertNotNull(data);
        assertTrue("data size bigger 0", data.length > 0);
        assertEquals(myInstance.getDigestLength(), data.length);
    }

    @Test
    public void testCopy() {
        T myInstance = instance();
        Digest copy = myInstance.copy();
        assertNotNull(copy);
        assertNotSame(myInstance, copy);
        assertTrue("copy is instance", clazz.isInstance(copy));
    }

    @Test
    public void testToString() {
        T myInstance = instance();
        String str = myInstance.toString();
        assertNotNull(str);
        assertTrue("toString() is empty", str.length() > 0);
    }
}