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

import fr.cryptohash.Hamsi256;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for Hamsi256. * Test data comes from the
 * original sphlib-3.0 file 'TestDigest.java'.
 */
public class Hamsi256Test extends AbstractCryptoTest<Hamsi256> {
    public Hamsi256Test() {
        super(Hamsi256.class);
    }

    @Test
    public void testWithLength1() {
        CryptoHelpers.testHex(new Hamsi256(), "cc", "ac2dac2a6ddaf703b7a55745d61b1a16a3d1bf1f74caab265a2e5dbebcf60832");
    }

    @Test
    public void testWithLength2() {
        CryptoHelpers.testHex(new Hamsi256(), "41fb", "2db4f6b7a8e20b28d5d3d536ea23ade6566d4e622e62a108cd52a7a809c469dd");
    }

    @Test
    public void testWithLength3() {
        CryptoHelpers.testHex(new Hamsi256(), "1f877c", "cb596913e691f8654a613e24debf3262e6477fd737d5c422e670e0c75fae7d17");
    }

    @Test
    public void testWithLength4() {
        CryptoHelpers.testHex(new Hamsi256(), "c1ecfdfc", "aeaef9b3b7f8f947fba5fe9bd9886a203110621bc2bca6ac890997aeec69ae0e");
    }

    @Test
    public void testWithLength5() {
        CryptoHelpers.testHex(new Hamsi256(), "21f134ac57", "b302060a7649a5872109e845fe20c3c427021e45e91d680445980529374a598d");
    }

    @Test
    public void testWithLength6() {
        CryptoHelpers.testHex(new Hamsi256(), "c6f50bb74e29", "15aa66c5e6a2f5274739bb0d47f7f2ba9a0efa76356d3cbdc0b00efc92a3848d");
    }

    @Test
    public void testWithLength7() {
        CryptoHelpers.testHex(new Hamsi256(), "119713cc83eeef", "b3d4f87d62c404d11b1b6bc244f53bd75db2d8def1911bbc1d9631a8d4f01cfb");
    }

    @Test
    public void testWithLength8() {
        CryptoHelpers.testHex(new Hamsi256(), "4a4f202484512526", "452866b4f08d190fede099473368aa2b187acc0320a4918b9a3e74795123e816");
    }

    @Test
    public void testWithLength9() {
        CryptoHelpers.testHex(new Hamsi256(), "1f66ab4185ed9b6375", "271d8b8e833fcac17e0b487ba0f7ee8ddc41a3d34db3390e7ab7e536d71e8564");
    }

    @Test
    public void testWithLength10() {
        CryptoHelpers.testHex(new Hamsi256(), "eed7422227613b6f53c9", "2b854a5ed0d7d6f6d82e501e2efafe6b10b8372b3c478b5829bb78d9bcd5466f");
    }

    @Test
    public void testWithLength11() {
        CryptoHelpers.testHex(new Hamsi256(), "eaeed5cdffd89dece455f1", "6c507361898ac38fef0c18ce19a5110b73580c1b2499571287afb39f355545f0");
    }

    @Test
    public void testWithLength12() {
        CryptoHelpers.testHex(new Hamsi256(), "5be43c90f22902e4fe8ed2d3", "5562d17fdb376211004b0c1723be2d9263f8d05dc5feba26fde400bef38dc068");
    }

    @Test
    public void testWithLength13() {
        CryptoHelpers.testHex(new Hamsi256(), "a746273228122f381c3b46e4f1", "be54b3bda29df786bbd9c460d71c741537bf38cc218357e5fb10b717f8b7f828");
    }

    @Test
    public void testWithLength14() {
        CryptoHelpers.testHex(new Hamsi256(), "3c5871cd619c69a63b540eb5a625", "08f9978ecaf15426c5eaedf68e70a59a69e272c367cd4fe7e8dc7f596dbb50f2");
    }

    @Test
    public void testWithLength15() {
        CryptoHelpers.testHex(new Hamsi256(), "fa22874bcc068879e8ef11a69f0722", "7f9bc754ee10f4bc8eb4bddee72596b15a2997b5ecaf0f1f1cbe307d8f55d73c");
    }

    @Test
    public void testWithLength16() {
        CryptoHelpers.testHex(new Hamsi256(), "52a608ab21ccdd8a4457a57ede782176", "7baf8489b17492fa2ce40e43ac06d9b9adbf62d40fcb4e07b47368605a13c2c8");
    }

    @Test
    public void testWithLength17() {
        CryptoHelpers.testHex(new Hamsi256(), "82e192e4043ddcd12ecf52969d0f807eed", "eef7d7d34393f676e8c0140e8bef06fb09c8e039a58c332fa29afa18aaabca4e");
    }

    @Test
    public void testWithLength18() {
        CryptoHelpers.testHex(new Hamsi256(), "75683dcb556140c522543bb6e9098b21a21e", "e36e7e76f7d84ad64f9fc47d8ae6a7b240782fd7777c84e8dd7b1db64c6b74da");
    }

    @Test
    public void testWithLength19() {
        CryptoHelpers.testHex(new Hamsi256(), "06e4efe45035e61faaf4287b4d8d1f12ca97e5", "b2ca5c9dd4814b0eda0494043c669274438671a8af9bfc523388af660dd98d38");
    }

    @Test
    public void testWithLength20() {
        CryptoHelpers.testHex(new Hamsi256(), "e26193989d06568fe688e75540aea06747d9f851", "b7797a0dec418d3b0c152cf093d93ff31fcd11774fdb345dd2a836aeeccbba63");
    }

    @Test
    public void testWithLength21() {
        CryptoHelpers.testHex(new Hamsi256(), "d8dc8fdefbdce9d44e4cbafe78447bae3b5436102a", "eed455bc166c62daa2514d5e69c1abc439e8c256c43d0bce222b1ff7336ac1b5");
    }

    @Test
    public void testWithLength22() {
        CryptoHelpers.testHex(new Hamsi256(), "57085fd7e14216ab102d8317b0cb338a786d5fc32d8f", "172765f4a3dcabfae32604922562ba9565aa7625985ab02094744b7e790db0af");
    }

    @Test
    public void testWithLength23() {
        CryptoHelpers.testHex(new Hamsi256(), "a05404df5dbb57697e2c16fa29defac8ab3560d6126fa0", "4628287e95a93360ab9f5aec1f4bbd86e708c1843c6d8838d62c25028f8046f8");
    }

    @Test
    public void testWithLength24() {
        CryptoHelpers.testHex(new Hamsi256(), "aecbb02759f7433d6fcb06963c74061cd83b5b3ffa6f13c6", "07556a3a185ffe16367e84d8f21fb3a04174a1000d023e12697518b7f942887f");
    }

    @Test
    public void testWithLength25() {
        CryptoHelpers.testHex(new Hamsi256(), "aafdc9243d3d4a096558a360cc27c8d862f0be73db5e88aa55", "bd2b4dbd24031f53236792744bb796f9713861978793894ef548394426d09e88");
    }

    @Test
    public void testWithLength26() {
        CryptoHelpers.testHex(new Hamsi256(), "7bc84867f6f9e9fdc3e1046cae3a52c77ed485860ee260e30b15", "8bc5d7e1ab86dc47a2a784ba7823f9ac5906ce79feeb98021c55bfb33226fca4");
    }

    @Test
    public void testWithLength27() {
        CryptoHelpers.testHex(new Hamsi256(), "fac523575a99ec48279a7a459e98ff901918a475034327efb55843", "6a71ec1e389034fd1008e386f023ee0b7a6265603a90856e86051998d058a83e");
    }

    @Test
    public void testWithLength28() {
        CryptoHelpers.testHex(new Hamsi256(), "0f8b2d8fcfd9d68cffc17ccfb117709b53d26462a3f346fb7c79b85e", "6ad9f71c8d319756e8e3c180f1bd0b394e6bc0f13940d7b8880949fee2eba8de");
    }

    @Test
    public void testWithLength29() {
        CryptoHelpers.testHex(new Hamsi256(), "a963c3e895ff5a0be4824400518d81412f875fa50521e26e85eac90c04", "2be2ef84939028c0c70987d89d58fc927e6142177b13b42f0988005909830468");
    }

    @Test
    public void testWithLength30() {
        CryptoHelpers.testHex(new Hamsi256(), "03a18688b10cc0edf83adf0a84808a9718383c4070c6c4f295098699ac2c", "debde7a74f3533350328f8cd014959dc1a6bf179d7782e5592967f49a867dc74");
    }

    @Test
    public void testWithLength31() {
        CryptoHelpers.testHex(new Hamsi256(), "84fb51b517df6c5accb5d022f8f28da09b10232d42320ffc32dbecc3835b29", "6372ad8a4be2ea8d6387f95ec897a1609d477f0f791ab2a9db34595f489172f5");
    }

    @Test
    public void testWithLength32() {
        CryptoHelpers.testHex(new Hamsi256(), "9f2fcc7c90de090d6b87cd7e9718c1ea6cb21118fc2d5de9f97e5db6ac1e9c10", "6e72391d5be0769c20d92aebee0b1772939e31d521bca1d25f2add261e920ec1");
    }
}
