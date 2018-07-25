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

import fr.cryptohash.CubeHash256;
import fr.cryptohash.test.AbstractCryptoTest;
import fr.cryptohash.test.CryptoHelpers;
import org.junit.Test;

/**
 * JUnit test with example data for CubeHash256. * Test data comes from the
 * original sphlib-3.0 file 'TestDigest.java'.
 */
public class CubeHash256Test extends AbstractCryptoTest<CubeHash256> {
    public CubeHash256Test() {
        super(CubeHash256.class);
    }

    @Test
    public void testWithLength1() {
        CryptoHelpers.testHex(new CubeHash256(), "cc", "6c38422fb21d2c2c648b25add974f29208e02a08105b6de99d745aa79e2b8466");
    }

    @Test
    public void testWithLength2() {
        CryptoHelpers.testHex(new CubeHash256(), "41fb", "ad4a4242bd1d2385d72a46eaeae3239bfa243829f0cf3640ed852d4f6609f7df");
    }

    @Test
    public void testWithLength3() {
        CryptoHelpers.testHex(new CubeHash256(), "1f877c", "10a357968ea2f1e0d64b6c4358880cfefdd97480b9bdc3491e6d6ee9cfea315e");
    }

    @Test
    public void testWithLength4() {
        CryptoHelpers.testHex(new CubeHash256(), "c1ecfdfc", "aec39bd08ce304e7ce36d9bb0a09f674678a9f2f34ba26bea59beaf1d177f278");
    }

    @Test
    public void testWithLength5() {
        CryptoHelpers.testHex(new CubeHash256(), "21f134ac57", "3e198b9c513ec90209b26820fc88b6f7bfb5c4c1f62339c82f8388b3982ff3a1");
    }

    @Test
    public void testWithLength6() {
        CryptoHelpers.testHex(new CubeHash256(), "c6f50bb74e29", "779745042ac578c8fec72dee94377e2774273abc4306b1b6592e5fc8eb9ff7d1");
    }

    @Test
    public void testWithLength7() {
        CryptoHelpers.testHex(new CubeHash256(), "119713cc83eeef", "b1011acac1446f14811cf9a24b73b789599cfd9a2f64381f6740c6a26f158ade");
    }

    @Test
    public void testWithLength8() {
        CryptoHelpers.testHex(new CubeHash256(), "4a4f202484512526", "e9a612b8bfbb5ba7934a7689b16a21289c2aaeafcaffb5f08dd6d3f503c51062");
    }

    @Test
    public void testWithLength9() {
        CryptoHelpers.testHex(new CubeHash256(), "1f66ab4185ed9b6375", "478d90bf66fdd8aa56f2f0c676573106a714939b296112a3a13045049919e880");
    }

    @Test
    public void testWithLength10() {
        CryptoHelpers.testHex(new CubeHash256(), "eed7422227613b6f53c9", "dd3dfcced42cc6a37d789b1535c000127ce4b3f8527015eda9fcaf2c6e7f3952");
    }

    @Test
    public void testWithLength11() {
        CryptoHelpers.testHex(new CubeHash256(), "eaeed5cdffd89dece455f1", "d4ad565b6622b826c8764ff0fc1d528f3fcfed7e4a49d42718b2007b7a08e2b0");
    }

    @Test
    public void testWithLength12() {
        CryptoHelpers.testHex(new CubeHash256(), "5be43c90f22902e4fe8ed2d3", "96cb3aa1f2e95ade88d264e6a734c1c95005c23a845bf1b1bbdc180d9a3c05c2");
    }

    @Test
    public void testWithLength13() {
        CryptoHelpers.testHex(new CubeHash256(), "a746273228122f381c3b46e4f1", "62ac981aa0130ec1e5602680c9fc9bf1107e7a1db8bcc4b868f1c8403953e498");
    }

    @Test
    public void testWithLength14() {
        CryptoHelpers.testHex(new CubeHash256(), "3c5871cd619c69a63b540eb5a625", "1c14053f212df19a2972f6fbd1541dee61d6f0264b7e255b3b2b13bf7c791875");
    }

    @Test
    public void testWithLength15() {
        CryptoHelpers.testHex(new CubeHash256(), "fa22874bcc068879e8ef11a69f0722", "178f7ebc75080ffb5a8183336ae29d06671f211aab10c525197f9f92f69a5717");
    }

    @Test
    public void testWithLength16() {
        CryptoHelpers.testHex(new CubeHash256(), "52a608ab21ccdd8a4457a57ede782176", "780c34d545a7b892a63e66f6e07bd19633dedda512b813a22abe97997f1a0f09");
    }

    @Test
    public void testWithLength17() {
        CryptoHelpers.testHex(new CubeHash256(), "82e192e4043ddcd12ecf52969d0f807eed", "f2c7f957237bac8f1357d73ba549688d9cefc5a52303e6556a4adeedc513abaf");
    }

    @Test
    public void testWithLength18() {
        CryptoHelpers.testHex(new CubeHash256(), "75683dcb556140c522543bb6e9098b21a21e", "d9faf6581db72f5b69e83911fc7a2d543656a03c0d771802ceea86eee018494d");
    }

    @Test
    public void testWithLength19() {
        CryptoHelpers.testHex(new CubeHash256(), "06e4efe45035e61faaf4287b4d8d1f12ca97e5", "e0543462ee083ccd17de65b48d3877db63bf7da0d21ecb7cd0fd5bf1ae4c9f5c");
    }

    @Test
    public void testWithLength20() {
        CryptoHelpers.testHex(new CubeHash256(), "e26193989d06568fe688e75540aea06747d9f851", "42e81014bac2c74d71e97e4d290c8612d18e64f83e77e3171d9c873ef46fda07");
    }

    @Test
    public void testWithLength21() {
        CryptoHelpers.testHex(new CubeHash256(), "d8dc8fdefbdce9d44e4cbafe78447bae3b5436102a", "6531ebb8ffc924dd9fbf84b789dfeab537bdacc3a2b94039e4c363203947dafc");
    }

    @Test
    public void testWithLength22() {
        CryptoHelpers.testHex(new CubeHash256(), "57085fd7e14216ab102d8317b0cb338a786d5fc32d8f", "a9b9ddb3c70edefb68f3cdbfd74ded08290bbba06ce29a600d66d7fb39902e57");
    }

    @Test
    public void testWithLength23() {
        CryptoHelpers.testHex(new CubeHash256(), "a05404df5dbb57697e2c16fa29defac8ab3560d6126fa0", "94a8f73b060bc34a7173ad19321bccf14a0c50480849912f1f4623db955a5c87");
    }

    @Test
    public void testWithLength24() {
        CryptoHelpers.testHex(new CubeHash256(), "aecbb02759f7433d6fcb06963c74061cd83b5b3ffa6f13c6", "dc5ffb0a2bf913d82ef2eeca449f6f524cd38f75e9eac18e443b2729c0cb8ced");
    }

    @Test
    public void testWithLength25() {
        CryptoHelpers.testHex(new CubeHash256(), "aafdc9243d3d4a096558a360cc27c8d862f0be73db5e88aa55", "cc8508de1d01ce8e3fae4b4ee8375a619bec83fb2dedc6431f51708e8f5e01ff");
    }

    @Test
    public void testWithLength26() {
        CryptoHelpers.testHex(new CubeHash256(), "7bc84867f6f9e9fdc3e1046cae3a52c77ed485860ee260e30b15", "f0358c732a92fb9317ef233e9ade38e7a79cf290f4aab40ce6a08c44514deb05");
    }

    @Test
    public void testWithLength27() {
        CryptoHelpers.testHex(new CubeHash256(), "fac523575a99ec48279a7a459e98ff901918a475034327efb55843", "9fcc6c6380ea9e2d8c3369ea7f496cfe9ff6228c0520856f0700151548bc91b4");
    }

    @Test
    public void testWithLength28() {
        CryptoHelpers.testHex(new CubeHash256(), "0f8b2d8fcfd9d68cffc17ccfb117709b53d26462a3f346fb7c79b85e", "b563ec1e09763b2f5354bdb799777baeab9d3fc538a4520479f623d35cd5d70b");
    }

    @Test
    public void testWithLength29() {
        CryptoHelpers.testHex(new CubeHash256(), "a963c3e895ff5a0be4824400518d81412f875fa50521e26e85eac90c04", "a98aea84ff8d4458ad41bd714ac73944b09e733a73956a9b049f7f36778b5a2c");
    }

    @Test
    public void testWithLength30() {
        CryptoHelpers.testHex(new CubeHash256(), "03a18688b10cc0edf83adf0a84808a9718383c4070c6c4f295098699ac2c", "26f41fb881df5e427989027a2327ef46ae21e56d856a68a8b322028f0a72d1af");
    }

    @Test
    public void testWithLength31() {
        CryptoHelpers.testHex(new CubeHash256(), "84fb51b517df6c5accb5d022f8f28da09b10232d42320ffc32dbecc3835b29", "e4fecf97329b853b1c8dbfcc21fd214db4f8d3ec8d4e21cf19e5c8e5c1f72b66");
    }

    @Test
    public void testWithLength32() {
        CryptoHelpers.testHex(new CubeHash256(), "9f2fcc7c90de090d6b87cd7e9718c1ea6cb21118fc2d5de9f97e5db6ac1e9c10", "ec499d641966df1f8fdc79604593d736ab58ed14532ffa183fe4e6aea5efae6f");
    }

    @Test
    public void testWithLength33() {
        CryptoHelpers.testHex(new CubeHash256(), "de8f1b3faa4b7040ed4563c3b8e598253178e87e4d0df75e4ff2f2dedd5a0be046", "88da716513338a4f489c46beed12d672b5b26bbd33f007b01206b89110fa5061");
    }

    @Test
    public void testWithLength34() {
        CryptoHelpers.testHex(new CubeHash256(), "62f154ec394d0bc757d045c798c8b87a00e0655d0481a7d2d9fb58d93aedc676b5a0", "c5192e9bca6fa1208bc5f467053497ef0a4f4d82ddea1fed3bf06621ea6ab0f9");
    }

    @Test
    public void testWithLength35() {
        CryptoHelpers.testHex(new CubeHash256(), "b2dcfe9ff19e2b23ce7da2a4207d3e5ec7c6112a8a22aec9675a886378e14e5bfbad4e", "2553644d90b6cbabd835908182488d0e54fd3754de68cc809c380d8a7fb4d64a");
    }

    @Test
    public void testWithLength36() {
        CryptoHelpers.testHex(new CubeHash256(), "47f5697ac8c31409c0868827347a613a3562041c633cf1f1f86865a576e02835ed2c2492", "758e3a69bd59eb6beb92ef4d4eb017bceb94dd6ecd330ae58ff424789dec3c01");
    }

    @Test
    public void testWithLength37() {
        CryptoHelpers.testHex(new CubeHash256(), "512a6d292e67ecb2fe486bfe92660953a75484ff4c4f2eca2b0af0edcdd4339c6b2ee4e542", "323e4b3652a6f063cc700e70f8a9e626b981a186450b5a7f01eb6cf11cd8434f");
    }

    @Test
    public void testWithLength38() {
        CryptoHelpers.testHex(new CubeHash256(), "973cf2b4dcf0bfa872b41194cb05bb4e16760a1840d8343301802576197ec19e2a1493d8f4fb", "945a43634bc5ee0b488c7bde9ad750a4d6934ec269dc37e2d4a30d0312939a0e");
    }

    @Test
    public void testWithLength39() {
        CryptoHelpers.testHex(new CubeHash256(), "80beebcd2e3f8a9451d4499961c9731ae667cdc24ea020ce3b9aa4bbc0a7f79e30a934467da4b0", "828c5beb9b8847651e9815752498c9d87fe0c03ef0eed852f0d8265542a976ae");
    }

    @Test
    public void testWithLength40() {
        CryptoHelpers.testHex(new CubeHash256(), "7abaa12ec2a7347674e444140ae0fb659d08e1c66decd8d6eae925fa451d65f3c0308e29446b8ed3", "9add06818d9df703a317b7e3ac7ccfc110b5bd0ff322ab7350694ae7e3806877");
    }

    @Test
    public void testWithLength41() {
        CryptoHelpers.testHex(new CubeHash256(), "c88dee9927679b8af422abcbacf283b904ff31e1cac58c7819809f65d5807d46723b20f67ba610c2b7", "859becca5ecf0cbc149f0e35279591f5cce7bba915d0cbd13e8d207cdd0a3da2");
    }

    @Test
    public void testWithLength42() {
        CryptoHelpers.testHex(new CubeHash256(), "01e43fe350fcec450ec9b102053e6b5d56e09896e0ddd9074fe138e6038210270c834ce6eadc2bb86bf6", "dfe685ff7ac1ac18fb038f3b048c46bd055a47391a62165d93550dab7ab3aef0");
    }

    @Test
    public void testWithLength43() {
        CryptoHelpers.testHex(new CubeHash256(), "337023370a48b62ee43546f17c4ef2bf8d7ecd1d49f90bab604b839c2e6e5bd21540d29ba27ab8e309a4b7", "aed0a7690f110a333c9875c6f456402853946d1bb9b788fe6c49873dddaad769");
    }

    @Test
    public void testWithLength44() {
        CryptoHelpers.testHex(new CubeHash256(), "6892540f964c8c74bd2db02c0ad884510cb38afd4438af31fc912756f3efec6b32b58ebc38fc2a6b913596a8", "a1a28ca0f0c70030871b57e49dee3fd66c4c0c7f0cf00fbbf8bdf26acdcdab48");
    }

    @Test
    public void testWithLength45() {
        CryptoHelpers.testHex(new CubeHash256(), "f5961dfd2b1ffffda4ffbf30560c165bfedab8ce0be525845deb8dc61004b7db38467205f5dcfb34a2acfe96c0", "94a2067c83f500ad294a288aebb3ed5e1e4b49c529fcd1b081b2a42c6faa05d5");
    }

    @Test
    public void testWithLength46() {
        CryptoHelpers.testHex(new CubeHash256(), "ca061a2eb6ceed8881ce2057172d869d73a1951e63d57261384b80ceb5451e77b06cf0f5a0ea15ca907ee1c27eba", "00f530054096a9b13c8ff0a580311a39ccc74f9ce0fe76aaf92f8e5b9fb294e9");
    }

    @Test
    public void testWithLength47() {
        CryptoHelpers.testHex(new CubeHash256(), "1743a77251d69242750c4f1140532cd3c33f9b5ccdf7514e8584d4a5f9fbd730bcf84d0d4726364b9bf95ab251d9bb", "0e6b969092c3519eb75b1713ed78633dbb8ebb61b3cfae8b3129f466a4219135");
    }

    @Test
    public void testWithLength48() {
        CryptoHelpers.testHex(new CubeHash256(), "d8faba1f5194c4db5f176fabfff856924ef627a37cd08cf55608bba8f1e324d7c7f157298eabc4dce7d89ce5162499f9", "7012646217f947706dd9fae58349d83462758f5701378ee7bb42748d0d82d817");
    }

    @Test
    public void testWithLength49() {
        CryptoHelpers.testHex(new CubeHash256(), "be9684be70340860373c9c482ba517e899fc81baaa12e5c6d7727975d1d41ba8bef788cdb5cf4606c9c1c7f61aed59f97d", "bd7dea43435116093ce81c0d3038c75293b710444e8d70a5ba1e7e493f93f3b4");
    }

    @Test
    public void testWithLength50() {
        CryptoHelpers.testHex(new CubeHash256(), "7e15d2b9ea74ca60f66c8dfab377d9198b7b16deb6a1ba0ea3c7ee2042f89d3786e779cf053c77785aa9e692f821f14a7f51", "2265d614dc499b00ca97ac0093d123608db2923331344b2b9dc29fadfdea3c91");
    }

    @Test
    public void testWithLength51() {
        CryptoHelpers.testHex(new CubeHash256(), "9a219be43713bd578015e9fda66c0f2d83cac563b776ab9f38f3e4f7ef229cb443304fba401efb2bdbd7ece939102298651c86", "4f737b024c4d3a48f9e00e8e06cb6f4ff3e4e80c285bc78f4ced09327528033f");
    }

    @Test
    public void testWithLength52() {
        CryptoHelpers.testHex(new CubeHash256(), "c8f2b693bd0d75ef99caebdc22adf4088a95a3542f637203e283bbc3268780e787d68d28cc3897452f6a22aa8573ccebf245972a", "ed3bc8507707ef45f65a3d4965776cc0372de5c272ad54a75347bc3f653524e3");
    }

    @Test
    public void testWithLength53() {
        CryptoHelpers.testHex(new CubeHash256(), "ec0f99711016c6a2a07ad80d16427506ce6f441059fd269442baaa28c6ca037b22eeac49d5d894c0bf66219f2c08e9d0e8ab21de52", "36dc3ffc91a28269a9ec8e19305b0e366471033adb7c09cfbc57642170fea057");
    }

    @Test
    public void testWithLength54() {
        CryptoHelpers.testHex(new CubeHash256(), "0dc45181337ca32a8222fe7a3bf42fc9f89744259cff653504d6051fe84b1a7ffd20cb47d4696ce212a686bb9be9a8ab1c697b6d6a33", "7597d8b6ee48a06c143082acdafb894183fd51754cc74ce8675b19591a6ffb34");
    }

    @Test
    public void testWithLength55() {
        CryptoHelpers.testHex(new CubeHash256(), "de286ba4206e8b005714f80fb1cdfaebde91d29f84603e4a3ebc04686f99a46c9e880b96c574825582e8812a26e5a857ffc6579f63742f", "bc23e91a4e06aa60f0538ae4f0da06a2ffd3816ef858a8e08156730e78e0a28c");
    }

    @Test
    public void testWithLength56() {
        CryptoHelpers.testHex(new CubeHash256(), "eebcc18057252cbf3f9c070f1a73213356d5d4bc19ac2a411ec8cdeee7a571e2e20eaf61fd0c33a0ffeb297ddb77a97f0a415347db66bcaf", "2ce34e5265e3f56eef1763a04c6dde3b168a2dda70631b16fffd0900ec5f7992");
    }

    @Test
    public void testWithLength57() {
        CryptoHelpers.testHex(new CubeHash256(), "416b5cdc9fe951bd361bd7abfc120a5054758eba88fdd68fd84e39d3b09ac25497d36b43cbe7b85a6a3cebda8db4e5549c3ee51bb6fcb6ac1e", "6241a130a6ac6de8fe8d87b0f140304857a3224f56952275ed2f1e508267e11a");
    }

    @Test
    public void testWithLength58() {
        CryptoHelpers.testHex(new CubeHash256(), "5c5faf66f32e0f8311c32e8da8284a4ed60891a5a7e50fb2956b3cbaa79fc66ca376460e100415401fc2b8518c64502f187ea14bfc9503759705", "f773972412dfe7175cd0cc7ebf5c9f13027ae29f5e857acd3d8310eb89996464");
    }

    @Test
    public void testWithLength59() {
        CryptoHelpers.testHex(new CubeHash256(), "7167e1e02be1a7ca69d788666f823ae4eef39271f3c26a5cf7cee05bca83161066dc2e217b330df821103799df6d74810eed363adc4ab99f36046a", "d3553508544f735a0114a4e5a88e69180c09c109d6860f1ea947cc0f5a8f9cd7");
    }

    @Test
    public void testWithLength60() {
        CryptoHelpers.testHex(new CubeHash256(), "2fda311dbba27321c5329510fae6948f03210b76d43e7448d1689a063877b6d14c4f6d0eaa96c150051371f7dd8a4119f7da5c483cc3e6723c01fb7d", "6a074eb15165dde363f922ea0b49339c1578ad186098c07d8ad2dad4b0c083c1");
    }

    @Test
    public void testWithLength61() {
        CryptoHelpers.testHex(new CubeHash256(), "95d1474a5aab5d2422aca6e481187833a6212bd2d0f91451a67dd786dfc91dfed51b35f47e1deb8a8ab4b9cb67b70179cc26f553ae7b569969ce151b8d", "6d9630f486c3d24a42762496421b3e8ef6ee8f8ded5fd1fca4c2be5276d09439");
    }

    @Test
    public void testWithLength62() {
        CryptoHelpers.testHex(new CubeHash256(), "c71bd7941f41df044a2927a8ff55b4b467c33d089f0988aa253d294addbdb32530c0d4208b10d9959823f0c0f0734684006df79f7099870f6bf53211a88d", "abd7e41dea75180d9c94fd9a6b8194245bb10a91576b917b06e0523d20f29d20");
    }

    @Test
    public void testWithLength63() {
        CryptoHelpers.testHex(new CubeHash256(), "f57c64006d9ea761892e145c99df1b24640883da79d9ed5262859dcda8c3c32e05b03d984f1ab4a230242ab6b78d368dc5aaa1e6d3498d53371e84b0c1d4ba", "5c48d6a7d8d86f7d574d0574b1b23cb1efc679fa9aa7fdda9e07ac33422c423d");
    }

    @Test
    public void testWithLength64() {
        CryptoHelpers.testHex(new CubeHash256(), "e926ae8b0af6e53176dbffcc2a6b88c6bd765f939d3d178a9bde9ef3aa131c61e31c1e42cdfaf4b4dcde579a37e150efbef5555b4c1cb40439d835a724e2fae7", "7bc71319ccad55e166104988765523eb6757791ea2d713d4d4920c4d10fdcc51");
    }
}
