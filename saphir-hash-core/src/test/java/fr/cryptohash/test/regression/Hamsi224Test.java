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

import fr.cryptohash.Hamsi224;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for Hamsi224. * Test data comes from the
 * original sphlib-3.0 file 'TestDigest.java'.
 */
public class Hamsi224Test extends AbstractCryptoTest<Hamsi224> {
    public Hamsi224Test() {
        super(Hamsi224.class);
    }

    @Test
    public void testWithLength1() {
        CryptoHelpers.testHex(instance(), "cc", "8bfa48cf172314d558417877cda9be97825128c531165407fc241040");
    }

    @Test
    public void testWithLength2() {
        CryptoHelpers.testHex(instance(), "41fb", "5eabc4770ad6ab30335ca58de088aa234db09258933ba833113a5fa1");
    }

    @Test
    public void testWithLength3() {
        CryptoHelpers.testHex(instance(), "1f877c", "15a0b54528fe0f765b50bd340bfb36ae32f106e305aec3b2f42cbec5");
    }

    @Test
    public void testWithLength4() {
        CryptoHelpers.testHex(instance(), "c1ecfdfc", "0a3a2bf457fdc3fbeb78dfd423afc35d772ab22bdbe2aeb5af481fa1");
    }

    @Test
    public void testWithLength5() {
        CryptoHelpers.testHex(instance(), "21f134ac57", "1734ca61a3787fedf82fab047784c49e77e8cbfc411ba1836742f15b");
    }

    @Test
    public void testWithLength6() {
        CryptoHelpers.testHex(instance(), "c6f50bb74e29", "83ac176096fa997bfaf7f053e5050ebe64aa17db1bbd0743b119b250");
    }

    @Test
    public void testWithLength7() {
        CryptoHelpers.testHex(instance(), "119713cc83eeef", "75c618590df4a2b72977790dc5918b47d5452dc1e35ebb9ab57adaff");
    }

    @Test
    public void testWithLength8() {
        CryptoHelpers.testHex(instance(), "4a4f202484512526", "a49b5041acea909e7c31c639ed07bf51e8309686c750e152628f8454");
    }

    @Test
    public void testWithLength9() {
        CryptoHelpers.testHex(instance(), "1f66ab4185ed9b6375", "ccf83b7f505bfc59fcb40e6eff6dccf54040e30ed914a6fb50af20ee");
    }

    @Test
    public void testWithLength10() {
        CryptoHelpers.testHex(instance(), "eed7422227613b6f53c9", "f1166e96593bee0bf751da5fa44b4dddb411216f84fa21b77971472c");
    }

    @Test
    public void testWithLength11() {
        CryptoHelpers.testHex(instance(), "eaeed5cdffd89dece455f1", "e39b587eb5d8c0f817aeb507edbdab6ad9b22fb8e875cc330b7d56e2");
    }

    @Test
    public void testWithLength12() {
        CryptoHelpers.testHex(instance(), "5be43c90f22902e4fe8ed2d3", "fc4a4fc95292da8e513bea6801a264deebb28bf86357eca39831412a");
    }

    @Test
    public void testWithLength13() {
        CryptoHelpers.testHex(instance(), "a746273228122f381c3b46e4f1", "b5ab10136121523143f6e5f94539d9e710a6b7410ac28e14f24aaf0a");
    }

    @Test
    public void testWithLength14() {
        CryptoHelpers.testHex(instance(), "3c5871cd619c69a63b540eb5a625", "9068926c8760c5d3c29ee93832cc6996b6613f4ac74391982c600999");
    }

    @Test
    public void testWithLength15() {
        CryptoHelpers.testHex(instance(), "fa22874bcc068879e8ef11a69f0722", "e4e757d6da0f8bbfa85c886a3b3c3d87a6669c18570f0cd12e76f811");
    }

    @Test
    public void testWithLength16() {
        CryptoHelpers.testHex(instance(), "52a608ab21ccdd8a4457a57ede782176", "e6ecd4b294a8a023c4b52d79aef2ff44107cd14dfa56f27867af0c97");
    }

    @Test
    public void testWithLength17() {
        CryptoHelpers.testHex(instance(), "82e192e4043ddcd12ecf52969d0f807eed", "c0e6e2738d539df37d57c5b94310feff6d95417cdfca8f7cf35f7d4c");
    }

    @Test
    public void testWithLength18() {
        CryptoHelpers.testHex(instance(), "75683dcb556140c522543bb6e9098b21a21e", "452f8f9ed5d8abdaf163fe0dd0809fd9d5b545227b5f042d10e93c54");
    }

    @Test
    public void testWithLength19() {
        CryptoHelpers.testHex(instance(), "06e4efe45035e61faaf4287b4d8d1f12ca97e5", "47130fe5383d4878de71b9db0965fea196ec5d6277fe55bf80ea81c7");
    }

    @Test
    public void testWithLength20() {
        CryptoHelpers.testHex(instance(), "e26193989d06568fe688e75540aea06747d9f851", "8acd3924d9b6e93d2d0ed1aae299632bfec304baa6c4e644b36f3cd3");
    }

    @Test
    public void testWithLength21() {
        CryptoHelpers.testHex(instance(), "d8dc8fdefbdce9d44e4cbafe78447bae3b5436102a", "3f42b2b3154ae54c1da8de3087f4643010f4af632696c61659f44031");
    }

    @Test
    public void testWithLength22() {
        CryptoHelpers.testHex(instance(), "57085fd7e14216ab102d8317b0cb338a786d5fc32d8f", "d739ec8597b4af06bd25f3cee4c15094e4845a775f950736c0ab652e");
    }

    @Test
    public void testWithLength23() {
        CryptoHelpers.testHex(instance(), "a05404df5dbb57697e2c16fa29defac8ab3560d6126fa0", "959b6b8c7fd94a456201f602f1852ef6a829c00e254d64f506aa85c8");
    }

    @Test
    public void testWithLength24() {
        CryptoHelpers.testHex(instance(), "aecbb02759f7433d6fcb06963c74061cd83b5b3ffa6f13c6", "6970a83589478a58d9f57dd914b1746ff2269114bbe23a664c03a0a7");
    }

    @Test
    public void testWithLength25() {
        CryptoHelpers.testHex(instance(), "aafdc9243d3d4a096558a360cc27c8d862f0be73db5e88aa55", "e652684a2670d9902c154b864addab02d01f3c5a1989dcf465b34e3a");
    }

    @Test
    public void testWithLength26() {
        CryptoHelpers.testHex(instance(), "7bc84867f6f9e9fdc3e1046cae3a52c77ed485860ee260e30b15", "e54ceb2b29e623446cf875f5aeaf82364cafcae4d5003b7e1132bd30");
    }

    @Test
    public void testWithLength27() {
        CryptoHelpers.testHex(instance(), "fac523575a99ec48279a7a459e98ff901918a475034327efb55843", "b63007f7e3dca1b1af0d7c5711dee2e1aa66680de1faeb74d50942de");
    }

    @Test
    public void testWithLength28() {
        CryptoHelpers.testHex(instance(), "0f8b2d8fcfd9d68cffc17ccfb117709b53d26462a3f346fb7c79b85e", "67bd07760ff93fc61a22608ef9eb0f2262d9975aa84aac42c3ba8cff");
    }

    @Test
    public void testWithLength29() {
        CryptoHelpers.testHex(instance(), "a963c3e895ff5a0be4824400518d81412f875fa50521e26e85eac90c04", "79652ed9a8f8a7c4fa3629c8baeabdca15a98e1441feab5061e01a14");
    }

    @Test
    public void testWithLength30() {
        CryptoHelpers.testHex(instance(), "03a18688b10cc0edf83adf0a84808a9718383c4070c6c4f295098699ac2c", "ad9b3e9f8d91d4ea0310b861df67b303369b50be40bca7c24c49fb67");
    }

    @Test
    public void testWithLength31() {
        CryptoHelpers.testHex(instance(), "84fb51b517df6c5accb5d022f8f28da09b10232d42320ffc32dbecc3835b29", "dbde3421555b22f1469410a2f7fae414484aa6d1562eeb914683a483");
    }

    @Test
    public void testWithLength32() {
        CryptoHelpers.testHex(instance(), "9f2fcc7c90de090d6b87cd7e9718c1ea6cb21118fc2d5de9f97e5db6ac1e9c10", "66ffd45e37f72bf74f7143df4fe5d4d99d56109dd86d1374d55f3bef");
    }
}
