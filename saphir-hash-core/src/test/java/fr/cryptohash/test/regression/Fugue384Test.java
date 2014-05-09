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
package fr.cryptohash.test.regression;

import org.junit.Test;
import fr.cryptohash.*;
import fr.cryptohash.test.*;

/**
 * JUnit test with example data for Fugue384. * Test data comes from the
 * original sphlib-3.0 file 'TestDigest.java'.
 */
public class Fugue384Test extends AbstractCryptoTest {

    @Test
    public void testWithLength1() {
        testHex(new Fugue384(),
                "cc",
                "436868cd6804b803dac432ed561bb40f91f624a10f2a368702359841cfda6909115628ca4977b3f8063a3b87fc7a0984");
    }

    @Test
    public void testWithLength2() {
        testHex(new Fugue384(),
                "41fb",
                "faf69841ca96ec8f96657f2871c1ddf9a060e5d55cd7e196078aa920171f73e5373ecda45b4552590124d280e22d9be6");
    }

    @Test
    public void testWithLength3() {
        testHex(new Fugue384(),
                "1f877c",
                "47fc7c9df32d8ffad51d840de2da1908dd0993340e965b425f8bbba468239973e349394bcfe288b4ee467772bfd26939");
    }

    @Test
    public void testWithLength4() {
        testHex(new Fugue384(),
                "c1ecfdfc",
                "7092b797e08636119ea45a145c83cce0d1155b00c82306b471a90f9ca1bfa6539ea0ce3e430aaeaefd84655c7aec657a");
    }

    @Test
    public void testWithLength5() {
        testHex(new Fugue384(),
                "21f134ac57",
                "be4194a2b73651814631cbdd73b97719f863abee2f3e71ae4aeee348843ce2f068fb08b49fccaaf8ec917c75c39b6202");
    }

    @Test
    public void testWithLength6() {
        testHex(new Fugue384(),
                "c6f50bb74e29",
                "ad340157dd68e0c8af60d8e926b0e3a721d93627da58fa77c4df14df56c324e4f711e64c0ad6346a949ecf0185ab6e1f");
    }

    @Test
    public void testWithLength7() {
        testHex(new Fugue384(),
                "119713cc83eeef",
                "9e0de23dfc4fa638ddd4be133fe4b917b95d3a908cb07b4cd150a914f7e13ce9dea30513354c4b85d87fe339f8cce6d5");
    }

    @Test
    public void testWithLength8() {
        testHex(new Fugue384(),
                "4a4f202484512526",
                "6cc5b658be0426dc9da6d09746a7f9f34674358fe439a1d25c12158cd942288543830811fe62bb2c6c2ea099b40aa978");
    }

    @Test
    public void testWithLength9() {
        testHex(new Fugue384(),
                "1f66ab4185ed9b6375",
                "406ff81f324a86c6e4e97ea79ff86f6601824a1e8599e00817237ca0343f31b835f655a5d9d722c80c64201902c9389a");
    }

    @Test
    public void testWithLength10() {
        testHex(new Fugue384(),
                "eed7422227613b6f53c9",
                "8ced5b9b5f0c5771d869b8423117b39511fefeaee1dea47368473ec65ee0c0e02b9f41a3b64c6fa65f4ba520bfd36ff0");
    }

    @Test
    public void testWithLength11() {
        testHex(new Fugue384(),
                "eaeed5cdffd89dece455f1",
                "769551d5a86e56dc424d05a47910c816eb1d5d9c1f2daceffbb6837999d80f77a7c802bb93e9672e47e4588b4187bec2");
    }

    @Test
    public void testWithLength12() {
        testHex(new Fugue384(),
                "5be43c90f22902e4fe8ed2d3",
                "0781e232a61cf7c40458a453fdcebb5fc02b2c52289d1005689ab77fd3de44da7b2f009eb7e769ce70a14a830ed37eb8");
    }

    @Test
    public void testWithLength13() {
        testHex(new Fugue384(),
                "a746273228122f381c3b46e4f1",
                "dbd226b023247f4e790d09ba98594a1ebf24b2dac8e6c46c620ef9967dd65190b9e9567ab06b0d511c2443788d46d86d");
    }

    @Test
    public void testWithLength14() {
        testHex(new Fugue384(),
                "3c5871cd619c69a63b540eb5a625",
                "76ece1c5dda393c24c98804cb5e93f69e6075d9fa8f7cbe3f695c6ef16a26757dd628efb83ffc92aad4dd774396016a0");
    }

    @Test
    public void testWithLength15() {
        testHex(new Fugue384(),
                "fa22874bcc068879e8ef11a69f0722",
                "e3aee6fd30da64998daa2910f4c16355fbf5c06bd8499eb0d31d4b3dfd0ad68b63afbf32398f24b4910d99a3784978f6");
    }

    @Test
    public void testWithLength16() {
        testHex(new Fugue384(),
                "52a608ab21ccdd8a4457a57ede782176",
                "04847908c63e56a9d0e662a81ea05dddaf3eafcb711e6e16311d4c5090df0d73da31b5672b660bc59b679dae9d569c3b");
    }
}
