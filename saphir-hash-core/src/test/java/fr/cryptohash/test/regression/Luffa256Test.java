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
 * JUnit test with example data for Luffa256. * Test data comes from the
 * original sphlib-3.0 file 'TestDigest.java'.
 */
public class Luffa256Test extends AbstractCryptoTest {

    @Test
    public void testWithLength3() {
        testHex(new Luffa256(),
                "616263",
                "f29311b87e9e40de7699be23fbeb5a47cb16ea4f5556d47ca40c12ad764a73bd");
    }

    @Test
    public void testWithLength1() {
        testHex(new Luffa256(),
                "cc",
                "e47d4158bfe03555d370d8fd877ead17d6aa9fdc689a9614c411fbba370c1706");
    }

    @Test
    public void testWithLength2() {
        testHex(new Luffa256(),
                "41fb",
                "08cbdd1c9caea9711ab2b30b872ddc09f2954b98ac1850abe3f648f11b76bf92");
    }

    @Test
    public void testWithLength3B() {
        testHex(new Luffa256(),
                "1f877c",
                "a590d4995c909abd9150398d4ab9465a8e9f768c576921c26a998857e7b0a604");
    }

    @Test
    public void testWithLength4() {
        testHex(new Luffa256(),
                "c1ecfdfc",
                "25c82f898f66355aba7a6215d07cab27fbeeedd16b52aa910040b40fda859981");
    }

    @Test
    public void testWithLength5() {
        testHex(new Luffa256(),
                "21f134ac57",
                "c3c9b051075ca4da37dd0a43136e1e6566cb147371325e1dbefefb8a26a2c7bf");
    }

    @Test
    public void testWithLength6() {
        testHex(new Luffa256(),
                "c6f50bb74e29",
                "81ddb86c64f4a06160121ed6e8a4a50c6144cdf27f5cd0ca85c197d9eb209751");
    }

    @Test
    public void testWithLength7() {
        testHex(new Luffa256(),
                "119713cc83eeef",
                "f826d9974939ab9722f3581e51df6587325cd58ed30e0e771a85eb1ee0666023");
    }

    @Test
    public void testWithLength8() {
        testHex(new Luffa256(),
                "4a4f202484512526",
                "375a7e893a3b0da1a0ca0272654451c7992a84ca9bd1578cf1507997b20628b5");
    }

    @Test
    public void testWithLength9() {
        testHex(new Luffa256(),
                "1f66ab4185ed9b6375",
                "2ae8ccefd8eb75d7767d4db991a6dd36e7d39a35e54a9e205c074d0e28cb9885");
    }

    @Test
    public void testWithLength10() {
        testHex(new Luffa256(),
                "eed7422227613b6f53c9",
                "93c5d8f185e9e12490ddcbc46c0d19546dc82763272a07733f368dd7812a2898");
    }

    @Test
    public void testWithLength11() {
        testHex(new Luffa256(),
                "eaeed5cdffd89dece455f1",
                "66954c41a49483055b86391fdf4d64c7ce59067656052d53f56d211c8179a8c2");
    }

    @Test
    public void testWithLength12() {
        testHex(new Luffa256(),
                "5be43c90f22902e4fe8ed2d3",
                "e3f264279d15b3a0e45475ac23a95bc11d590251d51fded2152815f787730fa8");
    }

    @Test
    public void testWithLength13() {
        testHex(new Luffa256(),
                "a746273228122f381c3b46e4f1",
                "72467235c784fbc2d31d0743bf9ef68b0b3a56ae7e2be95f56a2837a6067fefc");
    }

    @Test
    public void testWithLength14() {
        testHex(new Luffa256(),
                "3c5871cd619c69a63b540eb5a625",
                "73a6e93b7fbb5a42b15ae6d1863e84d6efa89f4761cdec2f0dd235bcc60a89b0");
    }

    @Test
    public void testWithLength15() {
        testHex(new Luffa256(),
                "fa22874bcc068879e8ef11a69f0722",
                "0c76e5a5feaf776d767ff45a27ea06faad4c1a4d893846501caae9ef334cd590");
    }

    @Test
    public void testWithLength16() {
        testHex(new Luffa256(),
                "52a608ab21ccdd8a4457a57ede782176",
                "f530e9c931b893d4fb4245b08564046a1baa5f2b51ef30899448661e9716f6ff");
    }

    @Test
    public void testWithLength17() {
        testHex(new Luffa256(),
                "82e192e4043ddcd12ecf52969d0f807eed",
                "1f0fb33a7c8e2cefa025791919034dd4685404cc77e82410997d2cfd6866819e");
    }

    @Test
    public void testWithLength18() {
        testHex(new Luffa256(),
                "75683dcb556140c522543bb6e9098b21a21e",
                "34ff9975b494979bdfb3ff6f265654aae017c384aa9e8b7ae46fde7b9520aa32");
    }

    @Test
    public void testWithLength19() {
        testHex(new Luffa256(),
                "06e4efe45035e61faaf4287b4d8d1f12ca97e5",
                "46dc757a8a3d8d9f336b4d6657918055e0a55c03205cf919959f13fa3d7ae6a9");
    }

    @Test
    public void testWithLength20() {
        testHex(new Luffa256(),
                "e26193989d06568fe688e75540aea06747d9f851",
                "419ab3a0c3129fb69c43f0f03760208f036567a69ce19459a488fd7990c62ffb");
    }

    @Test
    public void testWithLength21() {
        testHex(new Luffa256(),
                "d8dc8fdefbdce9d44e4cbafe78447bae3b5436102a",
                "383121b1c9e7e2d0e0b0bd63caf89ea25bcfe6092e9e90215c1fd2b7ee8bfb45");
    }

    @Test
    public void testWithLength22() {
        testHex(new Luffa256(),
                "57085fd7e14216ab102d8317b0cb338a786d5fc32d8f",
                "2362b7da89251eca923750e51495dccfaac60da85e52a0f6433d3c036a8ea54b");
    }

    @Test
    public void testWithLength23() {
        testHex(new Luffa256(),
                "a05404df5dbb57697e2c16fa29defac8ab3560d6126fa0",
                "1f21d604490bfd9e3047dbee4ae78907fdeb1c2109e89018cc3f8f2f1cafa40e");
    }

    @Test
    public void testWithLength24() {
        testHex(new Luffa256(),
                "aecbb02759f7433d6fcb06963c74061cd83b5b3ffa6f13c6",
                "a65984fe81e98324c070151b1d726f74c15bd1587732185bdcdec716cdec4767");
    }

    @Test
    public void testWithLength25() {
        testHex(new Luffa256(),
                "aafdc9243d3d4a096558a360cc27c8d862f0be73db5e88aa55",
                "136a5ead994a1c7c54332e54910a306cc1aa29fa1d2bab502d7c56f360ccdce6");
    }

    @Test
    public void testWithLength26() {
        testHex(new Luffa256(),
                "7bc84867f6f9e9fdc3e1046cae3a52c77ed485860ee260e30b15",
                "653ec34deec311cd38d0d474167183a59cf7b721abe417e4814f486a1ad9b94d");
    }

    @Test
    public void testWithLength27() {
        testHex(new Luffa256(),
                "fac523575a99ec48279a7a459e98ff901918a475034327efb55843",
                "0f192b38e98ca792c7f54c845c10e427002be23d0b80c180e0efc8ea1b03ab59");
    }

    @Test
    public void testWithLength28() {
        testHex(new Luffa256(),
                "0f8b2d8fcfd9d68cffc17ccfb117709b53d26462a3f346fb7c79b85e",
                "4669eafc59178a5a77aee3621c7d8c932e4434202dbf5118a368d1fb7f5d90d8");
    }

    @Test
    public void testWithLength29() {
        testHex(new Luffa256(),
                "a963c3e895ff5a0be4824400518d81412f875fa50521e26e85eac90c04",
                "a415d63928de0792e02820be200e52d32081b34014ae8c779d4ad2a7fa629a8a");
    }

    @Test
    public void testWithLength30() {
        testHex(new Luffa256(),
                "03a18688b10cc0edf83adf0a84808a9718383c4070c6c4f295098699ac2c",
                "1ca8f1d71296c07eb13d988db7cec4bccd2f6f9e3c97776b7dc0454058e3157f");
    }

    @Test
    public void testWithLength31() {
        testHex(new Luffa256(),
                "84fb51b517df6c5accb5d022f8f28da09b10232d42320ffc32dbecc3835b29",
                "e0d34790dd95f336c67172070982b61f715d2ce3f8d5afb95e003f89fdf8c888");
    }

    @Test
    public void testWithLength32() {
        testHex(new Luffa256(),
                "9f2fcc7c90de090d6b87cd7e9718c1ea6cb21118fc2d5de9f97e5db6ac1e9c10",
                "a2604f434b7bea9b156c54fe297869edb1b1249b38b0923884fe25d835e0909b");
    }

    @Test
    public void testWithLength33() {
        testHex(new Luffa256(),
                "de8f1b3faa4b7040ed4563c3b8e598253178e87e4d0df75e4ff2f2dedd5a0be046",
                "abbc5e77ba63a5a9569e0b4b346ef944b3c4b9f287f2aa0029b2aea1b7b2de61");
    }

    @Test
    public void testWithLength34() {
        testHex(new Luffa256(),
                "62f154ec394d0bc757d045c798c8b87a00e0655d0481a7d2d9fb58d93aedc676b5a0",
                "519ae93d6bd290988e243044bd92729e8f05d4d546fa3d44f8fd54728b70a113");
    }

    @Test
    public void testWithLength35() {
        testHex(new Luffa256(),
                "b2dcfe9ff19e2b23ce7da2a4207d3e5ec7c6112a8a22aec9675a886378e14e5bfbad4e",
                "f08f2d55cf38e44355547ec8c9adcb7184fbd2cd9d69be154eb3f91385d1d17f");
    }

    @Test
    public void testWithLength36() {
        testHex(new Luffa256(),
                "47f5697ac8c31409c0868827347a613a3562041c633cf1f1f86865a576e02835ed2c2492",
                "03b3a5833e3ea623dd274c2695ea096100dfa4252a602368bbd41fde3f05761a");
    }

    @Test
    public void testWithLength37() {
        testHex(new Luffa256(),
                "512a6d292e67ecb2fe486bfe92660953a75484ff4c4f2eca2b0af0edcdd4339c6b2ee4e542",
                "4e093b0251214d672f1e30093271a269c0c7042a714b6cdb4733ec7db10207af");
    }

    @Test
    public void testWithLength38() {
        testHex(new Luffa256(),
                "973cf2b4dcf0bfa872b41194cb05bb4e16760a1840d8343301802576197ec19e2a1493d8f4fb",
                "0c1b2dd372bbdce5708880630ab94e07e9d9cf16c34b2ba9979eff3cb0ffbb80");
    }

    @Test
    public void testWithLength39() {
        testHex(new Luffa256(),
                "80beebcd2e3f8a9451d4499961c9731ae667cdc24ea020ce3b9aa4bbc0a7f79e30a934467da4b0",
                "6f7d8a893fe5205c50aa4ceab70060a0ac0ad894bd982c4810bc7a13a9168be8");
    }

    @Test
    public void testWithLength40() {
        testHex(new Luffa256(),
                "7abaa12ec2a7347674e444140ae0fb659d08e1c66decd8d6eae925fa451d65f3c0308e29446b8ed3",
                "addd4250956d57d8320bbdaa6c8b230dc428ebf559d837bdc3b27e531dbed955");
    }

    @Test
    public void testWithLength41() {
        testHex(new Luffa256(),
                "c88dee9927679b8af422abcbacf283b904ff31e1cac58c7819809f65d5807d46723b20f67ba610c2b7",
                "8ee79d61164664ff083e80dc8f35b769409b1542c7a3175be17ff5a39ca57f5f");
    }

    @Test
    public void testWithLength42() {
        testHex(new Luffa256(),
                "01e43fe350fcec450ec9b102053e6b5d56e09896e0ddd9074fe138e6038210270c834ce6eadc2bb86bf6",
                "ae2349d1fa2a62b67e7b44578c3f28d72aa5e78d90870e4353dc38b08ff638db");
    }

    @Test
    public void testWithLength43() {
        testHex(new Luffa256(),
                "337023370a48b62ee43546f17c4ef2bf8d7ecd1d49f90bab604b839c2e6e5bd21540d29ba27ab8e309a4b7",
                "2acd01db8d0ff1ce2660bbf3b53890b6ab767cd2460362b3209fd96d84510182");
    }

    @Test
    public void testWithLength44() {
        testHex(new Luffa256(),
                "6892540f964c8c74bd2db02c0ad884510cb38afd4438af31fc912756f3efec6b32b58ebc38fc2a6b913596a8",
                "a124290d7e8e0385ea18f0561f1705f0ed84813ea535f2f9d66a66fba269e49b");
    }

    @Test
    public void testWithLength45() {
        testHex(new Luffa256(),
                "f5961dfd2b1ffffda4ffbf30560c165bfedab8ce0be525845deb8dc61004b7db38467205f5dcfb34a2acfe96c0",
                "0e8aeb8ea525d66efcc3787cae93cf1d5d13c5bfcc714761f3883df9ff9e47d9");
    }

    @Test
    public void testWithLength46() {
        testHex(new Luffa256(),
                "ca061a2eb6ceed8881ce2057172d869d73a1951e63d57261384b80ceb5451e77b06cf0f5a0ea15ca907ee1c27eba",
                "9a0e4801a2a79e197d6a540ad46209a948b34c486ac52cb045a0d221e124fe31");
    }

    @Test
    public void testWithLength47() {
        testHex(new Luffa256(),
                "1743a77251d69242750c4f1140532cd3c33f9b5ccdf7514e8584d4a5f9fbd730bcf84d0d4726364b9bf95ab251d9bb",
                "d938d35b8017398b5e28e91aba29eafa11451fb82adebd1e83f13e48e0c68639");
    }

    @Test
    public void testWithLength48() {
        testHex(new Luffa256(),
                "d8faba1f5194c4db5f176fabfff856924ef627a37cd08cf55608bba8f1e324d7c7f157298eabc4dce7d89ce5162499f9",
                "a39529cd1cb4da4f7fb0e7b4c8369056a8b39640a87db75a93d9af2c5c94cdf5");
    }

    @Test
    public void testWithLength49() {
        testHex(new Luffa256(),
                "be9684be70340860373c9c482ba517e899fc81baaa12e5c6d7727975d1d41ba8bef788cdb5cf4606c9c1c7f61aed59f97d",
                "bc23f022c558eedd1cf03e9dd0be8fbeb97a9793011cfa000f32807a0721b7e0");
    }

    @Test
    public void testWithLength50() {
        testHex(new Luffa256(),
                "7e15d2b9ea74ca60f66c8dfab377d9198b7b16deb6a1ba0ea3c7ee2042f89d3786e779cf053c77785aa9e692f821f14a7f51",
                "3738dd9c5354f0baed8f661af0a228332a45c86c2d6da8df007418cc02f276ef");
    }

    @Test
    public void testWithLength51() {
        testHex(new Luffa256(),
                "9a219be43713bd578015e9fda66c0f2d83cac563b776ab9f38f3e4f7ef229cb443304fba401efb2bdbd7ece939102298651c86",
                "77a48025632edca4f3966c6e69375ec8aba0396ab908e9c87cf640c4d897cd99");
    }

    @Test
    public void testWithLength52() {
        testHex(new Luffa256(),
                "c8f2b693bd0d75ef99caebdc22adf4088a95a3542f637203e283bbc3268780e787d68d28cc3897452f6a22aa8573ccebf245972a",
                "7a19772a92ef84c85a89cc2105b274162395a9f9f48d0635239db5ace4fc3e88");
    }

    @Test
    public void testWithLength53() {
        testHex(new Luffa256(),
                "ec0f99711016c6a2a07ad80d16427506ce6f441059fd269442baaa28c6ca037b22eeac49d5d894c0bf66219f2c08e9d0e8ab21de52",
                "9654de2f80b74c4fb66765b4a5393fddbb0a3a31f36c944b69acd7956d8cc452");
    }

    @Test
    public void testWithLength54() {
        testHex(new Luffa256(),
                "0dc45181337ca32a8222fe7a3bf42fc9f89744259cff653504d6051fe84b1a7ffd20cb47d4696ce212a686bb9be9a8ab1c697b6d6a33",
                "bf147f9bb5cb143f833dadc1c58000ecd5baa3b7033cffa08c2da343f67caa2b");
    }

    @Test
    public void testWithLength55() {
        testHex(new Luffa256(),
                "de286ba4206e8b005714f80fb1cdfaebde91d29f84603e4a3ebc04686f99a46c9e880b96c574825582e8812a26e5a857ffc6579f63742f",
                "9f6ab58b301d5bf3c8e739055e89a9d51f202d8a7914aa8a1bc007b83675ee3c");
    }

    @Test
    public void testWithLength56() {
        testHex(new Luffa256(),
                "eebcc18057252cbf3f9c070f1a73213356d5d4bc19ac2a411ec8cdeee7a571e2e20eaf61fd0c33a0ffeb297ddb77a97f0a415347db66bcaf",
                "cb63ff9a4eef2eb55dc2ca58045b7aaef0381e770c29b429403c4b8eab6b204b");
    }

    @Test
    public void testWithLength57() {
        testHex(new Luffa256(),
                "416b5cdc9fe951bd361bd7abfc120a5054758eba88fdd68fd84e39d3b09ac25497d36b43cbe7b85a6a3cebda8db4e5549c3ee51bb6fcb6ac1e",
                "2927461e0023dc414465f89b55df5b93730dbb96f4372f729869e46e7a6437b0");
    }

    @Test
    public void testWithLength58() {
        testHex(new Luffa256(),
                "5c5faf66f32e0f8311c32e8da8284a4ed60891a5a7e50fb2956b3cbaa79fc66ca376460e100415401fc2b8518c64502f187ea14bfc9503759705",
                "8d05f2532ecf724afa84f100d74038179bdc1fe789e3f4aa57b714bc71274d2d");
    }

    @Test
    public void testWithLength59() {
        testHex(new Luffa256(),
                "7167e1e02be1a7ca69d788666f823ae4eef39271f3c26a5cf7cee05bca83161066dc2e217b330df821103799df6d74810eed363adc4ab99f36046a",
                "30d642180f2352ffef3746814d2ddd1a835789c9125821e03ea3013167667cc9");
    }

    @Test
    public void testWithLength60() {
        testHex(new Luffa256(),
                "2fda311dbba27321c5329510fae6948f03210b76d43e7448d1689a063877b6d14c4f6d0eaa96c150051371f7dd8a4119f7da5c483cc3e6723c01fb7d",
                "bd39b656c785d3c73a0be80094a067e12dea16209f369da27bf310c097548b8c");
    }

    @Test
    public void testWithLength61() {
        testHex(new Luffa256(),
                "95d1474a5aab5d2422aca6e481187833a6212bd2d0f91451a67dd786dfc91dfed51b35f47e1deb8a8ab4b9cb67b70179cc26f553ae7b569969ce151b8d",
                "58707573d4274ed093d5fa91576f2823b6fa48246d7488ba0fcb8d0d25b28e33");
    }

    @Test
    public void testWithLength62() {
        testHex(new Luffa256(),
                "c71bd7941f41df044a2927a8ff55b4b467c33d089f0988aa253d294addbdb32530c0d4208b10d9959823f0c0f0734684006df79f7099870f6bf53211a88d",
                "742c924c264f3b6aa9aebfc931451451d32424c2c6723bd9ea07d3df05c6cc5e");
    }

    @Test
    public void testWithLength63() {
        testHex(new Luffa256(),
                "f57c64006d9ea761892e145c99df1b24640883da79d9ed5262859dcda8c3c32e05b03d984f1ab4a230242ab6b78d368dc5aaa1e6d3498d53371e84b0c1d4ba",
                "0e6ffa34b54f36b1ce8fb186aaa3e78f6a981779d3cfaf69593f70044ea77995");
    }

    @Test
    public void testWithLength64() {
        testHex(new Luffa256(),
                "e926ae8b0af6e53176dbffcc2a6b88c6bd765f939d3d178a9bde9ef3aa131c61e31c1e42cdfaf4b4dcde579a37e150efbef5555b4c1cb40439d835a724e2fae7",
                "002b4c9191bec2c87b46c23fc79f72fc7b3a2ef242d6b5460d138f4995e4fea1");
    }

    @Test
    public void testWithLength65() {
        testHex(new Luffa256(),
                "16e8b3d8f988e9bb04de9c96f2627811c973ce4a5296b4772ca3eefeb80a652bdf21f50df79f32db23f9f73d393b2d57d9a0297f7a2f2e79cfda39fa393df1ac00",
                "6ab389588354b7c5dd7591da8228bed96342d1ca3dec77d6b67be8eae8bcff80");
    }

    @Test
    public void testWithLength66() {
        testHex(new Luffa256(),
                "fc424eeb27c18a11c01f39c555d8b78a805b88dba1dc2a42ed5e2c0ec737ff68b2456d80eb85e11714fa3f8eabfb906d3c17964cb4f5e76b29c1765db03d91be37fc",
                "ed4d17e9de3e9e3322a744ff981c307a74f57cbbfc6eea8c3e88e555b8149530");
    }

    @Test
    public void testWithLength67() {
        testHex(new Luffa256(),
                "abe3472b54e72734bdba7d9158736464251c4f21b33fbbc92d7fac9a35c4e3322ff01d2380cbaa4ef8fb07d21a2128b7b9f5b6d9f34e13f39c7ffc2e72e47888599ba5",
                "f84724deedf130cf8b0c9d4cac0e3b7727810f800ab115b8ab20bd8ba62756dc");
    }

    @Test
    public void testWithLength68() {
        testHex(new Luffa256(),
                "36f9f0a65f2ca498d739b944d6eff3da5ebba57e7d9c41598a2b0e4380f3cf4b479ec2348d015ffe6256273511154afcf3b4b4bf09d6c4744fdd0f62d75079d440706b05",
                "bc5d5ffd0ae42b04b91fb9bd5c868387a61c9466b1197f8c1cd7bee3666b5ec6");
    }

    @Test
    public void testWithLength69() {
        testHex(new Luffa256(),
                "abc87763cae1ca98bd8c5b82caba54ac83286f87e9610128ae4de68ac95df5e329c360717bd349f26b872528492ca7c94c2c1e1ef56b74dbb65c2ac351981fdb31d06c77a4",
                "5fbbe4a62e2b3aefc627334a256768c89ffc67971aed49c53c0f0afa9fb317a5");
    }

    @Test
    public void testWithLength70() {
        testHex(new Luffa256(),
                "94f7ca8e1a54234c6d53cc734bb3d3150c8ba8c5f880eab8d25fed13793a9701ebe320509286fd8e422e931d99c98da4df7e70ae447bab8cffd92382d8a77760a259fc4fbd72",
                "8335c00f01f81fdee0586da33d78d0e8099a64e439ee0df192000450de39441a");
    }
}
