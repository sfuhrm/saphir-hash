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
package fr.cryptohash.test.regression;

import org.junit.Test;
import fr.cryptohash.*;
import fr.cryptohash.test.*;

/**
 * JUnit test with example data for Fugue224. * Test data comes from the
 * original sphlib-3.0 file 'TestDigest.java'.
 */
public class Fugue224Test extends AbstractCryptoTest {

    @Test
    public void testWithLength1() {
        CryptoHelpers.testHex(new Fugue224(),"cc","34602ea95b2b9936b9a04ba14b5dc463988df90b1a46f90dd716b60f");
    }

    @Test
    public void testWithLength2() {
        CryptoHelpers.testHex(new Fugue224(),"41fb","17042ef3c9203a838978356cc8debcb90b49a7a3f9862c4c96385e2b");
    }

    @Test
    public void testWithLength3() {
        CryptoHelpers.testHex(new Fugue224(),"1f877c","c4e858280a095030c40cdbe1fd0044632ed28f1b85fbde9b48bc3efd");
    }

    @Test
    public void testWithLength4() {
        CryptoHelpers.testHex(new Fugue224(),"c1ecfdfc","edfdf5a0c8b1ce7c5b7818c670c302745cb61fd4468c04bf36644497");
    }

    @Test
    public void testWithLength5() {
        CryptoHelpers.testHex(new Fugue224(),"21f134ac57","b24848f32ac54150b4f616d12870039db2fdf026b7240edf1846fed1");
    }

    @Test
    public void testWithLength6() {
        CryptoHelpers.testHex(new Fugue224(),"c6f50bb74e29","74b3eaf5370935cc997df0ff6b196906f582a951b546a3d38710e3c5");
    }

    @Test
    public void testWithLength7() {
        CryptoHelpers.testHex(new Fugue224(),"119713cc83eeef","110cf2d9f57c14c0baaeaa2ed9b0162fbd0822a8604d53cdb8f710a6");
    }

    @Test
    public void testWithLength8() {
        CryptoHelpers.testHex(new Fugue224(),"4a4f202484512526","60df1c33c1be7812e229ec0cea34cdc5293030cc65178a110baaa52f");
    }

    @Test
    public void testWithLength9() {
        CryptoHelpers.testHex(new Fugue224(),"1f66ab4185ed9b6375","a30765b87a69e56cb02f52802503d90ea23c37bb57a3dd3f9a6ea9df");
    }

    @Test
    public void testWithLength10() {
        CryptoHelpers.testHex(new Fugue224(),"eed7422227613b6f53c9","d1644b980cf16d6521bc708ac8968e746786ad310e6a62b17f43cb8d");
    }

    @Test
    public void testWithLength11() {
        CryptoHelpers.testHex(new Fugue224(),"eaeed5cdffd89dece455f1","cb08ea526c9c09a9d00324814606bf2f39af42e30e7c3b7f928b5612");
    }

    @Test
    public void testWithLength12() {
        CryptoHelpers.testHex(new Fugue224(),"5be43c90f22902e4fe8ed2d3","9a1c402f1341196352ee4da65ffcbb533536bfc5707e14787f6998bf");
    }

    @Test
    public void testWithLength13() {
        CryptoHelpers.testHex(new Fugue224(),"a746273228122f381c3b46e4f1","14e33b0f2de5276187769bfc3fd5b2b38cc39294a171e1234af56bd2");
    }

    @Test
    public void testWithLength14() {
        CryptoHelpers.testHex(new Fugue224(),"3c5871cd619c69a63b540eb5a625","e00371eb6928b1ec78a09fd9baa2dc17191ee8d264ccf22e507692f4");
    }

    @Test
    public void testWithLength15() {
        CryptoHelpers.testHex(new Fugue224(),"fa22874bcc068879e8ef11a69f0722","61f80d7464346f7bc9ed8a6b514c326e7c7ba9ed2139c3d0c301782f");
    }

    @Test
    public void testWithLength16() {
        CryptoHelpers.testHex(new Fugue224(),"52a608ab21ccdd8a4457a57ede782176","a75d1c8177dce2df14a9fefa25be85fe9a810e665816beb013268fcb");
    }
}
