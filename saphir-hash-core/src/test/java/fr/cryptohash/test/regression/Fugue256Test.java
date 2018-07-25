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

import fr.cryptohash.Fugue256;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for Fugue256. * Test data comes from the
 * original sphlib-3.0 file 'TestDigest.java'.
 */
public class Fugue256Test extends AbstractCryptoTest<Fugue256> {
    public Fugue256Test() {
        super(Fugue256.class);
    }

    @Test
    public void testWithLength1() {
        CryptoHelpers.testHex(new Fugue256(), "cc", "b894eb2df58162f6c48d495f156e73bd086dd13db407ee38781177bb23d129bb");
    }

    @Test
    public void testWithLength2() {
        CryptoHelpers.testHex(new Fugue256(), "41fb", "584827dea879a043438c23a32c42ba0990f0f8ce385852693b7eeb2bc4d7fab1");
    }

    @Test
    public void testWithLength3() {
        CryptoHelpers.testHex(new Fugue256(), "1f877c", "f9f5cf602b093c43bf9c6d551f6a9e60214ce1bb3a6d842c3d9a5f358df05547");
    }

    @Test
    public void testWithLength4() {
        CryptoHelpers.testHex(new Fugue256(), "c1ecfdfc", "9041d9edf413cf0a8cfb6aed97c13032315319438be004685f4bb583f67acf23");
    }

    @Test
    public void testWithLength5() {
        CryptoHelpers.testHex(new Fugue256(), "21f134ac57", "2fca43424b89301d8e1ba3c5eb760a8633639b35c5d72331c0a26ed4aee7e4ba");
    }

    @Test
    public void testWithLength6() {
        CryptoHelpers.testHex(new Fugue256(), "c6f50bb74e29", "70d683f0b39d3016fc243355a2e40a7f1337aa826fc88785a3f15c0d5e96eb1c");
    }

    @Test
    public void testWithLength7() {
        CryptoHelpers.testHex(new Fugue256(), "119713cc83eeef", "5fb6e8b104bd05ff4b4606a5dbc204b1996ceac8721a0f988596ceb6ca38e431");
    }

    @Test
    public void testWithLength8() {
        CryptoHelpers.testHex(new Fugue256(), "4a4f202484512526", "84e8df742af4ab3f552a148485a1d27943b57ba748b76a1cdf8e1f054bed3d7b");
    }

    @Test
    public void testWithLength9() {
        CryptoHelpers.testHex(new Fugue256(), "1f66ab4185ed9b6375", "0f0e687507e64d63234cc50e627dd1a0a51c6c06ad45fb32604c5921e37daa2a");
    }

    @Test
    public void testWithLength10() {
        CryptoHelpers.testHex(new Fugue256(), "eed7422227613b6f53c9", "3cfb02bd515e9d983cc1665ad9368f77c89fee97eb574bf7db8c3d8e44396fb9");
    }

    @Test
    public void testWithLength11() {
        CryptoHelpers.testHex(new Fugue256(), "eaeed5cdffd89dece455f1", "2cf0a9ba776998481c86cc66ae958942cc2e0ccc72b4094d8628731c0a9366b8");
    }

    @Test
    public void testWithLength12() {
        CryptoHelpers.testHex(new Fugue256(), "5be43c90f22902e4fe8ed2d3", "d94c33e8312522b6393ebdfb4c99137265c8965782e4d7b4495640bfd6a75760");
    }

    @Test
    public void testWithLength13() {
        CryptoHelpers.testHex(new Fugue256(), "a746273228122f381c3b46e4f1", "6fcedcfd9d830702c0e4efcbb19a305449f402a6e7f02bf4236c8bae69f28b31");
    }

    @Test
    public void testWithLength14() {
        CryptoHelpers.testHex(new Fugue256(), "3c5871cd619c69a63b540eb5a625", "140bb7182339669ea91422ef67f332c7048d5e4a14875b3fda16d2ec5432dc46");
    }

    @Test
    public void testWithLength15() {
        CryptoHelpers.testHex(new Fugue256(), "fa22874bcc068879e8ef11a69f0722", "af6e59a0291236d31c8ed4e05dd121125dcd9b70411dfa9d2e2be7423ed2d358");
    }

    @Test
    public void testWithLength16() {
        CryptoHelpers.testHex(new Fugue256(), "52a608ab21ccdd8a4457a57ede782176", "3260f5be7147be7db0aefa571bf0fef651bbcb1796513572ee66855492e893d7");
    }
}
