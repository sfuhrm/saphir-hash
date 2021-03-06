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

import fr.cryptohash.Fugue512;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for Fugue512. * Test data comes from the
 * original sphlib-3.0 file 'TestDigest.java'.
 */
public class Fugue512Test extends AbstractCryptoTest<Fugue512> {
    public Fugue512Test() {
        super(Fugue512.class);
    }

    @Test
    public void testWithLength1() {
        CryptoHelpers.testHex(instance(), "cc", "2ef4115479b060fc64a4d6f6913a39e326afc81deb4e39d71c573df5ed132200e7c784bab1804930cad16847f16cbda59a865bbd928ebc17d33689fef233c10b");
    }

    @Test
    public void testWithLength2() {
        CryptoHelpers.testHex(instance(), "41fb", "f42d0817ef7fe50afec87cdd1b934d16bfb575df4feda7e65d09b592b0318920d9b1d1f89bdff9aa4c6ab5f058d692ab0d5d431e860f6ac6be70f47ab124abd8");
    }

    @Test
    public void testWithLength3() {
        CryptoHelpers.testHex(instance(), "1f877c", "deea1a90bf692f13974943e0ceeb551cf94903bde784278fb52a2b61750d093ab4eb662edb36ffc3c184ce753621173928e5fa58f7df7449d8888a56f238d936");
    }

    @Test
    public void testWithLength4() {
        CryptoHelpers.testHex(instance(), "c1ecfdfc", "016a26bed81a1af68dc64e4089878b89c660ac5faa61fcf9f4eda88b5fd62e4786b66e295b94992887e0bb95bf802c4c35aada89d5c2f77ecc4d6fc7546114b6");
    }

    @Test
    public void testWithLength5() {
        CryptoHelpers.testHex(instance(), "21f134ac57", "dfed15e291c38285ab66277bd772726f63c07080111571932006c3ab7b448414cc13402d3ad25eb75021826fe8fbda01c390db1fb26f282c831e9e72d0d54391");
    }

    @Test
    public void testWithLength6() {
        CryptoHelpers.testHex(instance(), "c6f50bb74e29", "172dd6328695a30e9dbd7d6f805b43836f1003c242be47d95d83a4f0a7bbc6d7b0e84697002fb7707fdeaa305c60adb56a6a9b25b227a3fe16cd6602742f5125");
    }

    @Test
    public void testWithLength7() {
        CryptoHelpers.testHex(instance(), "119713cc83eeef", "dbe9ea70da3a77202beb3398ee457aa4898e4b4b5cb76e14088bf95f1245a5864c07898662db493eeb2b497e77446c8886dd9b830641d6e1b57e6cdf7c797a24");
    }

    @Test
    public void testWithLength8() {
        CryptoHelpers.testHex(instance(), "4a4f202484512526", "90a0be0248e8edc3402fc2322e6c8e7a9d7e4a2752f771ff7d8baed84320220052388f19577e13335290f1e7fdf3a24fc9fa332f6da55e2b75744972809048be");
    }

    @Test
    public void testWithLength9() {
        CryptoHelpers.testHex(instance(), "1f66ab4185ed9b6375", "9f3408b8ca6fa07e7c760c86d237ecc4be7beb5866fc18fb8d146e57d2e96950f77f634c3fbd4214618a49075fd70573dcaee15c05d8d5fb71e82d33e5df88ca");
    }

    @Test
    public void testWithLength10() {
        CryptoHelpers.testHex(instance(), "eed7422227613b6f53c9", "c98a7a5c4795a41d2c8334f97f58e6f00d6c69a46b22ef36e09412347d5756b142439d7402f1f528a9060c022723a644f12c7a2cc53512edfb0692d24774cf21");
    }

    @Test
    public void testWithLength11() {
        CryptoHelpers.testHex(instance(), "eaeed5cdffd89dece455f1", "5aa080d029dc20bebce3889e9bcde9346ec7593165b18f18979defa6f7285c6928d1bc443774aadf76f192f2c1938311888f12f60b513bd895807b6a37ededf2");
    }

    @Test
    public void testWithLength12() {
        CryptoHelpers.testHex(instance(), "5be43c90f22902e4fe8ed2d3", "f0f44737795ecd12c99a88befb62637ca1abf82d2d600c03c98c1bff97ee922df1d94ca0e54f7aec6e2b59da400d4b5c666980e3cf46952a9735624037a7b7cb");
    }

    @Test
    public void testWithLength13() {
        CryptoHelpers.testHex(instance(), "a746273228122f381c3b46e4f1", "83353c99afcddb4af32911c01b2724bafc1c433c3b5d3e89ceba512d655425a0bfe20bdd787e784065c177158d8937a39b8e26d9f531b3164d077059a6021291");
    }

    @Test
    public void testWithLength14() {
        CryptoHelpers.testHex(instance(), "3c5871cd619c69a63b540eb5a625", "5707b902292411e8bc8b63f675d568507f98ca3c0dcca18ad72908bc2e2aa9bb9f3a9349867a6badf71bb55f2612e9f59ad25d7f00b270ed581e065089b90812");
    }

    @Test
    public void testWithLength15() {
        CryptoHelpers.testHex(instance(), "fa22874bcc068879e8ef11a69f0722", "fac660712af881891ff7f9d8eebad3d7cf83c1f7ee2fa393db4aea68cb2521ac51767606493cd5710ef429008fd248c6cdbe9b8e3bd9240da2de653bdbc0098f");
    }

    @Test
    public void testWithLength16() {
        CryptoHelpers.testHex(instance(), "52a608ab21ccdd8a4457a57ede782176", "4d047431c2f0c6bab89982425138a86eb042f72d59847d13c8a3cb6541a25b31383704d24c0133edf675f4011566debec0f14ccb65503056234bb11bec5e58b4");
    }
}
