/*
 * Copyright (c) 2014, Stephan Fuhrmann <stephan@tynne.de>
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
 * JUnit test with example data for BMW384. * Test data comes from the original
 * sphlib-3.0 file 'TestDigest.java'.
 */
public class BMW384Test extends AbstractCryptoTest {

    @Test
    public void testWithLength3() {
        testHex(new BMW384(),
                "616263",
                "411e84c41bd59e1376fc905fe96d2ef58fd59970abba02ca53a7a662f9e6cedb4e7e43bd63717215cd86ea20282f2b36");
    }

    @Test
    public void testWithLength1() {
        testHex(new BMW384(),
                "cc",
                "45d80a7a71b2437242bf0f856a02d4520ffdc3a40c7494bfad67d696f4931a8664605a92b403511208d8fbe0bafde746");
    }

    @Test
    public void testWithLength2() {
        testHex(new BMW384(),
                "41fb",
                "58ff1cf0dc7af1f52766410f56bfe6cef7d0bd41285cca5991990d654eabab89eb728e3272e7551a66c609c56d6a0b8a");
    }

    @Test
    public void testWithLength3B() {
        testHex(new BMW384(),
                "1f877c",
                "cc0e007927bb15ed4394285367a5b20c121c3a3d542611c90d6f66cdae3fac843a8ac4194852297f73ba790d73324082");
    }

    @Test
    public void testWithLength4() {
        testHex(new BMW384(),
                "c1ecfdfc",
                "cf9e14dacb9a76ec54a6a197adde81bf29dac7c10fb7239a594afc953c9e101ef65f0ee7dcf05782de25920d579be99d");
    }

    @Test
    public void testWithLength5() {
        testHex(new BMW384(),
                "21f134ac57",
                "c293bf5d9db31ceb0dce262d21aaa71711e73cdee3030949d508bf47cc7ee4d2ddc08211ad61b8d48db90688c534db02");
    }

    @Test
    public void testWithLength6() {
        testHex(new BMW384(),
                "c6f50bb74e29",
                "08154e84b32a98b5d4c1b433aca727835d603dddac3f7e7d91bf06be0717508c570a959099781d2f3dbaef22593af580");
    }

    @Test
    public void testWithLength7() {
        testHex(new BMW384(),
                "119713cc83eeef",
                "0bef0e2a74b70e3a24515cef2903600e34d17826d2ec0c7609755dd4d036b68da333b9d11b4dddc2d53609593263b038");
    }

    @Test
    public void testWithLength8() {
        testHex(new BMW384(),
                "4a4f202484512526",
                "afee1807cdc31282ee6bc971a9e7ccd5c359389341598b5cbb6e5a690db8bc1837625cde6ef50d497d0e6042003c35b9");
    }

    @Test
    public void testWithLength9() {
        testHex(new BMW384(),
                "1f66ab4185ed9b6375",
                "6bce0fddccd509c788cd24d69adf45e2b8767061b8cd7bf821f7d0673b8c3abdd19e4bf28a3fb6b864bc211009725a41");
    }

    @Test
    public void testWithLength10() {
        testHex(new BMW384(),
                "eed7422227613b6f53c9",
                "d1157ad081914d79a329ee51a4497b0cf7dcb4ee23f87a137bc6345d7d149c6322839dd1f7516a33d5c861a0382932ee");
    }

    @Test
    public void testWithLength11() {
        testHex(new BMW384(),
                "eaeed5cdffd89dece455f1",
                "7f85a225f4c1d41893697791389a4149a82714148926a41e22b6069163aa9dc8fa63a252a3e8a3c1a6faa20f5f9d129e");
    }

    @Test
    public void testWithLength12() {
        testHex(new BMW384(),
                "5be43c90f22902e4fe8ed2d3",
                "8e5c6a92f4307b11341cf8d3c2dcb4fcdaa63c1818e63860a3db341a0f807c1ed3f2e22f40bb300e8e3d6699aa5cdc7c");
    }

    @Test
    public void testWithLength13() {
        testHex(new BMW384(),
                "a746273228122f381c3b46e4f1",
                "b591d13f0cc18136a9e2d9581b5b8b8504e4fc89831c50d7f9d2cea66dcde2c45db665c773db7959ce8f86b11abc4514");
    }

    @Test
    public void testWithLength14() {
        testHex(new BMW384(),
                "3c5871cd619c69a63b540eb5a625",
                "b0088a44bf0216c09b17ff44afbe699ce7e1469b9f295d27a05a8e9f44bf7747b150fc5d2e0a1b75b6a366505b92d573");
    }

    @Test
    public void testWithLength15() {
        testHex(new BMW384(),
                "fa22874bcc068879e8ef11a69f0722",
                "eba4425e88ac47d6246263bc113f3326f1e84d3306c5935a47112e08512f21d12a5fcd17c5ffb22184adc262b04ecb95");
    }

    @Test
    public void testWithLength16() {
        testHex(new BMW384(),
                "52a608ab21ccdd8a4457a57ede782176",
                "6faeeb23161709d4999b7cdc1313af4ada1ba303b4f9b3aa560622f6ca925d24b585922da6d879620ab2693b29924902");
    }

    @Test
    public void testWithLength17() {
        testHex(new BMW384(),
                "82e192e4043ddcd12ecf52969d0f807eed",
                "ad889c44182bfe48deaad99a810657b826fe28902e546d7e4bbdb7220662b698a27b20e9ce3df81abe5501d684aad52a");
    }

    @Test
    public void testWithLength18() {
        testHex(new BMW384(),
                "75683dcb556140c522543bb6e9098b21a21e",
                "e41d6837cd4b8ad201aed214cb809c931bc930ec992ca1c38d780aaa6b483ecfda5e932c5ddefec9565f95d452561152");
    }

    @Test
    public void testWithLength19() {
        testHex(new BMW384(),
                "06e4efe45035e61faaf4287b4d8d1f12ca97e5",
                "8e753eeef1d2b5b57ee2d50871581d817dab043c25d12e5942ed9b65a9320471967e83edaea5206abeda44e548903036");
    }

    @Test
    public void testWithLength20() {
        testHex(new BMW384(),
                "e26193989d06568fe688e75540aea06747d9f851",
                "f2cfc5df944076eb40e2c703db68c873e8a31885a337f5d1fea88e2bfecd990db18240c490e56a079fe72bbd10292d81");
    }

    @Test
    public void testWithLength21() {
        testHex(new BMW384(),
                "d8dc8fdefbdce9d44e4cbafe78447bae3b5436102a",
                "c6caaca82dbd2f8cfd8be52210f992b48fb84137946a74c342ae7393b93cb4fa97b8afb3d06d66b5c1a5dacf75d86ffd");
    }

    @Test
    public void testWithLength22() {
        testHex(new BMW384(),
                "57085fd7e14216ab102d8317b0cb338a786d5fc32d8f",
                "620e85a0a7b9e41cf5d731b1f6176d0dfbf408ebe8945646fa7bc19b17ca1d6a9a8fd6a2a853898b21e55adba1e9f5c0");
    }

    @Test
    public void testWithLength23() {
        testHex(new BMW384(),
                "a05404df5dbb57697e2c16fa29defac8ab3560d6126fa0",
                "12adba68d6e3504ef2c839f0d44cafe0a5948c911114fa6afbbd7063ccd2fb26839b51a09829ae33abda1f0fff7e6b70");
    }

    @Test
    public void testWithLength24() {
        testHex(new BMW384(),
                "aecbb02759f7433d6fcb06963c74061cd83b5b3ffa6f13c6",
                "7a722f16d52e51e8a7dc4dc681ce80e920b2e853c845255f7d435eefc8e7facdf2d55d272e8527a72e2be576ab24be7e");
    }

    @Test
    public void testWithLength25() {
        testHex(new BMW384(),
                "aafdc9243d3d4a096558a360cc27c8d862f0be73db5e88aa55",
                "f6db46a30f0c002045296a38b8d225fc173a5bfe0778dcf644297b0194700d93513ceede689f4650966222138fc8e607");
    }

    @Test
    public void testWithLength26() {
        testHex(new BMW384(),
                "7bc84867f6f9e9fdc3e1046cae3a52c77ed485860ee260e30b15",
                "a734f7d4a60782927eb1c73bcc957dbd25e7dfcbd2cba2a2a1497f8a976890d43e4ca3f0cd3c2adb9a20d1d431eb5624");
    }

    @Test
    public void testWithLength27() {
        testHex(new BMW384(),
                "fac523575a99ec48279a7a459e98ff901918a475034327efb55843",
                "1b6d91e3ebb8f03f65861919e22c54a290b033a583f363e0e43a323f0c496cf9dcb38edbdcc7f32f36cf9e79f0453957");
    }

    @Test
    public void testWithLength28() {
        testHex(new BMW384(),
                "0f8b2d8fcfd9d68cffc17ccfb117709b53d26462a3f346fb7c79b85e",
                "148af699d507ed103446c14b78bc788810bff29a9de2cbbb2c4338825256ec99b8ebfefd61160cbe904c800cf28e9b92");
    }

    @Test
    public void testWithLength29() {
        testHex(new BMW384(),
                "a963c3e895ff5a0be4824400518d81412f875fa50521e26e85eac90c04",
                "0de097d11253e3d5c9dcfb7a41cf3c245ece99babb6352e7d90e2096cb9381ddf5d8ab4cfb7fa91e96c85986f22ef7ec");
    }

    @Test
    public void testWithLength30() {
        testHex(new BMW384(),
                "03a18688b10cc0edf83adf0a84808a9718383c4070c6c4f295098699ac2c",
                "825776408483e63ba5712e24f211dd5aeffce9f9a85bbcb4059077b63f7b0cb636b99c1b18d5983971afaac76251a753");
    }

    @Test
    public void testWithLength31() {
        testHex(new BMW384(),
                "84fb51b517df6c5accb5d022f8f28da09b10232d42320ffc32dbecc3835b29",
                "79f6ef784b11e3c00508c744f84960522215bef65d0be2a95d54be3723e63100931d14ba08be026feaa4c12dd2391a5d");
    }

    @Test
    public void testWithLength32() {
        testHex(new BMW384(),
                "9f2fcc7c90de090d6b87cd7e9718c1ea6cb21118fc2d5de9f97e5db6ac1e9c10",
                "01b1c39214ece79d75b4d53d25213efdb5f873cbaebefa60ad431e0c9f623f6bc128b63ddef000f08cd1cd9bcb3bb1c1");
    }

    @Test
    public void testWithLength33() {
        testHex(new BMW384(),
                "de8f1b3faa4b7040ed4563c3b8e598253178e87e4d0df75e4ff2f2dedd5a0be046",
                "b179e02df29e027e82f6da0513be1f121f37e3337040356d046737d3ab9f86c407ada56854cca20c2c0dffc446342f56");
    }

    @Test
    public void testWithLength34() {
        testHex(new BMW384(),
                "62f154ec394d0bc757d045c798c8b87a00e0655d0481a7d2d9fb58d93aedc676b5a0",
                "e17e16a8070ade17406e26f2841cc66debef3e5b8d974851bfb59ccb97216494a2e838eb5e398b0462f48cfa041648b7");
    }

    @Test
    public void testWithLength35() {
        testHex(new BMW384(),
                "b2dcfe9ff19e2b23ce7da2a4207d3e5ec7c6112a8a22aec9675a886378e14e5bfbad4e",
                "9c4ac38c67bc01b080c789e7ae3eb0cea577a02663d04f705dcf94b465e6e0acb59650850d2871a9530a7e1bcfe2e566");
    }

    @Test
    public void testWithLength36() {
        testHex(new BMW384(),
                "47f5697ac8c31409c0868827347a613a3562041c633cf1f1f86865a576e02835ed2c2492",
                "e2d546e2b3117e8f0c38f848436bd2397debddbff9fcf8dad0d05745162470ad99405e4ba1910e0ad0c431cf5b783075");
    }

    @Test
    public void testWithLength37() {
        testHex(new BMW384(),
                "512a6d292e67ecb2fe486bfe92660953a75484ff4c4f2eca2b0af0edcdd4339c6b2ee4e542",
                "99fee4602f424f932b36ed87a25649f97e5923974bd7a2a52c135439c916cc6e0b8e5825b994fd59a5915aee5db60b8d");
    }

    @Test
    public void testWithLength38() {
        testHex(new BMW384(),
                "973cf2b4dcf0bfa872b41194cb05bb4e16760a1840d8343301802576197ec19e2a1493d8f4fb",
                "74c46018803d501d3fa3a9127dc8dd676f6b7edfb959c373fcdc5551714e8bcf64898fdabf9f9f19ab047c73f0b41321");
    }

    @Test
    public void testWithLength39() {
        testHex(new BMW384(),
                "80beebcd2e3f8a9451d4499961c9731ae667cdc24ea020ce3b9aa4bbc0a7f79e30a934467da4b0",
                "527a77cd31ff4045cba9efeacba802e07473aec75abe5885afb6e3ee0025acc0442fb833703b54133f3da264421616b2");
    }

    @Test
    public void testWithLength40() {
        testHex(new BMW384(),
                "7abaa12ec2a7347674e444140ae0fb659d08e1c66decd8d6eae925fa451d65f3c0308e29446b8ed3",
                "7223e068489a10ee641c8dbeac2941e81857e3b474907add9899eedc1b026bbe24c97a538087a6e37e6085c1c4b60e4a");
    }

    @Test
    public void testWithLength41() {
        testHex(new BMW384(),
                "c88dee9927679b8af422abcbacf283b904ff31e1cac58c7819809f65d5807d46723b20f67ba610c2b7",
                "bb57f7c1205056026440a8be9f8bac7f082c12356e9581fe35be2b8751bd315ec608e0d39ab2f81c3b33af177aa1878f");
    }

    @Test
    public void testWithLength42() {
        testHex(new BMW384(),
                "01e43fe350fcec450ec9b102053e6b5d56e09896e0ddd9074fe138e6038210270c834ce6eadc2bb86bf6",
                "7fd3ae310e8aee216294c6835816ffc6bc5dd6af70451cdb77285ebd639ab59ab13deb6c4c6fe4970ad3f28a5610afdc");
    }

    @Test
    public void testWithLength43() {
        testHex(new BMW384(),
                "337023370a48b62ee43546f17c4ef2bf8d7ecd1d49f90bab604b839c2e6e5bd21540d29ba27ab8e309a4b7",
                "2c79d612c0f115c56ab6f61160ff59d68787fed2e953e22f48803d940693529629887334749547bbb8f8fface35f3878");
    }

    @Test
    public void testWithLength44() {
        testHex(new BMW384(),
                "6892540f964c8c74bd2db02c0ad884510cb38afd4438af31fc912756f3efec6b32b58ebc38fc2a6b913596a8",
                "3d44ba237b1268d0801b065c190b179cbade786c3818dac80847572eb27426b9bb018440b86ef4753b01bca72e8e0013");
    }

    @Test
    public void testWithLength45() {
        testHex(new BMW384(),
                "f5961dfd2b1ffffda4ffbf30560c165bfedab8ce0be525845deb8dc61004b7db38467205f5dcfb34a2acfe96c0",
                "78797ef4f2c5316388a6689636c0755f9746aca68b1cf28fba88422a3dbb0e795db0f208eef8e8e60985b4ece3b1c919");
    }

    @Test
    public void testWithLength46() {
        testHex(new BMW384(),
                "ca061a2eb6ceed8881ce2057172d869d73a1951e63d57261384b80ceb5451e77b06cf0f5a0ea15ca907ee1c27eba",
                "3aaf438ceb02d9c090b965279b4a318b3033eae9c7f726c0df0b83c42921cf9561a109fa9d6e45104b6e46e215e16c71");
    }

    @Test
    public void testWithLength47() {
        testHex(new BMW384(),
                "1743a77251d69242750c4f1140532cd3c33f9b5ccdf7514e8584d4a5f9fbd730bcf84d0d4726364b9bf95ab251d9bb",
                "50d269c7e0a169f53f6e89cc74bd6377c883cb4a04a83b65520736edf56d0c52b6185b6d1d54be60a885e56a2d0037cf");
    }

    @Test
    public void testWithLength48() {
        testHex(new BMW384(),
                "d8faba1f5194c4db5f176fabfff856924ef627a37cd08cf55608bba8f1e324d7c7f157298eabc4dce7d89ce5162499f9",
                "c8e226a2606a1ac54d3ed0359eb68006c1f66999860c155237a46c44b869a6c93795692f27798300d6ddccbc0cd33397");
    }

    @Test
    public void testWithLength49() {
        testHex(new BMW384(),
                "be9684be70340860373c9c482ba517e899fc81baaa12e5c6d7727975d1d41ba8bef788cdb5cf4606c9c1c7f61aed59f97d",
                "72ca33a4dd4bddc0905e38cc0c3578d4a7cf8f65a65119566716b02d32e6a2595c822459c02e9fee2432f6984956742f");
    }

    @Test
    public void testWithLength50() {
        testHex(new BMW384(),
                "7e15d2b9ea74ca60f66c8dfab377d9198b7b16deb6a1ba0ea3c7ee2042f89d3786e779cf053c77785aa9e692f821f14a7f51",
                "6bbdf9abd0990fd27b40a1323228699764af4fa5cd7cdf0edda892d7ccda641cb6d710833b89655616c5dbbec28094b8");
    }

    @Test
    public void testWithLength51() {
        testHex(new BMW384(),
                "9a219be43713bd578015e9fda66c0f2d83cac563b776ab9f38f3e4f7ef229cb443304fba401efb2bdbd7ece939102298651c86",
                "b40c7b11868cf575bf3baf1937242e0344c21f9284e5f472f944f1271cc07fc9490d5841e7f85a61f9cfe6760177599e");
    }

    @Test
    public void testWithLength52() {
        testHex(new BMW384(),
                "c8f2b693bd0d75ef99caebdc22adf4088a95a3542f637203e283bbc3268780e787d68d28cc3897452f6a22aa8573ccebf245972a",
                "082be746c876a8e387273f97919deff87efbfe2ab8591996234345c989adf396a9ae48096824d09153105c55aadc3616");
    }

    @Test
    public void testWithLength53() {
        testHex(new BMW384(),
                "ec0f99711016c6a2a07ad80d16427506ce6f441059fd269442baaa28c6ca037b22eeac49d5d894c0bf66219f2c08e9d0e8ab21de52",
                "5cab990e17b3c2af4331ce42dcd1c30c3dfc272d14459326d367f43c0e2ebf65119cf52bdd7b6d58a1da737c48444f5b");
    }

    @Test
    public void testWithLength54() {
        testHex(new BMW384(),
                "0dc45181337ca32a8222fe7a3bf42fc9f89744259cff653504d6051fe84b1a7ffd20cb47d4696ce212a686bb9be9a8ab1c697b6d6a33",
                "5414280ff810fee3d8b37f77c36262b4a7397c65e7275214a5638c32da16403bdeeb378e2987b4c4c2dbba54b50b6f8c");
    }

    @Test
    public void testWithLength55() {
        testHex(new BMW384(),
                "de286ba4206e8b005714f80fb1cdfaebde91d29f84603e4a3ebc04686f99a46c9e880b96c574825582e8812a26e5a857ffc6579f63742f",
                "97000b3e1e252642ad2409734cfd9e6ee6974a689c19c3a84dcf810d9c5bb78db97612d81e65deed33030445e9ceb9f8");
    }

    @Test
    public void testWithLength56() {
        testHex(new BMW384(),
                "eebcc18057252cbf3f9c070f1a73213356d5d4bc19ac2a411ec8cdeee7a571e2e20eaf61fd0c33a0ffeb297ddb77a97f0a415347db66bcaf",
                "9457405e1dfe3a3126becf5d8e471d81d88771d26b142823184c6a24df7c6621a0ed12480e0d47b06bbbdb2dd0c3d684");
    }

    @Test
    public void testWithLength57() {
        testHex(new BMW384(),
                "416b5cdc9fe951bd361bd7abfc120a5054758eba88fdd68fd84e39d3b09ac25497d36b43cbe7b85a6a3cebda8db4e5549c3ee51bb6fcb6ac1e",
                "d3ed20a57d0825f3fa61418f2524baa197a2daad1dcc26572e9caa5592fbb7ae86386ea48522203d41fd4d6b447a4999");
    }

    @Test
    public void testWithLength58() {
        testHex(new BMW384(),
                "5c5faf66f32e0f8311c32e8da8284a4ed60891a5a7e50fb2956b3cbaa79fc66ca376460e100415401fc2b8518c64502f187ea14bfc9503759705",
                "47a30da9400847a225be24b6f549db279dcbc196c625a9ceab2cb298e2accb631247853d13d37a179ac935f84a09b62d");
    }

    @Test
    public void testWithLength59() {
        testHex(new BMW384(),
                "7167e1e02be1a7ca69d788666f823ae4eef39271f3c26a5cf7cee05bca83161066dc2e217b330df821103799df6d74810eed363adc4ab99f36046a",
                "75812c30ce5650be65a01ba880842543510cec99e7f9daadba9c58ea44c40517ebc6d5e665320cf09241a9bdadcbc881");
    }

    @Test
    public void testWithLength60() {
        testHex(new BMW384(),
                "2fda311dbba27321c5329510fae6948f03210b76d43e7448d1689a063877b6d14c4f6d0eaa96c150051371f7dd8a4119f7da5c483cc3e6723c01fb7d",
                "776d723814654259ab26fbaa65f38a1dab48a7cc077e9d384af47022d8cdbae0781f61e113692fc316ccad12a3877474");
    }

    @Test
    public void testWithLength61() {
        testHex(new BMW384(),
                "95d1474a5aab5d2422aca6e481187833a6212bd2d0f91451a67dd786dfc91dfed51b35f47e1deb8a8ab4b9cb67b70179cc26f553ae7b569969ce151b8d",
                "deba0bd7a1cac7cdcd3537f068a930c8d5131f287bc98613c2009c87d571cdfdf2c8e6394dffca8ee5f1c71cbe58e313");
    }

    @Test
    public void testWithLength62() {
        testHex(new BMW384(),
                "c71bd7941f41df044a2927a8ff55b4b467c33d089f0988aa253d294addbdb32530c0d4208b10d9959823f0c0f0734684006df79f7099870f6bf53211a88d",
                "9d61a2a485a8f6cd86e9c11f9a605a87e634a9dfb2dca1d2fae505ffa73fd4e7a278d6aae120b18951b5ccdb1626d697");
    }

    @Test
    public void testWithLength63() {
        testHex(new BMW384(),
                "f57c64006d9ea761892e145c99df1b24640883da79d9ed5262859dcda8c3c32e05b03d984f1ab4a230242ab6b78d368dc5aaa1e6d3498d53371e84b0c1d4ba",
                "262ec683b885bc065e61011cccada13f86e0993a509c95c44900bd18b53c6f518a1849b75ff47884c37703c6b2aadc7a");
    }

    @Test
    public void testWithLength64() {
        testHex(new BMW384(),
                "e926ae8b0af6e53176dbffcc2a6b88c6bd765f939d3d178a9bde9ef3aa131c61e31c1e42cdfaf4b4dcde579a37e150efbef5555b4c1cb40439d835a724e2fae7",
                "e9d8e705e241d44026b62d4cfda2f5f26e89f14de79b3b323dbb407fd0f1368c8311563c647e8b8bbae0e0ae6859fc3a");
    }

    @Test
    public void testWithLength65() {
        testHex(new BMW384(),
                "16e8b3d8f988e9bb04de9c96f2627811c973ce4a5296b4772ca3eefeb80a652bdf21f50df79f32db23f9f73d393b2d57d9a0297f7a2f2e79cfda39fa393df1ac00",
                "61809792e0b9c37dbe26e7869161ee2657a3c830cac2ed88959718d945e85ed4dfd1c0183ed28d06d1fcc13fd9239aec");
    }

    @Test
    public void testWithLength66() {
        testHex(new BMW384(),
                "fc424eeb27c18a11c01f39c555d8b78a805b88dba1dc2a42ed5e2c0ec737ff68b2456d80eb85e11714fa3f8eabfb906d3c17964cb4f5e76b29c1765db03d91be37fc",
                "a21c208578748f99ef71b13679e39b9c2e73084c782ca30ad8cdc57e05b2f894a4b5585eedc7a2cb8c00c1ed66b2f86e");
    }

    @Test
    public void testWithLength67() {
        testHex(new BMW384(),
                "abe3472b54e72734bdba7d9158736464251c4f21b33fbbc92d7fac9a35c4e3322ff01d2380cbaa4ef8fb07d21a2128b7b9f5b6d9f34e13f39c7ffc2e72e47888599ba5",
                "da3e146da1ec44953bff00acb2aa1c4f1d722787325bbaff6cf7def2175f4f3c8407bd206f485dee37d252a82ba8cb50");
    }

    @Test
    public void testWithLength68() {
        testHex(new BMW384(),
                "36f9f0a65f2ca498d739b944d6eff3da5ebba57e7d9c41598a2b0e4380f3cf4b479ec2348d015ffe6256273511154afcf3b4b4bf09d6c4744fdd0f62d75079d440706b05",
                "5879a2329cc8eeef0b307d0b37d171aee76e654852fd2989af253848424666019e3c8941587b9a749163b9f94fd758d4");
    }

    @Test
    public void testWithLength69() {
        testHex(new BMW384(),
                "abc87763cae1ca98bd8c5b82caba54ac83286f87e9610128ae4de68ac95df5e329c360717bd349f26b872528492ca7c94c2c1e1ef56b74dbb65c2ac351981fdb31d06c77a4",
                "5539394c7db580b39acc18bf387ec123570b09b1a1158d9f7d656b3e5639e181e5dda989393e619f4e0d6b25212f2aa3");
    }

    @Test
    public void testWithLength70() {
        testHex(new BMW384(),
                "94f7ca8e1a54234c6d53cc734bb3d3150c8ba8c5f880eab8d25fed13793a9701ebe320509286fd8e422e931d99c98da4df7e70ae447bab8cffd92382d8a77760a259fc4fbd72",
                "1e64b0f7213b2baed786bd15d110200902431a10e97e6ced15cf79752cdd825da214e0597dae5216e599f27110231e02");
    }

    @Test
    public void testWithLength71() {
        testHex(new BMW384(),
                "13bd2811f6ed2b6f04ff3895aceed7bef8dcd45eb121791bc194a0f806206bffc3b9281c2b308b1a729ce008119dd3066e9378acdcc50a98a82e20738800b6cddbe5fe9694ad6d",
                "00a05597345a5ccf660411017c9336444cfa1367f0a3622527301810d585f698bf3eddfa09ed46e9465c41a9b7ab3ba8");
    }

    @Test
    public void testWithLength72() {
        testHex(new BMW384(),
                "1eed9cba179a009ec2ec5508773dd305477ca117e6d569e66b5f64c6bc64801ce25a8424ce4a26d575b8a6fb10ead3fd1992edddeec2ebe7150dc98f63adc3237ef57b91397aa8a7",
                "5503cf27833418fd6ac93aa215ae0a7b91344a9b0b29dbcd095a34505e720eb9578d89c57e8ff0dcc7e2988009ce863a");
    }

    @Test
    public void testWithLength73() {
        testHex(new BMW384(),
                "ba5b67b5ec3a3ffae2c19dd8176a2ef75c0cd903725d45c9cb7009a900c0b0ca7a2967a95ae68269a6dbf8466c7b6844a1d608ac661f7eff00538e323db5f2c644b78b2d48de1a08aa",
                "b6abe0299d3ac90df9aec4d5bc8fa2b1c7e5ff419c32fb592835b5f2dccc87a95df17362889e557e19f70692f2bfc4f4");
    }

    @Test
    public void testWithLength74() {
        testHex(new BMW384(),
                "0efa26ac5673167dcacab860932ed612f65ff49b80fa9ae65465e5542cb62075df1c5ae54fba4db807be25b070033efa223bdd5b1d3c94c6e1909c02b620d4b1b3a6c9fed24d70749604",
                "a7a2264931a34d63877335e8884e1a21ac94a1d22bea75e89387a293596d3179b74b7660ef8e078d1e3eea2305fa8366");
    }

    @Test
    public void testWithLength75() {
        testHex(new BMW384(),
                "bbfd933d1fd7bf594ac7f435277dc17d8d5a5b8e4d13d96d2f64e771abbd51a5a8aea741beccbddb177bcea05243ebd003cfdeae877cca4da94605b67691919d8b033f77d384ca01593c1b",
                "62de16abdb38a48f5558284d18765cb2a5a3304c3ef2e3c2dc11963476e28002bd1ca4c97db83015bd62d4362b444771");
    }

    @Test
    public void testWithLength76() {
        testHex(new BMW384(),
                "90078999fd3c35b8afbf4066cbde335891365f0fc75c1286cdd88fa51fab94f9b8def7c9ac582a5dbcd95817afb7d1b48f63704e19c2baa4df347f48d4a6d603013c23f1e9611d595ebac37c",
                "9679ed8d66cd20668a6e20444571b104a366a747d6dc408701dc8e893ee8661457613d62aeb335c92a6557dde73f78d6");
    }

    @Test
    public void testWithLength77() {
        testHex(new BMW384(),
                "64105eca863515c20e7cfbaa0a0b8809046164f374d691cdbd6508aaabc1819f9ac84b52bafc1b0fe7cddbc554b608c01c8904c669d8db316a0953a4c68ece324ec5a49ffdb59a1bd6a292aa0e",
                "18699bb195f332f823f2291a28fb18c25c2ced4049a60272562adce91260eb13d9fbf8aa9107b66c608f7bcebb23fa16");
    }

    @Test
    public void testWithLength78() {
        testHex(new BMW384(),
                "d4654be288b9f3b711c2d02015978a8cc57471d5680a092aa534f7372c71ceaab725a383c4fcf4d8deaa57fca3ce056f312961eccf9b86f14981ba5bed6ab5b4498e1f6c82c6cae6fc14845b3c8a",
                "57c3e5a18188e4507f73b388fbb6ffa85173520df919b1e87ae313d6f09ecf1e23c0e177801b538e3a23c9c5aa236043");
    }

    @Test
    public void testWithLength79() {
        testHex(new BMW384(),
                "12d9394888305ac96e65f2bf0e1b18c29c90fe9d714dd59f651f52b88b3008c588435548066ea2fc4c101118c91f32556224a540de6efddbca296ef1fb00341f5b01fecfc146bdb251b3bdad556cd2",
                "026bbe292f4c39848515d2fbae9854950e15325e596661ee7fcffeb0297ea9edfd35985a973980161616e397ae20eb4c");
    }

    @Test
    public void testWithLength80() {
        testHex(new BMW384(),
                "871a0d7a5f36c3da1dfce57acd8ab8487c274fad336bc137ebd6ff4658b547c1dcfab65f037aa58f35ef16aff4abe77ba61f65826f7be681b5b6d5a1ea8085e2ae9cd5cf0991878a311b549a6d6af230",
                "9c6e2fa747801e79ed67c954294f740ba6a66c054747b793989efa591d163d92b05eac560669af41e5eb38255aba8ba0");
    }

    @Test
    public void testWithLength81() {
        testHex(new BMW384(),
                "e90b4ffef4d457bc7711ff4aa72231ca25af6b2e206f8bf859d8758b89a7cd36105db2538d06da83bad5f663ba11a5f6f61f236fd5f8d53c5e89f183a3cec615b50c7c681e773d109ff7491b5cc22296c5",
                "ca3525f1ebbd57d3d2db717e99160058a082621a87bc32feac23c9c25b9b8260ba67b2d11e58c61e02db8bd54a017b2d");
    }

    @Test
    public void testWithLength82() {
        testHex(new BMW384(),
                "e728de62d75856500c4c77a428612cd804f30c3f10d36fb219c5ca0aa30726ab190e5f3f279e0733d77e7267c17be27d21650a9a4d1e32f649627638dbada9702c7ca303269ed14014b2f3cf8b894eac8554",
                "c777249295cf5a5dc6b4ed11ab918c88ca21ee7a614a822d937a020672a2c54ee239d40dcdba4ea4f1e22eada858e6f3");
    }

    @Test
    public void testWithLength83() {
        testHex(new BMW384(),
                "6348f229e7b1df3b770c77544e5166e081850fa1c6c88169db74c76e42eb983facb276ad6a0d1fa7b50d3e3b6fcd799ec97470920a7abed47d288ff883e24ca21c7f8016b93bb9b9e078bdb9703d2b781b616e",
                "ae8f5c64f339fe73a026dfbd27f8804c2e7e4e76ac9e77684fb1afa4b3f3cd81f147f5f7ecbf93c5f630404e838e88a1");
    }

    @Test
    public void testWithLength84() {
        testHex(new BMW384(),
                "4b127fde5de733a1680c2790363627e63ac8a3f1b4707d982caea258655d9bf18f89afe54127482ba01e08845594b671306a025c9a5c5b6f93b0a39522dc877437be5c2436cbf300ce7ab6747934fcfc30aeaaf6",
                "b70030c36400c93d11996963cb7618ec8d4439ab108b6e864c8e1e7b7558c1de1671d94e64ebead0d0767fa68f446dd8");
    }

    @Test
    public void testWithLength85() {
        testHex(new BMW384(),
                "08461f006cff4cc64b752c957287e5a0faabc05c9bff89d23fd902d324c79903b48fcb8f8f4b01f3e4ddb483593d25f000386698f5ade7faade9615fdc50d32785ea51d49894e45baa3dc707e224688c6408b68b11",
                "b0c1fc9de67a9e12850bd154352dfdaef90b1f777ba59dc239face006c0e139eb641d261bdc572b1824a1c1c6f83df70");
    }

    @Test
    public void testWithLength86() {
        testHex(new BMW384(),
                "68c8f8849b120e6e0c9969a5866af591a829b92f33cd9a4a3196957a148c49138e1e2f5c7619a6d5edebe995acd81ec8bb9c7b9cfca678d081ea9e25a75d39db04e18d475920ce828b94e72241f24db72546b352a0e4",
                "ce4d6282e3f463056141638e79e260359cc369966ad2ba6cb034761b962720c7f33af016eebc3088d03c186688a70abf");
    }

    @Test
    public void testWithLength87() {
        testHex(new BMW384(),
                "b8d56472954e31fb54e28fca743f84d8dc34891cb564c64b08f7b71636debd64ca1edbdba7fc5c3e40049ce982bba8c7e0703034e331384695e9de76b5104f2fbc4535ecbeebc33bc27f29f18f6f27e8023b0fbb6f563c",
                "6348fe2fb3d267ec3f855cbd073cea0cf050309e43e30dff67656d592b52b006825be444371aad09c2846d5e53a66897");
    }

    @Test
    public void testWithLength88() {
        testHex(new BMW384(),
                "0d58ac665fa84342e60cefee31b1a4eacdb092f122dfc68309077aed1f3e528f578859ee9e4cefb4a728e946324927b675cd4f4ac84f64db3dacfe850c1dd18744c74ceccd9fe4dc214085108f404eab6d8f452b5442a47d",
                "f012bc189675ae3bce1b97d183f2a5f2dfde359c8fb55fc7c0946680dbfab18cbbe43123c954014df4240ca7471be7ca");
    }

    @Test
    public void testWithLength89() {
        testHex(new BMW384(),
                "1755e2d2e5d1c1b0156456b539753ff416651d44698e87002dcf61dcfa2b4e72f264d9ad591df1fdee7b41b2eb00283c5aebb3411323b672eaa145c5125185104f20f335804b02325b6dea65603f349f4d5d8b782dd3469ccd",
                "7275c2ec5d3f51e71288e1b0a1decef0f8e627b9109e3f4a3b58e58a0493a6a95dc352daeac82e99468da5569307b4a1");
    }

    @Test
    public void testWithLength90() {
        testHex(new BMW384(),
                "b180de1a611111ee7584ba2c4b020598cd574ac77e404e853d15a101c6f5a2e5c801d7d85dc95286a1804c870bb9f00fd4dcb03aa8328275158819dcad7253f3e3d237aeaa7979268a5db1c6ce08a9ec7c2579783c8afc1f91a7",
                "bd29218ed2afefd65d4e32351206d43e0f3c8566325fbe5f7a5aca984483a98cea53965ea3c01e4c30fc3f41c41235f6");
    }

    @Test
    public void testWithLength91() {
        testHex(new BMW384(),
                "cf3583cbdfd4cbc17063b1e7d90b02f0e6e2ee05f99d77e24e560392535e47e05077157f96813544a17046914f9efb64762a23cf7a49fe52a0a4c01c630cfe8727b81fb99a89ff7cc11dca5173057e0417b8fe7a9efba6d95c555f",
                "76739934b29ed7e2335ad8979883994a50e201da1d8e0320c85e66ca1ab8a6901de6bff43445bd298868ecba34c92d46");
    }

    @Test
    public void testWithLength92() {
        testHex(new BMW384(),
                "072fc02340ef99115bad72f92c01e4c093b9599f6cfc45cb380ee686cb5eb019e806ab9bd55e634ab10aa62a9510cc0672cd3eddb589c7df2b67fcd3329f61b1a4441eca87a33c8f55da4fbbad5cf2b2527b8e983bb31a2fadec7523",
                "1a78397a741e659b142886c05ca016ccc298fbcda7624424cfb76b445f2dafc734004fa701f488c6f41f7070c3837f94");
    }

    @Test
    public void testWithLength93() {
        testHex(new BMW384(),
                "76eecf956a52649f877528146de33df249cd800e21830f65e90f0f25ca9d6540fde40603230eca6760f1139c7f268deba2060631eea92b1fff05f93fd5572fbe29579ecd48bc3a8d6c2eb4a6b26e38d6c5fbf2c08044aeea470a8f2f26",
                "b5ba50a79e9e48dc7f88af746f091af9606f9f0c298b1d4aa7c0fcfecdebb0a41267b322e6999508bfc147237ad57197");
    }

    @Test
    public void testWithLength94() {
        testHex(new BMW384(),
                "7adc0b6693e61c269f278e6944a5a2d8300981e40022f839ac644387bfac9086650085c2cdc585fea47b9d2e52d65a2b29a7dc370401ef5d60dd0d21f9e2b90fae919319b14b8c5565b0423cefb827d5f1203302a9d01523498a4db10374",
                "47da8e570bafd163b4a22e5f2e067b2617c67793aae101335184892e3b7e0ba0676eaa37c2f81af6034e03fc50366a3b");
    }

    @Test
    public void testWithLength95() {
        testHex(new BMW384(),
                "e1fffa9826cce8b86bccefb8794e48c46cdf372013f782eced1e378269b7be2b7bf51374092261ae120e822be685f2e7a83664bcfbe38fe8633f24e633ffe1988e1bc5acf59a587079a57a910bda60060e85b5f5b6f776f0529639d9cce4bd",
                "bf5ad44d80c1d1128625ceecddd66d741d5cd6ed13540f82073fe9e18b2b704bcec1d60978cf6959d31e43c25e68664b");
    }

    @Test
    public void testWithLength96() {
        testHex(new BMW384(),
                "69f9abba65592ee01db4dce52dbab90b08fc04193602792ee4daa263033d59081587b09bbe49d0b49c9825d22840b2ff5d9c5155f975f8f2c2e7a90c75d2e4a8040fe39f63bbafb403d9e28cc3b86e04e394a9c9e8065bd3c85fa9f0c7891600",
                "d82adda41fb5d4d552f78b85651e3ca55d088bb64333fa9ed7a0a1d03f1db5b17cacc3caf60b8226a027d246339dd091");
    }

    @Test
    public void testWithLength97() {
        testHex(new BMW384(),
                "38a10a352ca5aedfa8e19c64787d8e9c3a75dbf3b8674bfab29b5dbfc15a63d10fae66cd1a6e6d2452d557967eaad89a4c98449787b0b3164ca5b717a93f24eb0b506ceb70cbbcb8d72b2a72993f909aad92f044e0b5a2c9ac9cb16a0ca2f81f49",
                "c5f055f68272eb4042688f4b0dfa432c6bfdf96fd74f6e4ea7d1106eb70a74ff486d3464db9c2323eec212d43c9efd4d");
    }

    @Test
    public void testWithLength98() {
        testHex(new BMW384(),
                "6d8c6e449bc13634f115749c248c17cd148b72157a2c37bf8969ea83b4d6ba8c0ee2711c28ee11495f43049596520ce436004b026b6c1f7292b9c436b055cbb72d530d860d1276a1502a5140e3c3f54a93663e4d20edec32d284e25564f624955b52",
                "9f147af7b0d31c315600ae9342014a61a6d743582f6d201f4acb9e04b6c502ee74c210e7d2fb34c21c1ae7eb9495fb60");
    }

    @Test
    public void testWithLength99() {
        testHex(new BMW384(),
                "6efcbcaf451c129dbe00b9cef0c3749d3ee9d41c7bd500ade40cdc65dedbbbadb885a5b14b32a0c0d087825201e303288a733842fa7e599c0c514e078f05c821c7a4498b01c40032e9f1872a1c925fa17ce253e8935e4c3c71282242cb716b2089ccc1",
                "5e02125cd01c1d0997a24f9cc8934325720dbc41828049b6608d8ee824596d60b3eb4e19167150cd6b2208e198f5dd05");
    }

    @Test
    public void testWithLength100() {
        testHex(new BMW384(),
                "433c5303131624c0021d868a30825475e8d0bd3052a022180398f4ca4423b98214b6beaac21c8807a2c33f8c93bd42b092cc1b06cedf3224d5ed1ec29784444f22e08a55aa58542b524b02cd3d5d5f6907afe71c5d7462224a3f9d9e53e7e0846dcbb4ce",
                "15a038781326840a68915e2c6ca7663872756f580d147e5caac5782935bb7fd5bfaaa502b66abfa435e8b00557d113f9");
    }

    @Test
    public void testWithLength101() {
        testHex(new BMW384(),
                "a873e0c67ca639026b6683008f7aa6324d4979550e9bce064ca1e1fb97a30b147a24f3f666c0a72d71348ede701cf2d17e2253c34d1ec3b647dbcef2f879f4eb881c4830b791378c901eb725ea5c172316c6d606e0af7df4df7f76e490cd30b2badf45685f",
                "52943b58f5e296f3540368bca6a5d1d74e7c4535510df031115a743575f91a5f983b9f9f992c48b2adcd7aab15220475");
    }

    @Test
    public void testWithLength102() {
        testHex(new BMW384(),
                "006917b64f9dcdf1d2d87c8a6173b64f6587168e80faa80f82d84f60301e561e312d9fbce62f39a6fb476e01e925f26bcc91de621449be6504c504830aae394096c8fc7694651051365d4ee9070101ec9b68086f2ea8f8ab7b811ea8ad934d5c9b62c60a4771",
                "016fe7a6d517d041540fea1f9f002b7071c3869cc7358255cc51de632a0bc67e434dbef7560e66ec2bf0ddeaf967a8bb");
    }

    @Test
    public void testWithLength103() {
        testHex(new BMW384(),
                "f13c972c52cb3cc4a4df28c97f2df11ce089b815466be88863243eb318c2adb1a417cb1041308598541720197b9b1cb5ba2318bd5574d1df2174af14884149ba9b2f446d609df240ce335599957b8ec80876d9a085ae084907bc5961b20bf5f6ca58d5dab38adb",
                "9c4b2a9292c1622a05dccf88a163ea63c88d2d6654e37888519da6ed0ffb6fdaa1712524fe500723d556a7285d86013f");
    }

    @Test
    public void testWithLength104() {
        testHex(new BMW384(),
                "e35780eb9799ad4c77535d4ddb683cf33ef367715327cf4c4a58ed9cbdcdd486f669f80189d549a9364fa82a51a52654ec721bb3aab95dceb4a86a6afa93826db923517e928f33e3fba850d45660ef83b9876accafa2a9987a254b137c6e140a21691e1069413848",
                "c6107ce277c8b9405922eb1204c209c5ed87e596d6de89fd5d93deee318691f23ec9d1b550acf7a81b148d98657b22f3");
    }

    @Test
    public void testWithLength105() {
        testHex(new BMW384(),
                "64ec021c9585e01ffe6d31bb50d44c79b6993d72678163db474947a053674619d158016adb243f5c8d50aa92f50ab36e579ff2dabb780a2b529370daa299207cfbcdd3a9a25006d19c4f1fe33e4b1eaec315d8c6ee1e730623fd1941875b924eb57d6d0c2edc4e78d6",
                "e9b62e960014c1ef69ddae09eb0ad5e95ac6fd513a228f1608d72a176f692b3e20dbcff8ce094bb5cecfeed9331f8407");
    }

    @Test
    public void testWithLength106() {
        testHex(new BMW384(),
                "5954bab512cf327d66b5d9f296180080402624ad7628506b555eea8382562324cf452fba4a2130de3e165d11831a270d9cb97ce8c2d32a96f50d71600bb4ca268cf98e90d6496b0a6619a5a8c63db6d8a0634dfc6c7ec8ea9c006b6c456f1b20cd19e781af20454ac880",
                "6a0e44f130937c5b415a875c144c3a3b97de9c5dde55e5efad2a4f173c4f22ba42d3000cce3017c1c75e68c10a1cbdd0");
    }

    @Test
    public void testWithLength107() {
        testHex(new BMW384(),
                "03d9f92b2c565709a568724a0aff90f8f347f43b02338f94a03ed32e6f33666ff5802da4c81bdce0d0e86c04afd4edc2fc8b4141c2975b6f07639b1994c973d9a9afce3d9d365862003498513bfa166d2629e314d97441667b007414e739d7febf0fe3c32c17aa188a8683",
                "02f7b3ebfe664764420938e2bc1f6a8858328196a3d37137e0b32678895a83471c0b481a28367ffbfae4b0f0a728f06d");
    }

    @Test
    public void testWithLength108() {
        testHex(new BMW384(),
                "f31e8b4f9e0621d531d22a380be5d9abd56faec53cbd39b1fab230ea67184440e5b1d15457bd25f56204fa917fa48e669016cb48c1ffc1e1e45274b3b47379e00a43843cf8601a5551411ec12503e5aac43d8676a1b2297ec7a0800dbfee04292e937f21c005f17411473041",
                "6bc3f071bcf43b74d3bea8f4d817b34cd4ecc4d4a6c1c447002fbd7d32c357f2ae31e8087239122eb04af69b3bfc720d");
    }

    @Test
    public void testWithLength109() {
        testHex(new BMW384(),
                "758ea3fea738973db0b8be7e599bbef4519373d6e6dcd7195ea885fc991d896762992759c2a09002912fb08e0cb5b76f49162aeb8cf87b172cf3ad190253df612f77b1f0c532e3b5fc99c2d31f8f65011695a087a35ee4eee5e334c369d8ee5d29f695815d866da99df3f79403",
                "cb5fbc97661acb6505bfcb924f8bd9e38a5ac9ffd1574a8258ab27fc3abf84e72df34b43ccd42a22d69ea9c446b81646");
    }

    @Test
    public void testWithLength110() {
        testHex(new BMW384(),
                "47c6e0c2b74948465921868804f0f7bd50dd323583dc784f998a93cd1ca4c6ef84d41dc81c2c40f34b5bee6a93867b3bdba0052c5f59e6f3657918c382e771d33109122cc8bb0e1e53c4e3d13b43ce44970f5e0c079d2ad7d7a3549cd75760c21bb15b447589e86e8d76b1e9ced2",
                "88744d7b8c9418e156ee6c5a41392d23a670f2b57247a91480d115a0442791f3b691dd7883ca7177ada07482d487f2e3");
    }

    @Test
    public void testWithLength111() {
        testHex(new BMW384(),
                "f690a132ab46b28edfa6479283d6444e371c6459108afd9c35dbd235e0b6b6ff4c4ea58e7554bd002460433b2164ca51e868f7947d7d7a0d792e4abf0be5f450853cc40d85485b2b8857ea31b5ea6e4ccfa2f3a7ef3380066d7d8979fdac618aad3d7e886dea4f005ae4ad05e5065f",
                "7c7594512c2c3c08623558dbb31bd661c000523c3ab58d6de372aefab2be1220920844c8669b47231d0d926c3017ecb3");
    }

    @Test
    public void testWithLength112() {
        testHex(new BMW384(),
                "58d6a99bc6458824b256916770a8417040721cccfd4b79eacd8b65a3767ce5ba7e74104c985ac56b8cc9aebd16febd4cda5adb130b0ff2329cc8d611eb14dac268a2f9e633c99de33997fea41c52a7c5e1317d5b5daed35eba7d5a60e45d1fa7eaabc35f5c2b0a0f2379231953322c4e",
                "635c7e7056cedf8ff55c8c3443d77517ff9354f5f3aa309f417e29f50161ac09ddb274930db2bad9abe6673d3d152576");
    }

    @Test
    public void testWithLength113() {
        testHex(new BMW384(),
                "befab574396d7f8b6705e2d5b58b2c1c820bb24e3f4bae3e8fbcd36dbf734ee14e5d6ab972aedd3540235466e825850ee4c512ea9795abfd33f330d9fd7f79e62bbb63a6ea85de15beaeea6f8d204a28956059e2632d11861dfb0e65bc07ac8a159388d5c3277e227286f65ff5e5b5aec1",
                "2479e4cfd4a8cde0fa3ad958df1dd73261ecb6dfb00c48248cf72e0a52ae25db7e02bbafa68556dc7b890ccdd827d92e");
    }

    @Test
    public void testWithLength114() {
        testHex(new BMW384(),
                "8e58144fa9179d686478622ce450c748260c95d1ba43b8f9b59abeca8d93488da73463ef40198b4d16fb0b0707201347e0506ff19d01bea0f42b8af9e71a1f1bd168781069d4d338fdef00bf419fbb003031df671f4a37979564f69282de9c65407847dd0da505ab1641c02dea4f0d834986",
                "5a31c0864045e75f73b5b8be91e25fcc739a51a1de55eea2011331f1daffbf2a89960feb7034c855db33f32ec03b521e");
    }

    @Test
    public void testWithLength115() {
        testHex(new BMW384(),
                "b55c10eae0ec684c16d13463f29291bf26c82e2fa0422a99c71db4af14dd9c7f33eda52fd73d017cc0f2dbe734d831f0d820d06d5f89dacc485739144f8cfd4799223b1aff9031a105cb6a029ba71e6e5867d85a554991c38df3c9ef8c1e1e9a7630be61caabca69280c399c1fb7a12d12aefc",
                "e13731fda1a15f205c08f0c4c9d9cd848cf177cf981780ed575e9203f51f11ca0975d8765b022a0ddbd2038d2c47f6fa");
    }

    @Test
    public void testWithLength116() {
        testHex(new BMW384(),
                "2eeea693f585f4ed6f6f8865bbae47a6908aecd7c429e4bec4f0de1d0ca0183fa201a0cb14a529b7d7ac0e6ff6607a3243ee9fb11bcf3e2304fe75ffcddd6c5c2e2a4cd45f63c962d010645058d36571404a6d2b4f44755434d76998e83409c3205aa1615db44057db991231d2cb42624574f545",
                "f169adce8f8c42dd072b9e89502a7424dc0303a8f2535e3bcd4de79aa529065d3b4b11d592a75b22a50e76d66f9c1b65");
    }

    @Test
    public void testWithLength117() {
        testHex(new BMW384(),
                "dab11dc0b047db0420a585f56c42d93175562852428499f66a0db811fcdddab2f7cdffed1543e5fb72110b64686bc7b6887a538ad44c050f1e42631bc4ec8a9f2a047163d822a38989ee4aab01b4c1f161b062d873b1cfa388fd301514f62224157b9bef423c7783b7aac8d30d65cd1bba8d689c2d",
                "5db36d77ecd4c4af93aff45649a25d1145331bd1ab170a4d0ae40fae6adb77c2c3b9689f2822c70d3bc2d26016e8ef22");
    }

    @Test
    public void testWithLength118() {
        testHex(new BMW384(),
                "42e99a2f80aee0e001279a2434f731e01d34a44b1a8101726921c0590c30f3120eb83059f325e894a5ac959dca71ce2214799916424e859d27d789437b9d27240bf8c35adbafcecc322b48aa205b293962d858652abacbd588bcf6cbc388d0993bd622f96ed54614c25b6a9aa527589eaaffcf17ddf7",
                "13de26437e1f05261ec6f2a34f6a28f9d711117f699c4dc4fe9347023cd5d1654a42afaf43c57ec8a31a4031a369c755");
    }

    @Test
    public void testWithLength119() {
        testHex(new BMW384(),
                "3c9b46450c0f2cae8e3823f8bdb4277f31b744ce2eb17054bddc6dff36af7f49fb8a2320cc3bdf8e0a2ea29ad3a55de1165d219adeddb5175253e2d1489e9b6fdd02e2c3d3a4b54d60e3a47334c37913c5695378a669e9b72dec32af5434f93f46176ebf044c4784467c700470d0c0b40c8a088c815816",
                "6c70ed6265f74c8f0ff9d71127bed1ff151f83119a2d0ceca7bf2fa7ac4b25ccab018e2bf5e98263109810592801e87a");
    }

    @Test
    public void testWithLength120() {
        testHex(new BMW384(),
                "d1e654b77cb155f5c77971a64df9e5d34c26a3cad6c7f6b300d39deb1910094691adaa095be4ba5d86690a976428635d5526f3e946f7dc3bd4dbc78999e653441187a81f9adcd5a3c5f254bc8256b0158f54673dcc1232f6e918ebfc6c51ce67eaeb042d9f57eec4bfe910e169af78b3de48d137df4f2840",
                "66a5228499e5f56fc4e4e67bd258713d537f8475cafe8e5df96761184b70a6930ebc7931f9339763db38db99d6550036");
    }

    @Test
    public void testWithLength121() {
        testHex(new BMW384(),
                "626f68c18a69a6590159a9c46be03d5965698f2dac3de779b878b3d9c421e0f21b955a16c715c1ec1e22ce3eb645b8b4f263f60660ea3028981eebd6c8c3a367285b691c8ee56944a7cd1217997e1d9c21620b536bdbd5de8925ff71dec6fbc06624ab6b21e329813de90d1e572dfb89a18120c3f606355d25",
                "cba1623176b90699eb4aee73661bba6bf9a81188bb4d80c65c19611c501d3c5d988053d371c996b58f63a5a40789e67b");
    }

    @Test
    public void testWithLength122() {
        testHex(new BMW384(),
                "651a6fb3c4b80c7c68c6011675e6094eb56abf5fc3057324ebc6477825061f9f27e7a94633abd1fa598a746e4a577caf524c52ec1788471f92b8c37f23795ca19d559d446cab16cbcdce90b79fa1026cee77bf4ab1b503c5b94c2256ad75b3eac6fd5dcb96aca4b03a834bfb4e9af988cecbf2ae597cb9097940",
                "e26c32d4981568a168df557d14f7647c45dd87a74300a9675639859099798217782a2d58595c02c2402da55ff53a786a");
    }

    @Test
    public void testWithLength123() {
        testHex(new BMW384(),
                "8aaf072fce8a2d96bc10b3c91c809ee93072fb205ca7f10abd82ecd82cf040b1bc49ea13d1857815c0e99781de3adbb5443ce1c897e55188ceaf221aa9681638de05ae1b322938f46bce51543b57ecdb4c266272259d1798de13be90e10efec2d07484d9b21a3870e2aa9e06c21aa2d0c9cf420080a80a91dee16f",
                "a276f15345a495e70d564622214bfc650fb16a1ee7249b4db4eadf3fd53b76fc48bb123e8c57e106a728aca9692f604b");
    }

    @Test
    public void testWithLength124() {
        testHex(new BMW384(),
                "53f918fd00b1701bd504f8cdea803acca21ac18c564ab90c2a17da592c7d69688f6580575395551e8cd33e0fef08ca6ed4588d4d140b3e44c032355df1c531564d7f4835753344345a6781e11cd5e095b73df5f82c8ae3ad00877936896671e947cc52e2b29dcd463d90a0c9929128da222b5a211450bbc0e02448e2",
                "0184e77ab27ddd3082931d372143d0e33e8973791d8fd75fa9167e3822200d5ec02e30f3f37d747e725822364ecde013");
    }

    @Test
    public void testWithLength125() {
        testHex(new BMW384(),
                "a64599b8a61b5ccec9e67aed69447459c8da3d1ec6c7c7c82a7428b9b584fa67e90f68e2c00fbbed4613666e5168da4a16f395f7a3c3832b3b134bfc9cbaa95d2a0fe252f44ac6681eb6d40ab91c1d0282fed6701c57463d3c5f2bb8c6a7301fb4576aa3b5f15510db8956ff77478c26a7c09bea7b398cfc83503f538e",
                "308d70a632f3adb4d6ef1d2bf2f7dede5d62bfa1115fa817599eb5ae6e6071cfb14677dc125ec7f97d08d5168d085d7c");
    }

    @Test
    public void testWithLength126() {
        testHex(new BMW384(),
                "0e3ab0e054739b00cdb6a87bd12cae024b54cb5e550e6c425360c2e87e59401f5ec24ef0314855f0f56c47695d56a7fb1417693af2a1ed5291f2fee95f75eed54a1b1c2e81226fbff6f63ade584911c71967a8eb70933bc3f5d15bc91b5c2644d9516d3c3a8c154ee48e118bd1442c043c7a0dba5ac5b1d5360aae5b9065",
                "82b7439937ba3edc071abec0c435bf136edaece3e6458625be8006b84481bbf3c7c0c5b5291ae669916a92d640f52a42");
    }

    @Test
    public void testWithLength127() {
        testHex(new BMW384(),
                "a62fc595b4096e6336e53fcdfc8d1cc175d71dac9d750a6133d23199eaac288207944cea6b16d27631915b4619f743da2e30a0c00bbdb1bbb35ab852ef3b9aec6b0a8dcc6e9e1abaa3ad62ac0a6c5de765de2c3711b769e3fde44a74016fff82ac46fa8f1797d3b2a726b696e3dea5530439acee3a45c2a51bc32dd055650b",
                "a02a1bfb93c2a2b85add236038da97554d127673f57d47e4a420463e54e3199707c4dbc8bb9beb7fb686d89f3a616a6d");
    }

    @Test
    public void testWithLength128() {
        testHex(new BMW384(),
                "2b6db7ced8665ebe9deb080295218426bdaa7c6da9add2088932cdffbaa1c14129bccdd70f369efb149285858d2b1d155d14de2fdb680a8b027284055182a0cae275234cc9c92863c1b4ab66f304cf0621cd54565f5bff461d3b461bd40df28198e3732501b4860eadd503d26d6e69338f4e0456e9e9baf3d827ae685fb1d817",
                "eb8588b59687520a0ba563440901bd90bb0556e6f5a73ad139f97aea5f0311c8bb4c1754911c9c743e0adbb4a487581e");
    }

    @Test
    public void testWithLength129() {
        testHex(new BMW384(),
                "10db509b2cdcaba6c062ae33be48116a29eb18e390e1bbada5ca0a2718afbcd23431440106594893043cc7f2625281bf7de2655880966a23705f0c5155c2f5cca9f2c2142e96d0a2e763b70686cd421b5db812daced0c6d65035fde558e94f26b3e6dde5bd13980cc80292b723013bd033284584bff27657871b0cf07a849f4ae2",
                "cd13da455f2a3ead546c77003b28ea0e9afe668fc3bb006fc84c03f18e7d503779246c4e70ff0863433e4b4643f7a459");
    }

    @Test
    public void testWithLength130() {
        testHex(new BMW384(),
                "9334de60c997bda6086101a6314f64e4458f5ff9450c509df006e8c547983c651ca97879175aaba0c539e82d05c1e02c480975cbb30118121061b1ebac4f8d9a3781e2db6b18042e01ecf9017a64a0e57447ec7fcbe6a7f82585f7403ee2223d52d37b4bf426428613d6b4257980972a0acab508a7620c1cb28eb4e9d30fc41361ec",
                "aeb6eecb7d11ae1ff75af5282a7063c51117a90824c859384a62a8f399f6492bba8535b933c754dfa8649f1872b5d49c");
    }

    @Test
    public void testWithLength131() {
        testHex(new BMW384(),
                "e88ab086891693aa535ceb20e64c7ab97c7dd3548f3786339897a5f0c39031549ca870166e477743ccfbe016b4428d89738e426f5ffe81626137f17aecff61b72dbee2dc20961880cfe281dfab5ee38b1921881450e16032de5e4d55ad8d4fca609721b0692bac79be5a06e177fe8c80c0c83519fb3347de9f43d5561cb8107b9b5edc",
                "fee54d250d1768ce46fb100c35a2fc4702cfb2f83d0c78582933f96f49ff2c013060d6ea57c2cc57fb94b25d936c54e0");
    }

    @Test
    public void testWithLength132() {
        testHex(new BMW384(),
                "fd19e01a83eb6ec810b94582cb8fbfa2fcb992b53684fb748d2264f020d3b960cb1d6b8c348c2b54a9fcea72330c2aaa9a24ecdb00c436abc702361a82bb8828b85369b8c72ece0082fe06557163899c2a0efa466c33c04343a839417057399a63a3929be1ee4805d6ce3e5d0d0967fe9004696a5663f4cac9179006a2ceb75542d75d68",
                "f8db5bfeb1a24cbc6876856ae04d5bbf5879040f5f70f57e525b7735fa21d29988aba4169884d01b84e3989ea555abed");
    }

    @Test
    public void testWithLength133() {
        testHex(new BMW384(),
                "59ae20b6f7e0b3c7a989afb28324a40fca25d8651cf1f46ae383ef6d8441587aa1c04c3e3bf88e8131ce6145cfb8973d961e8432b202fa5af3e09d625faad825bc19da9b5c6c20d02abda2fcc58b5bd3fe507bf201263f30543819510c12bc23e2ddb4f711d087a86edb1b355313363a2de996b891025e147036087401ccf3ca7815bf3c49",
                "7783a517d3c9c2323127534d571142cc6456eaa454c8c5d412bf77d4d77095608aaed87395983992e5dcebc6d96aa598");
    }

    @Test
    public void testWithLength134() {
        testHex(new BMW384(),
                "77ee804b9f3295ab2362798b72b0a1b2d3291dceb8139896355830f34b3b328561531f8079b79a6e9980705150866402fdc176c05897e359a6cb1a7ab067383eb497182a7e5aef7038e4c96d133b2782917417e391535b5e1b51f47d8ed7e4d4025fe98dc87b9c1622614bff3d1029e68e372de719803857ca52067cddaad958951cb2068cc6",
                "1be25584f246b94df61f071c6172507a6f2a7497816d15987f91821c23f634d230a76ab19ecd32767ab0cb2e64255eb8");
    }

    @Test
    public void testWithLength135() {
        testHex(new BMW384(),
                "b771d5cef5d1a41a93d15643d7181d2a2ef0a8e84d91812f20ed21f147bef732bf3a60ef4067c3734b85bc8cd471780f10dc9e8291b58339a677b960218f71e793f2797aea349406512829065d37bb55ea796fa4f56fd8896b49b2cd19b43215ad967c712b24e5032d065232e02c127409d2ed4146b9d75d763d52db98d949d3b0fed6a8052fbb",
                "42e1291e5d8ed1dccb6d1cf8f7e539cdb231a34aec383c623d654764ce53e4099e503be80e07cfda04d99a2b5793c59d");
    }

    @Test
    public void testWithLength136() {
        testHex(new BMW384(),
                "b32d95b0b9aad2a8816de6d06d1f86008505bd8c14124f6e9a163b5a2ade55f835d0ec3880ef50700d3b25e42cc0af050ccd1be5e555b23087e04d7bf9813622780c7313a1954f8740b6ee2d3f71f768dd417f520482bd3a08d4f222b4ee9dbd015447b33507dd50f3ab4247c5de9a8abd62a8decea01e3b87c8b927f5b08beb37674c6f8e380c04",
                "e11dc076ee922a662849a682796766328744e8a1cab38ae7f085344c103ae52a0b83ff6e00c91fada35919dd3c4549cd");
    }

    @Test
    public void testWithLength137() {
        testHex(new BMW384(),
                "04410e31082a47584b406f051398a6abe74e4da59bb6f85e6b49e8a1f7f2ca00dfba5462c2cd2bfde8b64fb21d70c083f11318b56a52d03b81cac5eec29eb31bd0078b6156786da3d6d8c33098c5c47bb67ac64db14165af65b44544d806dde5f487d5373c7f9792c299e9686b7e5821e7c8e2458315b996b5677d926dac57b3f22da873c601016a0d",
                "a92e24d3892f396b764f9f750f1da9fe8734c5721f61cf3f8982829af18ad282a8eb350a8a8d0700f3a90a0eb15f0aba");
    }

    @Test
    public void testWithLength138() {
        testHex(new BMW384(),
                "8b81e9badde026f14d95c019977024c9e13db7a5cd21f9e9fc491d716164bbacdc7060d882615d411438aea056c340cdf977788f6e17d118de55026855f93270472d1fd18b9e7e812bae107e0dfde7063301b71f6cfe4e225cab3b232905a56e994f08ee2891ba922d49c3dafeb75f7c69750cb67d822c96176c46bd8a29f1701373fb09a1a6e3c7158f",
                "36ec82ca8c9d965502c957f637dd05abd82a4deabf8d1c96007624746e4edd7c192bfa882fefa11c990958ff37db4f95");
    }

    @Test
    public void testWithLength139() {
        testHex(new BMW384(),
                "fa6eed24da6666a22208146b19a532c2ec9ba94f09f1def1e7fc13c399a48e41acc2a589d099276296348f396253b57cb0e40291bd282773656b6e0d8bea1cda084a3738816a840485fcf3fb307f777fa5feac48695c2af4769720258c77943fb4556c362d9cba8bf103aeb9034baa8ea8bfb9c4f8e6742ce0d52c49ea8e974f339612e830e9e7a9c29065",
                "45f73ee31e5a40a27cfeb919f322bb8b703344ac6046b7b5fa935144440292e3b0b5f7ff09c8208adafa25f10aaa2f57");
    }

    @Test
    public void testWithLength140() {
        testHex(new BMW384(),
                "9bb4af1b4f09c071ce3cafa92e4eb73ce8a6f5d82a85733440368dee4eb1cbc7b55ac150773b6fe47dbe036c45582ed67e23f4c74585dab509df1b83610564545642b2b1ec463e18048fc23477c6b2aa035594ecd33791af6af4cbc2a1166aba8d628c57e707f0b0e8707caf91cd44bdb915e0296e0190d56d33d8dde10b5b60377838973c1d943c22ed335e",
                "78ac482447c5db4c4dc213eb514cad4e2cc3227267a167ea267195fafc1cdfc6567434a7ecb842e2f94c53fa57234dc7");
    }

    @Test
    public void testWithLength141() {
        testHex(new BMW384(),
                "2167f02118cc62043e9091a647cadbed95611a521fe0d64e8518f16c808ab297725598ae296880a773607a798f7c3cfce80d251ebec6885015f9abf7eaabae46798f82cb5926de5c23f44a3f9f9534b3c6f405b5364c2f8a8bdc5ca49c749bed8ce4ba48897062ae8424ca6dde5f55c0e42a95d1e292ca54fb46a84fbc9cd87f2d0c9e7448de3043ae22fdd229",
                "fe1c75a8cc850004d96e94283cf323108836b541fbe5f344efb1d93cb17f04a5106504b0be102da13c3917881619b2d8");
    }

    @Test
    public void testWithLength142() {
        testHex(new BMW384(),
                "94b7fa0bc1c44e949b1d7617d31b4720cbe7ca57c6fa4f4094d4761567e389ecc64f6968e4064df70df836a47d0c713336b5028b35930d29eb7a7f9a5af9ad5cf441745baec9bb014ceeff5a41ba5c1ce085feb980bab9cf79f2158e03ef7e63e29c38d7816a84d4f71e0f548b7fc316085ae38a060ff9b8dec36f91ad9ebc0a5b6c338cbb8f6659d342a24368cf",
                "06effd7bb6f80ee732bc425c6b7d013f7b7f490ddb3bed7ccca944e6a58e9c5672673967fe3b61b8773058d0d6c23f28");
    }

    @Test
    public void testWithLength143() {
        testHex(new BMW384(),
                "ea40e83cb18b3a242c1ecc6ccd0b7853a439dab2c569cfc6dc38a19f5c90acbf76aef9ea3742ff3b54ef7d36eb7ce4ff1c9ab3bc119cff6be93c03e208783335c0ab8137be5b10cdc66ff3f89a1bddc6a1eed74f504cbe7290690bb295a872b9e3fe2cee9e6c67c41db8efd7d863cf10f840fe618e7936da3dca5ca6df933f24f6954ba0801a1294cd8d7e66dfafec",
                "be8fd69b691a5292db53a74fb17c533d7fa2743b747249c3f1fd972f7edf9e75c8da04c737426e082eb5f305d25f4441");
    }

    @Test
    public void testWithLength144() {
        testHex(new BMW384(),
                "157d5b7e4507f66d9a267476d33831e7bb768d4d04cc3438da12f9010263ea5fcafbde2579db2f6b58f911d593d5f79fb05fe3596e3fa80ff2f761d1b0e57080055c118c53e53cdb63055261d7c9b2b39bd90acc32520cbbdbda2c4fd8856dbcee173132a2679198daf83007a9b5c51511ae49766c792a29520388444ebefe28256fb33d4260439cba73a9479ee00c63",
                "72e397060cf43a667fd714f1d0bd36315855468eeb4cc0fbe4a7d490f4bcc86cc815954d463a0eb667b6b99445a9fb8b");
    }

    @Test
    public void testWithLength145() {
        testHex(new BMW384(),
                "836b34b515476f613fe447a4e0c3f3b8f20910ac89a3977055c960d2d5d2b72bd8acc715a9035321b86703a411dde0466d58a59769672aa60ad587b8481de4bba552a1645779789501ec53d540b904821f32b0bd1855b04e4848f9f8cfe9ebd8911be95781a759d7ad9724a7102dbe576776b7c632bc39b9b5e19057e226552a5994c1dbb3b5c7871a11f5537011044c53",
                "632424e547dbe09fe413baa3ca963802123eb32fa57e6cd22538504222d488e394b10f1e527f977ad1a002c792e38b6f");
    }

    @Test
    public void testWithLength146() {
        testHex(new BMW384(),
                "cc7784a4912a7ab5ad3620aab29ba87077cd3cb83636adc9f3dc94f51edf521b2161ef108f21a0a298557981c0e53ce6ced45bdf782c1ef200d29bab81dd6460586964edab7cebdbbec75fd7925060f7da2b853b2b089588fa0f8c16ec6498b14c55dcee335cb3a91d698e4d393ab8e8eac0825f8adebeee196df41205c011674e53426caa453f8de1cbb57932b0b741d4c6",
                "78f2fa300af665fdf2cab8843f94404e16492ad74166226b3dc424e4b5cc8517b55be278e89c1f97e9abf95ffd91eca0");
    }

    @Test
    public void testWithLength147() {
        testHex(new BMW384(),
                "7639b461fff270b2455ac1d1afce782944aea5e9087eb4a39eb96bb5c3baaf0e868c8526d3404f9405e79e77bfac5ffb89bf1957b523e17d341d7323c302ea7083872dd5e8705694acdda36d5a1b895aaa16eca6104c82688532c8bfe1790b5dc9f4ec5fe95baed37e1d287be710431f1e5e8ee105bc42ed37d74b1e55984bf1c09fe6a1fa13ef3b96faeaed6a2a1950a12153",
                "0332f02eb2383331ada9015fe709a7336204ebacddcf52296c616b41f030d0f842e571360b1ed21c03eee80fa0c93692");
    }

    @Test
    public void testWithLength148() {
        testHex(new BMW384(),
                "eb6513fc61b30cfba58d4d7e80f94d14589090cf1d80b1df2e68088dc6104959ba0d583d585e9578ab0aec0cf36c48435eb52ed9ab4bbce7a5abe679c97ae2dbe35e8cc1d45b06dda3cf418665c57cbee4bbb47fa4caf78f4ee656fec237fe4eebbafa206e1ef2bd0ee4ae71bd0e9b2f54f91daadf1febfd7032381d636b733dcb3bf76fb14e23aff1f68ed3dbcf75c9b99c6f26",
                "a7c066933c0b5dfb14056c2b39acd9f922782277ffdc5a8c739f3bd2dd1e18c306ba8b20009609859c50eac311155995");
    }

    @Test
    public void testWithLength149() {
        testHex(new BMW384(),
                "1594d74bf5dde444265d4c04dad9721ff3e34cbf622daf341fe16b96431f6c4df1f760d34f296eb97d98d560ad5286fec4dce1724f20b54fd7df51d4bf137add656c80546fb1bf516d62ee82baa992910ef4cc18b70f3f8698276fcfb44e0ec546c2c39cfd8ee91034ff9303058b4252462f86c823eb15bf481e6b79cc3a02218595b3658e8b37382bd5048eaed5fd02c37944e73b",
                "008e6dec1d47466dd14942cec9aaac2cb3a5a6f0cd7ef961f86dfd6635d8c17fba435840130f10fc9991e9331e274313");
    }

    @Test
    public void testWithLength150() {
        testHex(new BMW384(),
                "4cfa1278903026f66fedd41374558be1b585d03c5c55dac94361df286d4bd39c7cb8037ed3b267b07c346626449d0cc5b0dd2cf221f7e4c3449a4be99985d2d5e67bff2923357ddeab5abcb4619f3a3a57b2cf928a022eb27676c6cf805689004fca4d41ea6c2d0a4789c7605f7bb838dd883b3ad3e6027e775bcf262881428099c7fff95b14c095ea130e0b9938a5e22fc52650f591",
                "a7fe142e66ed09a89f68272c2f9982e4ef2a285fcd4bda44be73916eedde9347abe7252fa56ac481a431de03075f7767");
    }

    @Test
    public void testWithLength151() {
        testHex(new BMW384(),
                "d3e65cb92cfa79662f6af493d696a07ccf32aaadcceff06e73e8d9f6f909209e66715d6e978788c49efb9087b170ecf3aa86d2d4d1a065ae0efc8924f365d676b3cb9e2bec918fd96d0b43dee83727c9a93bf56ca2b2e59adba85696546a815067fc7a78039629d4948d157e7b0d826d1bf8e81237bab7321312fdaa4d521744f988db6fdf04549d0fdca393d639c729af716e9c8bba48",
                "009055c15801039fb856dcde46f11a2e529940de4717260c7c0849400fece217f265adb1cdacb04a64d4923bb830eb3e");
    }

    @Test
    public void testWithLength152() {
        testHex(new BMW384(),
                "842cc583504539622d7f71e7e31863a2b885c56a0ba62db4c2a3f2fd12e79660dc7205ca29a0dc0a87db4dc62ee47a41db36b9ddb3293b9ac4baae7df5c6e7201e17f717ab56e12cad476be49608ad2d50309e7d48d2d8de4fa58ac3cfeafeee48c0a9eec88498e3efc51f54d300d828dddccb9d0b06dd021a29cf5cb5b2506915beb8a11998b8b886e0f9b7a80e97d91a7d01270f9a7717",
                "90227b38f337ebfaf68bac19aecbaf0a8df862bdc2f75fc6fd9a85c5ad49f4f449741de3c070e69f27e6cd547b9549db");
    }

    @Test
    public void testWithLength153() {
        testHex(new BMW384(),
                "6c4b0a0719573e57248661e98febe326571f9a1ca813d3638531ae28b4860f23c3a3a8ac1c250034a660e2d71e16d3acc4bf9ce215c6f15b1c0fc7e77d3d27157e66da9ceec9258f8f2bf9e02b4ac93793dd6e29e307ede3695a0df63cbdc0fc66fb770813eb149ca2a916911bee4902c47c7802e69e405fe3c04ceb5522792a5503fa829f707272226621f7c488a7698c0d69aa561be9f378",
                "3454896340a04965f8f795946fc6e0aa7f1243f373ba5ee397fca17045b28aa52a412a993500ee493037162df3b47d11");
    }

    @Test
    public void testWithLength154() {
        testHex(new BMW384(),
                "51b7dbb7ce2ffeb427a91ccfe5218fd40f9e0b7e24756d4c47cd55606008bdc27d16400933906fd9f30effdd4880022d081155342af3fb6cd53672ab7fb5b3a3bcbe47be1fd3a2278cae8a5fd61c1433f7d350675dd21803746cadca574130f01200024c6340ab0cc2cf74f2234669f34e9009ef2eb94823d62b31407f4ba46f1a1eec41641e84d77727b59e746b8a671bef936f05be820759fa",
                "bfe886309a2e1a4ec13de3c4e625165cf1cb25c193e9ec04f10abfeea2693213bf8de1605392c0e48a111201dcf88fd4");
    }

    @Test
    public void testWithLength155() {
        testHex(new BMW384(),
                "83599d93f5561e821bd01a472386bc2ff4efbd4aed60d5821e84aae74d8071029810f5e286f8f17651cd27da07b1eb4382f754cd1c95268783ad09220f5502840370d494beb17124220f6afce91ec8a0f55231f9652433e5ce3489b727716cf4aeba7dcda20cd29aa9a859201253f948dd94395aba9e3852bd1d60dda7ae5dc045b283da006e1cbad83cc13292a315db5553305c628dd091146597",
                "cb6561712987e06b678f078ae2797bcbc003f44f5d4d6ad21cdb7288bad755a56ddcbb0c9fa346dc018a5dfbdf746ed3");
    }

    @Test
    public void testWithLength156() {
        testHex(new BMW384(),
                "2be9bf526c9d5a75d565dd11ef63b979d068659c7f026c08bea4af161d85a462d80e45040e91f4165c074c43ac661380311a8cbed59cc8e4c4518e80cd2c78ab1cabf66bff83eab3a80148550307310950d034a6286c93a1ece8929e6385c5e3bb6ea8a7c0fb6d6332e320e71cc4eb462a2a62e2bfe08f0ccad93e61bedb5dd0b786a728ab666f07e0576d189c92bf9fb20dca49ac2d3956d47385e2",
                "d18140a877db269129840765cadf2f27209284dee3f1ff856162ae728dc4cb6a4875fe854dafda7b14230164ae47161c");
    }

    @Test
    public void testWithLength157() {
        testHex(new BMW384(),
                "ca76d3a12595a817682617006848675547d3e8f50c2210f9af906c0e7ce50b4460186fe70457a9e879e79fd4d1a688c70a347361c847ba0dd6aa52936eaf8e58a1be2f5c1c704e20146d366aeb3853bed9de9befe9569ac8aaea37a9fb7139a1a1a7d5c748605a8defb297869ebedd71d615a5da23496d11e11abbb126b206fa0a7797ee7de117986012d0362dcef775c2fe145ada6bda1ccb326bf644",
                "a8be96e8e741b1993fe3b2d4887538eae3bc73b7abddd4ec14774b6466fb4d958e6d4872bf8c325466b0e58babb305f5");
    }

    @Test
    public void testWithLength158() {
        testHex(new BMW384(),
                "f76b85dc67421025d64e93096d1d712b7baf7fb001716f02d33b2160c2c882c310ef13a576b1c2d30ef8f78ef8d2f465007109aad93f74cb9e7d7bef7c9590e8af3b267c89c15db238138c45833c98cc4a471a7802723ef4c744a853cf80a0c2568dd4ed58a2c9644806f42104cee53628e5bdf7b63b0b338e931e31b87c24b146c6d040605567ceef5960df9e022cb469d4c787f4cba3c544a1ac91f95f",
                "62ee8d177a2b6b0bf94ee2efd1c7419743329054b0fb534cd37f679d14b8a0730b3cfe596d94fb551a9ce2adbd468ca1");
    }

    @Test
    public void testWithLength159() {
        testHex(new BMW384(),
                "25b8c9c032ea6bcd733ffc8718fbb2a503a4ea8f71dea1176189f694304f0ff68e862a8197b839957549ef243a5279fc2646bd4c009b6d1edebf24738197abb4c992f6b1dc9ba891f570879accd5a6b18691a93c7d0a8d38f95b639c1daeb48c4c2f15ccf5b9d508f8333c32de78781b41850f261b855c4bebcc125a380c54d501c5d3bd07e6b52102116088e53d76583b0161e2a58d0778f091206aabd5a1",
                "bb91516cd324a53dcecf8a562071df3410008f10f896cee662dbccf3123d05d8e05ec2ac57712a28954017177aa8cf04");
    }

    @Test
    public void testWithLength160() {
        testHex(new BMW384(),
                "21cfdc2a7ccb7f331b3d2eefff37e48ad9fa9c788c3f3c200e0173d99963e1cbca93623b264e920394ae48bb4c3a5bb96ffbc8f0e53f30e22956adabc2765f57fb761e147ecbf8567533db6e50c8a1f894310a94edf806dd8ca6a0e141c0fa7c9fae6c6ae65f18c93a8529e6e5b553bf55f25be2e80a9882bd37f145fecbeb3d447a3c4e46c21524cc55cdd62f521ab92a8ba72b897996c49bb273198b7b1c9e",
                "0858f7e3ce551bd09e61305d1242c27248f1735ff54fff820397793006b0510807f5c28a6d951d77eaa57b891ced7575");
    }

    @Test
    public void testWithLength161() {
        testHex(new BMW384(),
                "4e452ba42127dcc956ef4f8f35dd68cb225fb73b5bc7e1ec5a898bba2931563e74faff3b67314f241ec49f4a7061e3bd0213ae826bab380f1f14faab8b0efddd5fd1bb49373853a08f30553d5a55ccbbb8153de4704f29ca2bdeef0419468e05dd51557ccc80c0a96190bbcc4d77ecff21c66bdf486459d427f986410f883a80a5bcc32c20f0478bb9a97a126fc5f95451e40f292a4614930d054c851acd019ccf",
                "a9cb5ccc2c92eb11d65725f86dedb460c3210c2a5bc882e5a761b21de7c034535904673a5752e2bc6018e28cb9553769");
    }

    @Test
    public void testWithLength162() {
        testHex(new BMW384(),
                "fa85671df7dadf99a6ffee97a3ab9991671f5629195049880497487867a6c446b60087fac9a0f2fcc8e3b24e97e42345b93b5f7d3691829d3f8ccd4bb36411b85fc2328eb0c51cb3151f70860ad3246ce0623a8dc8b3c49f958f8690f8e3860e71eb2b1479a5cea0b3f8befd87acaf5362435eaeccb52f38617bc6c5c2c6e269ead1fbd69e941d4ad2012da2c5b21bcfbf98e4a77ab2af1f3fda3233f046d38f1dc8",
                "4c6570d28d0e99650346d22e553e5af79db1187f2135137005eb3f97d9a0f6e0afaea823ff919a4d3b8d53d7563ed623");
    }

    @Test
    public void testWithLength163() {
        testHex(new BMW384(),
                "e90847ae6797fbc0b6b36d6e588c0a743d725788ca50b6d792352ea8294f5ba654a15366b8e1b288d84f5178240827975a763bc45c7b0430e8a559df4488505e009c63da994f1403f407958203cebb6e37d89c94a5eacf6039a327f6c4dbbc7a2a307d976aa39e41af6537243fc218dfa6ab4dd817b6a397df5ca69107a9198799ed248641b63b42cb4c29bfdd7975ac96edfc274ac562d0474c60347a078ce4c25e88",
                "22ed2b7dab0c38fc72340ab144d75131d33652561e17717742965478ad70a3af8787a96adc86b9a57f710810e47d49f8");
    }

    @Test
    public void testWithLength164() {
        testHex(new BMW384(),
                "f6d5c2b6c93954fc627602c00c4ca9a7d3ed12b27173f0b2c9b0e4a5939398a665e67e69d0b12fb7e4ceb253e8083d1ceb724ac07f009f094e42f2d6f2129489e846eaff0700a8d4453ef453a3eddc18f408c77a83275617fabc4ea3a2833aa73406c0e966276079d38e8e38539a70e194cc5513aaa457c699383fd1900b1e72bdfb835d1fd321b37ba80549b078a49ea08152869a918ca57f5b54ed71e4fd3ac5c06729",
                "6f5996d38961cd6511fcef6bfc369de4af2436a08295ea3012dd6f3f91e131e6c9e8070689ab0c3a93e3619dd0aba867");
    }

    @Test
    public void testWithLength165() {
        testHex(new BMW384(),
                "cf8562b1bed89892d67ddaaf3deeb28246456e972326dbcdb5cf3fb289aca01e68da5d59896e3a6165358b071b304d6ab3d018944be5049d5e0e2bb819acf67a6006111089e6767132d72dd85beddcbb2d64496db0cc92955ab4c6234f1eea24f2d51483f2e209e4589bf9519fac51b4d061e801125e605f8093bb6997bc163d551596fe4ab7cfae8fb9a90f6980480ce0c229fd1675409bd788354daf316240cfe0af93eb",
                "0369a76e36e937c135c77768c993cff286d86d9d4f0ff2d447e5a39e81eed864ebf3c7c36a1f5f16ef142b8be343877e");
    }

    @Test
    public void testWithLength166() {
        testHex(new BMW384(),
                "2ace31abb0a2e3267944d2f75e1559985db7354c6e605f18dc8470423fca30b7331d9b33c4a4326783d1caae1b4f07060eff978e4746bf0c7e30cd61040bd5ec2746b29863eb7f103ebda614c4291a805b6a4c8214230564a0557bc7102e0bd3ed23719252f7435d64d210ee2aafc585be903fa41e1968c50fd5d5367926df7a05e3a42cf07e656ff92de73b036cf8b19898c0cb34557c0c12c2d8b84e91181af467bc75a9d1",
                "4e2afe99d30d7a9dcd1518cd7882fdcadf5d4ae72292e08e3e66eb47aa714658f5992d9df8daedda078a7269c9906ca8");
    }

    @Test
    public void testWithLength167() {
        testHex(new BMW384(),
                "0d8d09aed19f1013969ce5e7eb92f83a209ae76be31c754844ea9116ceb39a22ebb6003017bbcf26555fa6624185187db8f0cb3564b8b1c06bf685d47f3286eda20b83358f599d2044bbf0583fab8d78f854fe0a596183230c5ef8e54426750eaf2cc4e29d3bdd037e734d863c2bd9789b4c243096138f7672c232314effdfc6513427e2da76916b5248933be312eb5dde4cf70804fb258ac5fb82d58d08177ac6f4756017fff5",
                "ed4499d8a205c968abcb8fb0b2dd0d461e40e02fec21f476a055f141e6ce79e88046b14a413cf38c55d278169806e305");
    }

    @Test
    public void testWithLength168() {
        testHex(new BMW384(),
                "c3236b73deb7662bf3f3daa58f137b358ba610560ef7455785a9befdb035a066e90704f929bd9689cef0ce3bda5acf4480bceb8d09d10b098ad8500d9b6071dfc3a14af6c77511d81e3aa8844986c3bea6f469f9e02194c92868cd5f51646256798ff0424954c1434bdfed9facb390b07d342e992936e0f88bfd0e884a0ddb679d0547ccdec6384285a45429d115ac7d235a717242021d1dc35641f5f0a48e8445dba58e6cb2c8ea",
                "2d7d0ef3282b1f7c79e9d4fe0890af3db50088e2609f848ad10b8cbfc4a9a21c06207ee627d2661d4186e2dcbabee491");
    }

    @Test
    public void testWithLength169() {
        testHex(new BMW384(),
                "b39feb8283eadc63e8184b51df5ae3fd41aac8a963bb0be1cd08aa5867d8d910c669221e73243360646f6553d1ca05a84e8dc0de05b6419ec349ca994480193d01c92525f3fb3dcefb08afc6d26947bdbbfd85193f53b50609c6140905c53a6686b58e53a319a57b962331ede98149af3de3118a819da4d76706a0424b4e1d2910b0ed26af61d150ebcb46595d4266a0bd7f651ba47d0c7f179ca28545007d92e8419d48fdfbd744ce",
                "f037d1dceaaef10f6721db2ba0c8e914bb305acde324d92fac7d6b6a5ce3a07521492c637f1017cf6644ca7fee47fbbd");
    }

    @Test
    public void testWithLength170() {
        testHex(new BMW384(),
                "a983d54f503803e8c7999f4edbbe82e9084f422143a932ddddc47a17b0b7564a7f37a99d0786e99476428d29e29d3c197a72bfab1342c12a0fc4787fd7017d7a6174049ea43b5779169ef7472bdbbd941dcb82fc73aac45a8a94c9f2bd3477f61fd3b796f02a1b8264a214c6fea74b7051b226c722099ec7883a462b83b6afdd4009248b8a237f605fe5a08fe7d8b45321421ebba67bd70a0b00ddbf94baab7f359d5d1eea105f28dcfb",
                "4a1e7417c436d76d7c2ec787bb8403a0cedcb345ec4695afc50f5614d4e58899007f2add7b90f5f0546ccc00941e60c2");
    }

    @Test
    public void testWithLength171() {
        testHex(new BMW384(),
                "e4d1c1897a0a866ce564635b74222f9696bf2c7f640dd78d7e2aca66e1b61c642bb03ea7536aae597811e9bf4a7b453ede31f97b46a5f0ef51a071a2b3918df16b152519ae3776f9f1edab4c2a377c3292e96408359d3613844d5eb393000283d5ad3401a318b12fd1474b8612f2bb50fb6a8b9e023a54d7dde28c43d6d8854c8d9d1155935c199811dbfc87e9e0072e90eb88681cc7529714f8fb8a2c9d88567adfb974ee205a9bf7b848",
                "7667eac837d0b7cec663d8522834ec1cfdac9c2c42782151bc5bbd87520a81f18372602ad41f229bd0b9a65645a499d0");
    }

    @Test
    public void testWithLength172() {
        testHex(new BMW384(),
                "b10c59723e3dcadd6d75df87d0a1580e73133a9b7d00cb95ec19f5547027323be75158b11f80b6e142c6a78531886d9047b08e551e75e6261e79785366d7024bd7cd9cf322d9be7d57fb661069f2481c7bb759cd71b4b36ca2bc2df6d3a328faebdb995a9794a8d72155ed551a1f87c80bf6059b43fc764900b18a1c2441f7487743cf84e565f61f8dd2ece6b6ccc9444049197aaaf53e926fbee3bfca8be588ec77f29d211be89de18b15f6",
                "ac2f743c0ad31b21a7ac6dd5aac87c7fea66e5cd1a6b06f0e8ad7be35261a4c532474c349f24d3602a00c52bff63ee0b");
    }

    @Test
    public void testWithLength173() {
        testHex(new BMW384(),
                "db11f609baba7b0ca634926b1dd539c8cbada24967d7add4d9876f77c2d80c0f4dcefbd7121548373582705cca2495bd2a43716fe64ed26d059cfb566b3364bd49ee0717bdd9810dd14d8fad80dbbdc4cafb37cc60fb0fe2a80fb4541b8ca9d59dce457738a9d3d8f641af8c3fd6da162dc16fc01aac527a4a0255b4d231c0be50f44f0db0b713af03d968fe7f0f61ed0824c55c4b5265548febd6aad5c5eedf63efe793489c39b8fd29d104ce",
                "2fd5832608f72dcb0e56cd4b29c685d45e9939cc95dcac367c2889cd2ce280e6ccd2b236b2322cf9d6684d48d0a803da");
    }

    @Test
    public void testWithLength174() {
        testHex(new BMW384(),
                "bebd4f1a84fc8b15e4452a54bd02d69e304b7f32616aadd90537937106ae4e28de9d8aab02d19bc3e2fde1d651559e296453e4dba94370a14dbbb2d1d4e2022302ee90e208321efcd8528ad89e46dc839ea9df618ea8394a6bff308e7726bae0c19bcd4be52da6258e2ef4e96aa21244429f49ef5cb486d7ff35cac1bacb7e95711944bccb2ab34700d42d1eb38b5d536b947348a458ede3dc6bd6ec547b1b0cae5b257be36a7124e1060c170ffa",
                "0875ba350126affba7154ac7556ec89acb2f3a7d44c80b49184fae8385558fe4ef0f40b15602e8f8e90b4053669183ef");
    }

    @Test
    public void testWithLength175() {
        testHex(new BMW384(),
                "5aca56a03a13784bdc3289d9364f79e2a85c12276b49b92db0adaa4f206d5028f213f678c3510e111f9dc4c1c1f8b6acb17a6413aa227607c515c62a733817ba5e762cc6748e7e0d6872c984d723c9bb3b117eb8963185300a80bfa65cde495d70a46c44858605fccbed086c2b45cef963d33294dbe9706b13af22f1b7c4cd5a001cfec251fba18e722c6e1c4b1166918b4f6f48a98b64b3c07fc86a6b17a6d0480ab79d4e6415b520f1c484d675b1",
                "b170f8d31f740c70cb2ec6aba91f2b17ba9f7d715c5d37bec14868e3b2aa931e347e919200076e0b829354a6b6810794");
    }

    @Test
    public void testWithLength176() {
        testHex(new BMW384(),
                "a5aad0e4646a32c85cfcac73f02fc5300f1982fabb2f2179e28303e447854094cdfc854310e5c0f60993ceff54d84d6b46323d930adb07c17599b35b505f09e784bca5985e0172257797fb53649e2e9723efd16865c31b5c3d5113b58bb0bfc8920fabdda086d7537e66d709d050bd14d0c960873f156fad5b3d3840cdfcdc9be6af519db262a27f40896ab25cc39f96984d650611c0d5a3080d5b3a1bf186abd42956588b3b58cd948970d298776060",
                "61795e2a3879febbe74cc116a1d48ba1737fd3337749d671f36a9af7c2b733415d433a2c3cdb4c31dc7e2605beacf8f7");
    }

    @Test
    public void testWithLength177() {
        testHex(new BMW384(),
                "06cbbe67e94a978203ead6c057a1a5b098478b4b4cbef5a97e93c8e42f5572713575fc2a884531d7622f8f879387a859a80f10ef02708cd8f7413ab385afc357678b9578c0ebf641ef076a1a30f1f75379e9dcb2a885bdd295905ee80c0168a62a9597d10cf12dd2d8cee46645c7e5a141f6e0e23aa482abe5661c16e69ef1e28371e2e236c359ba4e92c25626a7b7ff13f6ea4ae906e1cfe163e91719b1f750a96cbde5fbc953d9e576cd216afc90323a",
                "6b4fac6fab9b15173104ccdb5cdb918db71565ff611f1c278ea87d94b8d43f0f88790636c3df9e2f99e88eb729e255c5");
    }

    @Test
    public void testWithLength178() {
        testHex(new BMW384(),
                "f1c528cf7739874707d4d8ad5b98f7c77169de0b57188df233b2dc8a5b31eda5db4291dd9f68e6bad37b8d7f6c9c0044b3bf74bbc3d7d1798e138709b0d75e7c593d3cccdc1b20c7174b4e692add820ace262d45ccfae2077e878796347168060a162ecca8c38c1a88350bd63bb539134f700fd4addd5959e255337daa06bc86358fabcbefdfb5bc889783d843c08aadc6c4f6c36f65f156e851c9a0f917e4a367b5ad93d874812a1de6a7b93cd53ad97232",
                "d40c3a3b81d5d9ab6257c20f73372446977f43b49befd2dbc1cd2a3d83fd499580e948771069b41a9b69012b408a5fb3");
    }

    @Test
    public void testWithLength179() {
        testHex(new BMW384(),
                "9d9f3a7ecd51b41f6572fd0d0881e30390dfb780991dae7db3b47619134718e6f987810e542619dfaa7b505c76b7350c6432d8bf1cfebdf1069b90a35f0d04cbdf130b0dfc7875f4a4e62cdb8e525aadd7ce842520a482ac18f09442d78305fe85a74e39e760a4837482ed2f437dd13b2ec1042afcf9decdc3e877e50ff4106ad10a525230d11920324a81094da31deab6476aa42f20c84843cfc1c58545ee80352bdd3740dd6a16792ae2d86f11641bb717c2",
                "6d51c8303464c5c19a5b2d63ae9e552bde9d66e289085f8f5bd3b6171adca4c7c7fa7dc3d0f308510363b09821d0413b");
    }

    @Test
    public void testWithLength180() {
        testHex(new BMW384(),
                "5179888724819fbad3afa927d3577796660e6a81c52d98e9303261d5a4a83232f6f758934d50aa83ff9e20a5926dfebaac49529d006eb923c5ae5048ed544ec471ed7191edf46363383824f915769b3e688094c682b02151e5ee01e510b431c8865aff8b6b6f2f59cb6d129da79e97c6d2b8fa6c6da3f603199d2d1bcab547682a81cd6cf65f6551121391d78bcc23b5bd0e922ec6d8bf97c952e84dd28aef909aba31edb903b28fbfc33b7703cd996215a11238",
                "573ccf8ab994ea59b451a97082081f75eb8053105f232c145bae7b70f6d7efa4b42a7304a1382cdd7c21e52aa1a4d243");
    }

    @Test
    public void testWithLength181() {
        testHex(new BMW384(),
                "576ef3520d30b7a4899b8c0d5e359e45c5189add100e43be429a02fb3de5ff4f8fd0e79d9663acca72cd29c94582b19292a557c5b1315297d168fbb54e9e2ecd13809c2b5fce998edc6570545e1499dbe7fb74d47cd7f35823b212b05bf3f5a79caa34224fdd670d335fcb106f5d92c3946f44d3afcbae2e41ac554d8e6759f332b76be89a0324aa12c5482d1ea3ee89ded4936f3e3c080436f539fa137e74c6d3389bdf5a45074c47bc7b20b0948407a66d855e2f",
                "bc61adce1fcfdc60e24ea191473f0370a421a19bdbfcbcd8e0905e2e6566c4cb7d8f92b4012bd7400735c70192248d9e");
    }

    @Test
    public void testWithLength182() {
        testHex(new BMW384(),
                "0df2152fa4f4357c8741529dd77e783925d3d76e95bafa2b542a2c33f3d1d117d159cf473f82310356fee4c90a9e505e70f8f24859656368ba09381fa245eb6c3d763f3093f0c89b972e66b53d59406d9f01aea07f8b3b615cac4ee4d05f542e7d0dab45d67ccccd3a606ccbeb31ea1fa7005ba07176e60dab7d78f6810ef086f42f08e595f0ec217372b98970cc6321576d92ce38f7c397a403bada1548d205c343ac09deca86325373c3b76d9f32028fea8eb32515",
                "87057dd547089b735c9bc25d25ffe300761d2958fa5e2e81195dd0f8b6103f6ea7e639afa80301d03afd04632c1cbb8f");
    }

    @Test
    public void testWithLength183() {
        testHex(new BMW384(),
                "3e15350d87d6ebb5c8ad99d42515cfe17980933c7a8f6b8bbbf0a63728cefaad2052623c0bd5931839112a48633fb3c2004e0749c87a41b26a8b48945539d1ff41a4b269462fd199bfecd45374756f55a9116e92093ac99451aefb2af9fd32d6d7f5fbc7f7a540d5097c096ebc3b3a721541de073a1cc02f7fb0fb1b9327fb0b1218ca49c9487ab5396622a13ae546c97abdef6b56380dda7012a8384091b6656d0ab272d363cea78163ff765cdd13ab1738b940d16cae",
                "ad0d3a05f0e0e461ba17ce7dc9f0bd77053b830c0bd80ce0d2a2518afb400bc0e8d3c598b94f1f1f993a4a3627051502");
    }

    @Test
    public void testWithLength184() {
        testHex(new BMW384(),
                "c38d6b0b757cb552be40940ece0009ef3b0b59307c1451686f1a22702922800d58bce7a636c1727ee547c01b214779e898fc0e560f8ae7f61bef4d75eaa696b921fd6b735d171535e9edd267c192b99880c87997711002009095d8a7a437e258104a41a505e5ef71e5613ddd2008195f0c574e6ba3fe40099cfa116e5f1a2fa8a6da04badcb4e2d5d0de31fdc4800891c45781a0aac7c907b56d631fca5ce8b2cde620d11d1777ed9fa603541de794ddc5758fcd5fad78c0",
                "3143111df77267e7cecfe8f428b0c94a2c70945ea8f7b63a3669c8064c1003816edb871f80a343821b34cb45848fb4cb");
    }

    @Test
    public void testWithLength185() {
        testHex(new BMW384(),
                "8d2de3f0b37a6385c90739805b170057f091cd0c7a0bc951540f26a5a75b3e694631bb64c7635eed316f51318e9d8de13c70a2aba04a14836855f35e480528b776d0a1e8a23b547c8b8d6a0d09b241d3be9377160cca4e6793d00a515dc2992cb7fc741daca171431da99cce6f7789f129e2ac5cf65b40d703035cd2185bb936c82002daf8cbc27a7a9e554b06196630446a6f0a14ba155ed26d95bd627b7205c072d02b60db0fd7e49ea058c2e0ba202daff0de91e845cf79",
                "64c147ef38fefdb04604250480edc66200f208ed91b29f18876fbdcdf92de5241a134008f0ffeb20ea04044765d930ab");
    }

    @Test
    public void testWithLength186() {
        testHex(new BMW384(),
                "c464bbdad275c50dcd983b65ad1019b9ff85a1e71c807f3204bb2c921dc31fbcd8c5fc45868ae9ef85b6c9b83bba2a5a822201ed68586ec5ec27fb2857a5d1a2d09d09115f22dcc39fe61f5e1ba0ff6e8b4acb4c6da748be7f3f0839739394ff7fa8e39f7f7e84a33c3866875c01bcb1263c9405d91908e9e0b50e7459fabb63d8c6bbb73d8e3483c099b55bc30ff092ff68b6adedfd477d63570c9f5515847f36e24ba0b705557130cec57ebad1d0b31a378e91894ee26e3a04",
                "0cf3f11ff96f2fca76b01aa8510d46edccde2c7f03df146e772c7676436c2fade29c1eda724c3ceb311ebee8ad9bacac");
    }

    @Test
    public void testWithLength187() {
        testHex(new BMW384(),
                "8b8d68bb8a75732fe272815a68a1c9c5aa31b41dedc8493e76525d1d013d33cebd9e21a5bb95db2616976a8c07fcf411f5f6bc6f7e0b57aca78cc2790a6f9b898858ac9c79b165ff24e66677531e39f572be5d81eb3264524181115f32780257bfb9aeec6af12af28e587cac068a1a2953b59ad680f4c245b2e3ec36f59940d37e1d3db38e13edb29b5c0f404f6ff87f80fc8be7a225ff22fbb9c8b6b1d7330c57840d24bc75b06b80d30dad6806544d510af6c4785e823ac3e0b8",
                "1aaecd8311d8155bc7b5b58ea13c7356f1aaca403037aa4993c518853140b9a676a72a10f4493592fcf8c70b2cd14235");
    }

    @Test
    public void testWithLength188() {
        testHex(new BMW384(),
                "6b018710446f368e7421f1bc0ccf562d9c1843846bc8d98d1c9bf7d9d6fcb48bfc3bf83b36d44c4fa93430af75cd190bde36a7f92f867f58a803900df8018150384d85d82132f123006ac2aeba58e02a037fe6afbd65eca7c44977dd3dc74f48b6e7a1bfd5cc4dcf24e4d52e92bd4455848e4928b0eac8b7476fe3cc03e862aa4dff4470dbfed6de48e410f25096487ecfc32a27277f3f5023b2725ade461b1355889554a8836c9cf53bd767f5737d55184eea1ab3f53edd0976c485",
                "3fad775e70c595ae37810eebc9fa0137b7ec1e6e632b55feb0c0f447cdbdb6f9bffe0d41dec3c5d6b8d60f41916ffe34");
    }

    @Test
    public void testWithLength189() {
        testHex(new BMW384(),
                "c9534a24714bd4be37c88a3da1082eda7cabd154c309d7bd670dccd95aa535594463058a29f79031d6ecaa9f675d1211e9359be82669a79c855ea8d89dd38c2c761ddd0ec0ce9e97597432e9a1beae062cdd71edfdfd464119be9e69d18a7a7fd7ce0e2106f0c8b0abf4715e2ca48ef9f454dc203c96656653b727083513f8efb86e49c513bb758b3b052fe21f1c05bb33c37129d6cc81f1aef6adc45b0e8827a830fe545cf57d0955802c117d23ccb55ea28f95c0d8c2f9c5a242b33f",
                "2ac907e5a11813b9725f916ba60cc497e5d67ab10e597a150f750cc934386fb2bd23e18f7894842be4a830aa7c1f0d2b");
    }

    @Test
    public void testWithLength190() {
        testHex(new BMW384(),
                "07906c87297b867abf4576e9f3cc7f82f22b154afcbf293b9319f1b0584da6a40c27b32e0b1b7f412c4f1b82480e70a9235b12ec27090a5a33175a2bb28d8adc475cefe33f7803f8ce27967217381f02e67a3b4f84a71f1c5228e0c2ad971373f6f672624fcea8d1a9f85170fad30fa0bbd25035c3b41a6175d467998bd1215f6f3866f53847f9cf68ef3e2fbb54bc994de2302b829c5eea68ec441fcbafd7d16ae4fe9fff98bf00e5bc2ad54dd91ff9fda4dd77b6c754a91955d1fbaad0",
                "2b05146b35254025dde1bee0421189eab36151088f6af2107ae19dfb204b4dde0d198332d1ab7500260850519817d623");
    }

    @Test
    public void testWithLength191() {
        testHex(new BMW384(),
                "588e94b9054abc2189df69b8ba34341b77cdd528e7860e5defcaa79b0c9a452ad4b82aa306be84536eb7cedcbe058d7b84a6aef826b028b8a0271b69ac3605a9635ea9f5ea0aa700f3eb7835bc54611b922964300c953efe7491e3677c2cebe0822e956cd16433b02c68c4a23252c3f9e151a416b4963257b783e038f6b4d5c9f110f871652c7a649a7bcedcbccc6f2d0725bb903cc196ba76c76aa9f10a190b1d1168993baa9ffc96a1655216773458bec72b0e39c9f2c121378feab4e76a",
                "a708ef81ab3df3b2d8fd9ebddf552a4bccf6ae3d020b0165e43ad6b04daf43ac703f96e03539dac92cf0d2b7cce6ab5b");
    }

    @Test
    public void testWithLength192() {
        testHex(new BMW384(),
                "08959a7e4baae874928813364071194e2939772f20db7c3157078987c557c2a6d5abe68d520eef3dc491692e1e21bcd880adebf63bb4213b50897fa005256ed41b5690f78f52855c8d9168a4b666fce2da2b456d7a7e7c17ab5f2fb1ee90b79e698712e963715983fd07641ae4b4e9dc73203fac1ae11fa1f8c7941fcc82eab247addb56e2638447e9d609e610b60ce086656aaebf1da3c8a231d7d94e2fd0afe46b391ff14a72eaeb3f44ad4df85866def43d4781a0b3578bc996c87970b132",
                "e3aa13a9c6163ea7776a06b14f9bb83e5dac5016c7ed6a4ede7e98564674ac00241d46c8792b0357e080cf379a2fe80e");
    }

    @Test
    public void testWithLength193() {
        testHex(new BMW384(),
                "cb2a234f45e2ecd5863895a451d389a369aab99cfef0d5c9ffca1e6e63f763b5c14fb9b478313c8e8c0efeb3ac9500cf5fd93791b789e67eac12fd038e2547cc8e0fc9db591f33a1e4907c64a922dda23ec9827310b306098554a4a78f050262db5b545b159e1ff1dca6eb734b872343b842c57eafcfda8405eedbb48ef32e99696d135979235c3a05364e371c2d76f1902f1d83146df9495c0a6c57d7bf9ee77e80f9787aee27be1fe126cdc9ef893a4a7dcbbc367e40fe4e1ee90b42ea25af01",
                "9da8eb669f9990ee39fb6ae69e54c3f609355b57ca8fc24b6d5f97f04f6789fe3ea29de2acf3233e98228a9ff367f4e5");
    }

    @Test
    public void testWithLength194() {
        testHex(new BMW384(),
                "d16beadf02ab1d4dc6f88b8c4554c51e866df830b89c06e786a5f8757e8909310af51c840efe8d20b35331f4355d80f73295974653ddd620cdde4730fb6c8d0d2dcb2b45d92d4fbdb567c0a3e86bd1a8a795af26fbf29fc6c65941cddb090ff7cd230ac5268ab4606fccba9eded0a2b5d014ee0c34f0b2881ac036e24e151be89eeb6cd9a7a790afccff234d7cb11b99ebf58cd0c589f20bdac4f9f0e28f75e3e04e5b3debce607a496d848d67fa7b49132c71b878fd5557e082a18eca1fbda94d4b",
                "9db5baeb95916878bdb926ab8785e59cf75cf4e99f6062e92584a6012ab2f43dfce735bffb8c8f1d197cee2677976bb8");
    }

    @Test
    public void testWithLength195() {
        testHex(new BMW384(),
                "8f65f6bc59a85705016e2bae7fe57980de3127e5ab275f573d334f73f8603106ec3553016608ef2dd6e69b24be0b7113bf6a760ba6e9ce1c48f9e186012cf96a1d4849d75df5bb8315387fd78e9e153e76f8ba7ec6c8849810f59fb4bb9b004318210b37f1299526866f44059e017e22e96cbe418699d014c6ea01c9f0038b10299884dbec3199bb05adc94e955a1533219c1115fed0e5f21228b071f40dd57c4240d98d37b73e412fe0fa4703120d7c0c67972ed233e5deb300a22605472fa3a3ba86",
                "e74c6b7125ed25a52e03b69860a539fd8fe76cca0507cebd95ed5b84f8de0d1d03491f53edf2dd94fed626208afd10c2");
    }

    @Test
    public void testWithLength196() {
        testHex(new BMW384(),
                "84891e52e0d451813210c3fd635b39a03a6b7a7317b221a7abc270dfa946c42669aacbbbdf801e1584f330e28c729847ea14152bd637b3d0f2b38b4bd5bf9c791c58806281103a3eabbaede5e711e539e6a8b2cf297cf351c078b4fa8f7f35cf61bebf8814bf248a01d41e86c5715ea40c63f7375379a7eb1d78f27622fb468ab784aaaba4e534a6dfd1df6fa15511341e725ed2e87f98737ccb7b6a6dfae416477472b046bf1811187d151bfa9f7b2bf9acdb23a3be507cdf14cfdf517d2cb5fb9e4ab6",
                "444c54c658f4d852e0bec6671eaba1531262729e5b980d31bcd0748e285c37cf39a54c60b9f5c7d794109eacdf4c6d8d");
    }

    @Test
    public void testWithLength197() {
        testHex(new BMW384(),
                "fdd7a9433a3b4afabd7a3a5e3457e56debf78e84b7a0b0ca0e8c6d53bd0c2dae31b2700c6128334f43981be3b213b1d7a118d59c7e6b6493a86f866a1635c12859cfb9ad17460a77b4522a5c1883c3d6acc86e6162667ec414e9a104aa892053a2b1d72165a855bacd8faf8034a5dd9b716f47a0818c09bb6baf22aa503c06b4ca261f557761989d2afbd88b6a678ad128af68672107d0f1fc73c5ca740459297b3292b281e93bceb761bde7221c3a55708e5ec84472cddcaa84ecf23723cc0991355c6280",
                "2483e1df22bd7689d68c7b42b028143e123fb236e019f287931c4b10f3cb244c8098664ff924c3fb124efdc80c58ce49");
    }

    @Test
    public void testWithLength198() {
        testHex(new BMW384(),
                "70a40bfbef92277a1aad72f6b79d0177197c4ebd432668cfec05d099accb651062b5dff156c0b27336687a94b26679cfdd9daf7ad204338dd9c4d14114033a5c225bd11f217b5f4732da167ee3f939262d4043fc9cba92303b7b5e96aea12adda64859df4b86e9ee0b58e39091e6b188b408ac94e1294a8911245ee361e60e601eff58d1d37639f3753bec80ebb4efde25817436076623fc65415fe51d1b0280366d12c554d86743f3c3b6572e400361a60726131441ba493a83fbe9afda90f7af1ae717238d",
                "83367ba1436915a89f80eabc2a64ea9ea9923cda2312d67af0fea69d00dbb16bee93d2317aa1e7ff12ad1d83d9db04b0");
    }

    @Test
    public void testWithLength199() {
        testHex(new BMW384(),
                "74356e449f4bf8644f77b14f4d67cb6bd9c1f5ae357621d5b8147e562b65c66585caf2e491b48529a01a34d226d436959153815380d5689e30b35357cdac6e08d3f2b0e88e200600d62bd9f5eaf488df86a4470ea227006182e44809009868c4c280c43d7d64a5268fa719074960087b3a6abc837882f882c837834535929389a12b2c78187e2ea07ef8b8eef27dc85002c3ae35f1a50bee6a1c48ba7e175f3316670b27983472aa6a61eed0a683a39ee323080620ea44a9f74411ae5ce99030528f9ab49c79f2",
                "0606e2601d6aacf670cb17f1c4ab20f70dbaa73dd01fefe01bc6bf0c804fe4a9ea49e0763c4972eabc8e329ab325a2f2");
    }

    @Test
    public void testWithLength200() {
        testHex(new BMW384(),
                "8c3798e51bc68482d7337d3abb75dc9ffe860714a9ad73551e120059860dde24ab87327222b64cf774415a70f724cdf270de3fe47dda07b61c9ef2a3551f45a5584860248fabde676e1cd75f6355aa3eaeabe3b51dc813d9fb2eaa4f0f1d9f834d7cad9c7c695ae84b329385bc0bef895b9f1edf44a03d4b410cc23a79a6b62e4f346a5e8dd851c2857995ddbf5b2d717aeb847310e1f6a46ac3d26a7f9b44985af656d2b7c9406e8a9e8f47dcb4ef6b83caacf9aefb6118bfcff7e44bef6937ebddc89186839b77",
                "75409ec529d3a3f93cf7fb103416ddd924e1e398f2614d9d57d67f57893b1956883a2b8c641d0d63c11d57a90aa1965e");
    }

    @Test
    public void testWithLength201() {
        testHex(new BMW384(),
                "fa56bf730c4f8395875189c10c4fb251605757a8fecc31f9737e3c2503b02608e6731e85d7a38393c67de516b85304824bfb135e33bf22b3a23b913bf6acd2b7ab85198b8187b2bcd454d5e3318cacb32fd6261c31ae7f6c54ef6a7a2a4c9f3ecb81ce3555d4f0ad466dd4c108a90399d70041997c3b25345a9653f3c9a6711ab1b91d6a9d2216442da2c973cbd685ee7643bfd77327a2f7ae9cb283620a08716dfb462e5c1d65432ca9d56a90e811443cd1ecb8f0de179c9cb48ba4f6fec360c66f252f6e64edc96b",
                "436eb17add883ddc646f2a6f3768e8479bba9090698e505f022736371144791fb5b89f925b011f90954182bc5198e150");
    }

    @Test
    public void testWithLength202() {
        testHex(new BMW384(),
                "b6134f9c3e91dd8000740d009dd806240811d51ab1546a974bcb18d344642baa5cd5903af84d58ec5ba17301d5ec0f10ccd0509cbb3fd3fff9172d193af0f782252fd1338c7244d40e0e42362275b22d01c4c3389f19dd69bdf958ebe28e31a4ffe2b5f18a87831cfb7095f58a87c9fa21db72ba269379b2dc2384b3da953c7925761fed324620acea435e52b424a7723f6a2357374157a34cd8252351c25a1b232826cefe1bd3e70ffc15a31e7c0598219d7f00436294d11891b82497bc78aa5363892a2495df8c1eef",
                "a37a4b7b730535d561a549cc73ebcfcc3d7090b65f027ecfa0eaf7a3a1629f9dd9f12339a1d388fc7df86b05c37bcd0e");
    }

    @Test
    public void testWithLength203() {
        testHex(new BMW384(),
                "c941cdb9c28ab0a791f2e5c8e8bb52850626aa89205bec3a7e22682313d198b1fa33fc7295381354858758ae6c8ec6fac3245c6e454d16fa2f51c4166fab51df272858f2d603770c40987f64442d487af49cd5c3991ce858ea2a60dab6a65a34414965933973ac2457089e359160b7cdedc42f29e10a91921785f6b7224ee0b349393cdcff6151b50b377d609559923d0984cda6000829b916ab6896693ef6a2199b3c22f7dc5500a15b8258420e314c222bc000bc4e5413e6dd82c993f8330f5c6d1be4bc79f08a1a0a46",
                "c8f4ad865568af5274cd330db6484506608d0a5087a058abdea55bd2edf1b707cfecb82227f5c00af4cde802a393c401");
    }

    @Test
    public void testWithLength204() {
        testHex(new BMW384(),
                "4499efffac4bcea52747efd1e4f20b73e48758be915c88a1ffe5299b0b005837a46b2f20a9cb3c6e64a9e3c564a27c0f1c6ad1960373036ec5bfe1a8fc6a435c2185ed0f114c50e8b3e4c7ed96b06a036819c9463e864a58d6286f785e32a804443a56af0b4df6abc57ed5c2b185ddee8489ea080deeee66aa33c2e6dab36251c402682b6824821f998c32163164298e1fafd31babbcffb594c91888c6219079d907fdb438ed89529d6d96212fd55abe20399dbefd342248507436931cdead496eb6e4a80358acc78647d043",
                "4374f7c95fd47f00d6372b604aa1c6cddc5171aa9e810ff4d86199f7a23d8b02a5afa4f43fe01b9025e8097e6df5b3b0");
    }

    @Test
    public void testWithLength205() {
        testHex(new BMW384(),
                "eecbb8fdfa4da62170fd06727f697d81f83f601ff61e478105d3cb7502f2c89bf3e8f56edd469d049807a38882a7eefbc85fc9a950952e9fa84b8afebd3ce782d4da598002827b1eb98882ea1f0a8f7aa9ce013a6e9bc462fb66c8d4a18da21401e1b93356eb12f3725b6db1684f2300a98b9a119e5d27ff704affb618e12708e77e6e5f34139a5a41131fd1d6336c272a8fc37080f041c71341bee6ab550cb4a20a6ddb6a8e0299f2b14bc730c54b8b1c1c487b494bdccfd3a53535ab2f231590bf2c4062fd2ad58f906a2d0d",
                "9665f7aa1237fb80cb15f87182e56cb760b802a651529b686ac5be026d982e7cfb1f7cfef394f5f5fea48295d8bf17f1");
    }

    @Test
    public void testWithLength206() {
        testHex(new BMW384(),
                "e64f3e4ace5c8418d65fec2bc5d2a303dd458034736e3b0df719098be7a206deaf52d6ba82316caf330ef852375188cde2b39cc94aa449578a7e2a8e3f5a9d68e816b8d16889fbc0ebf0939d04f63033ae9ae2bdab73b88c26d6bd25ee460ee1ef58fb0afa92cc539f8c76d3d097e7a6a63ebb9b5887edf3cf076028c5bbd5b9db3211371ad3fe121d4e9bf44229f4e1ecf5a0f9f0eba4d5ceb72878ab22c3f0eb5a625323ac66f7061f4a81fac834471e0c59553f108475fe290d43e6a055ae3ee46fb67422f814a68c4be3e8c9",
                "36da8a93349d95cf049df1a93de4ca07d35f7209e11f9f29930fdae117ffbd606f7aec87b1c643ed2cfbff16b95e22c1");
    }

    @Test
    public void testWithLength207() {
        testHex(new BMW384(),
                "d2cb2d733033f9e91395312808383cc4f0ca974e87ec68400d52e96b3fa6984ac58d9ad0938dde5a973008d818c49607d9de2284e7618f1b8aed8372fbd52ed54557af4220fac09dfa8443011699b97d743f8f2b1aef3537ebb45dcc9e13dfb438428ee190a4efdb3caeb7f3933117bf63abdc7e57beb4171c7e1ad260ab0587806c4d137b6316b50abc9cce0dff3acada47bbb86be777e617bbe578ff4519844db360e0a96c6701290e76bb95d26f0f804c8a4f2717eac4e7de9f2cff3bbc55a17e776c0d02856032a6cd10ad2838",
                "4c61b2461076a56ccc6d5649fb52443ff89aa2d7e44dd96aa6f9eca3aa35a5e0d38386d703aa5624879dc48a869659eb");
    }

    @Test
    public void testWithLength208() {
        testHex(new BMW384(),
                "f2998955613dd414cc111df5ce30a995bb792e260b0e37a5b1d942fe90171a4ac2f66d4928d7ad377f4d0554cbf4c523d21f6e5f379d6f4b028cdcb9b1758d3b39663242ff3cb6ede6a36a6f05db3bc41e0d861b384b6dec58bb096d0a422fd542df175e1be1571fb52ae66f2d86a2f6824a8cfaacbac4a7492ad0433eeb15454af8f312b3b2a577750e3efbd370e8a8cac1582581971fba3ba4bd0d76e718dacf8433d33a59d287f8cc92234e7a271041b526e389efb0e40b6a18b3aaf658e82ed1c78631fd23b4c3eb27c3faec8685",
                "efb8d8250c79a1f646b336d7b2c4eb26fb62d2582065b45b970333bd540f75264ee7d4d59f384da5f8d401e878ef251e");
    }

    @Test
    public void testWithLength209() {
        testHex(new BMW384(),
                "447797e2899b72a356ba55bf4df3acca6cdb1041eb477bd1834a9f9acbc340a294d729f2f97df3a610be0ff15edb9c6d5db41644b9874360140fc64f52aa03f0286c8a640670067a84e017926a70438db1bb361defee7317021425f8821def26d1efd77fc853b818545d055adc9284796e583c76e6fe74c9ac2587aa46aa8f8804f2feb5836cc4b3ababab8429a5783e17d5999f32242eb59ef30cd7adabc16d72dbdb097623047c98989f88d14eaf02a7212be16ec2d07981aaa99949ddf89ecd90333a77bc4e1988a82abf7c7caf3291",
                "d1f0672fda23d944f4d30810bdcba8903c9c1a9a117c188235ce81249a470b1088999d74a2bf2b8b0c5b74bcb00bb0cc");
    }

    @Test
    public void testWithLength210() {
        testHex(new BMW384(),
                "9f2c18ade9b380c784e170fb763e9aa205f64303067eb1bcea93df5dac4bf5a2e00b78195f808df24fc76e26cb7be31dc35f0844cded1567bba29858cffc97fb29010331b01d6a3fb3159cc1b973d255da9843e34a0a4061cabdb9ed37f241bfabb3c20d32743f4026b59a4ccc385a2301f83c0b0a190b0f2d01acb8f0d41111e10f2f4e149379275599a52dc089b35fdd5234b0cfb7b6d8aebd563ca1fa653c5c021dfd6f5920e6f18bfafdbecbf0ab00281333ed50b9a999549c1c8f8c63d7626c48322e9791d5ff72294049bde91e73f8",
                "acc085c16dbf62004037174b650d3b951f805a61ea74954e6a6e6d8a50b9ee821b1fce4e256bc86affb5d5b3f8d7b186");
    }

    @Test
    public void testWithLength211() {
        testHex(new BMW384(),
                "ae159f3fa33619002ae6bcce8cbbdd7d28e5ed9d61534595c4c9f43c402a9bb31f3b301cbfd4a43ce4c24cd5c9849cc6259eca90e2a79e01ffbac07ba0e147fa42676a1d668570e0396387b5bcd599e8e66aaed1b8a191c5a47547f61373021fa6deadcb55363d233c24440f2c73dbb519f7c9fa5a8962efd5f6252c0407f190dfefad707f3c7007d69ff36b8489a5b6b7c557e79dd4f50c06511f599f56c896b35c917b63ba35c6ff8092baf7d1658e77fc95d8a6a43eeb4c01f33f03877f92774be89c1114dd531c011e53a34dc248a2f0e6",
                "0aa737b78742227376f50fa7f13f92d786440d1687ef08be9b5223cd20d23bd1c704ea7cbf25607cd24e47d8bb7d53c9");
    }

    @Test
    public void testWithLength212() {
        testHex(new BMW384(),
                "3b8e97c5ffc2d6a40fa7de7fcefc90f3b12c940e7ab415321e29ee692dfac799b009c99dcddb708fce5a178c5c35ee2b8617143edc4c40b4d313661f49abdd93cea79d117518805496fe6acf292c4c2a1f76b403a97d7c399daf85b46ad84e16246c67d6836757bde336c290d5d401e6c1386ab32797af6bb251e9b2d8fe754c47482b72e0b394eab76916126fd68ea7d65eb93d59f5b4c5ac40f7c3b37e7f3694f29424c24af8c8f0ef59cd9dbf1d28e0e10f799a6f78cad1d45b9db3d7dee4a7059abe99182714983b9c9d44d7f5643596d4f3",
                "c54f9d937c6f39292b2648590193db4b45c4e57819ae64135090ce4d77326e26e078de3175ad1dad1a950cab79e3c698");
    }

    @Test
    public void testWithLength213() {
        testHex(new BMW384(),
                "3434ec31b10fafdbfeec0dd6bd94e80f7ba9dca19ef075f7eb017512af66d6a4bcf7d16ba0819a1892a6372f9b35bcc7ca8155ee19e8428bc22d214856ed5fa9374c3c09bde169602cc219679f65a1566fc7316f4cc3b631a18fb4449fa6afa16a3db2bc4212eff539c67cf184680826535589c7111d73bffce431b4c40492e763d9279560aaa38eb2dc14a212d723f994a1fe656ff4dd14551ce4e7c621b2aa5604a10001b2878a897a28a08095c325e10a26d2fb1a75bfd64c250309bb55a44f23bbac0d5516a1c687d3b41ef2fbbf9cc56d4739",
                "9cb6ca022830752aa45bc12dcf91e867ff930fca08f0d2a430b63b313300c3285893bed98ae56e60900ee1a0722122ce");
    }

    @Test
    public void testWithLength214() {
        testHex(new BMW384(),
                "7c7953d81c8d208fd1c97681d48f49dd003456de60475b84070ef4847c333b74575b1fc8d2a186964485a3b8634feaa3595aaa1a2f4595a7d6b6153563dee31bbac443c8a33eed6d5d956a980a68366c2527b550ee950250dfb691eacbd5d56ae14b970668be174c89df2fea43ae52f13142639c884fd62a3683c0c3792f0f24ab1318bcb27e21f4737fab62c77ea38bc8fd1cf41f7dab64c13febe7152bf5bb7ab5a78f5346d43cc741cb6f72b7b8980f268b68bf62abdfb1577a52438fe14b591498cc95f071228460c7c5d5ceb4a7bde588e7f21c",
                "c1a3609687674fdc98a65e48998d15278afe0edec4911b8b28d4a8028f143622cf49e39291e9bdb1d3892f4ec3f9b0db");
    }

    @Test
    public void testWithLength215() {
        testHex(new BMW384(),
                "7a6a4f4fdc59a1d223381ae5af498d74b7252ecf59e389e49130c7eaee626e7bd9897effd92017f4ccde66b0440462cdedfd352d8153e6a4c8d7a0812f701cc737b5178c2556f07111200eb627dbc299caa792dfa58f35935299fa3a3519e9b03166dffa159103ffa35e8577f7c0a86c6b46fe13db8e2cdd9dcfba85bdddcce0a7a8e155f81f712d8e9fe646153d3d22c811bd39f830433b2213dd46301941b59293fd0a33e2b63adbd95239bc01315c46fdb678875b3c81e053a40f581cfbec24a1404b1671a1b88a6d06120229518fb13a74ca0ac5ae",
                "bf18a21185e07f5413d0c07472c05b10e532d6194279ba14e0d950823adfbb1a492afed6c062a5b2c3495df9f2b3ed90");
    }

    @Test
    public void testWithLength216() {
        testHex(new BMW384(),
                "d9faa14cebe9b7de551b6c0765409a33938562013b5e8e0e1e0a6418df7399d0a6a771fb81c3ca9bd3bb8e2951b0bc792525a294ebd1083688806fe5e7f1e17fd4e3a41d00c89e8fcf4a363caedb1acb558e3d562f1302b3d83bb886ed27b76033798131dab05b4217381eaaa7ba15ec820bb5c13b516dd640eaec5a27d05fdfca0f35b3a5312146806b4c0275bcd0aaa3b2017f346975db566f9b4d137f4ee10644c2a2da66deeca5342e236495c3c6280528bfd32e90af4cd9bb908f34012b52b4bc56d48cc8a6b59bab014988eabd12e1a0a1c2e170e7",
                "c79e6cb19bbce32a3ec436d773e7650d2e88d8929bb6e352c6d1c1eb5600249fbadde32fde9d53fc75e1d04c0d771f25");
    }

    @Test
    public void testWithLength217() {
        testHex(new BMW384(),
                "2d8427433d0c61f2d96cfe80cf1e932265a191365c3b61aaa3d6dcc039f6ba2ad52a6a8cc30fc10f705e6b7705105977fa496c1c708a277a124304f1fc40911e7441d1b5e77b951aad7b01fd5db1b377d165b05bbf898042e39660caf8b279fe5229d1a8db86c0999ed65e53d01ccbc4b43173ccf992b3a14586f6ba42f5fe30afa8ae40c5df29966f9346da5f8b35f16a1de3ab6de0f477d8d8660918060e88b9b9e9ca6a4207033b87a812dbf5544d39e4882010f82b6ce005f8e8ff6fe3c3806bc2b73c2b83afb704345629304f9f86358712e9fae3ca3e",
                "4c09c75f6a68f91e230e99a249fe3fe0eafcfd7b6a8d7d955f4b747c019e20525f5ba578d8c84ce4df0bfa710af3c276");
    }

    @Test
    public void testWithLength218() {
        testHex(new BMW384(),
                "5e19d97887fcaac0387e22c6f803c34a3dacd2604172433f7a8a7a526ca4a2a1271ecfc5d5d7be5ac0d85d921095350dfc65997d443c21c8094e0a3fefd2961bcb94aed03291ae310ccda75d8ace4bc7d89e7d3e5d1650bda5d668b8b50bfc8e608e184f4d3a9a2badc4ff5f07e0c0bc8a9f2e0b2a26fd6d8c550008faaab75fd71af2a424bec9a7cd9d83fad4c8e9319115656a8717d3b523a68ff8004258b9990ed362308461804ba3e3a7e92d8f2ffae5c2fba55ba5a3c27c0a2f71bd711d2fe1799c2adb31b200035481e9ee5c4adf2ab9c0fa50b23975cf",
                "9224a4f13596c351cc268f49ef8c16d15c5605d8c3bfbe4fad94a70bb7df55ed4f55aebffe8d7d4bda99f46773408276");
    }

    @Test
    public void testWithLength219() {
        testHex(new BMW384(),
                "c8e976ab4638909387ce3b8d4e510c3230e5690e02c45093b1d297910abc481e56eea0f296f98379dfc9080af69e73b2399d1c143bee80ae1328162ce1ba7f6a8374679b20aacd380eb4e61382c99998704d62701afa914f9a2705cdb065885f50d086c3eb5753700c387118bb142f3e6da1e988dfb31ac75d7368931e45d1391a274b22f83ceb072f9bcabc0b216685bfd789f5023971024b1878a205442522f9ea7d8797a4102a3df41703768251fd5e017c85d1200a464118aa35654e7ca39f3c375b8ef8cbe7534dbc64bc20befb417cf60ec92f63d9ee7397",
                "468f783d229919f69b0800f735f2374cf92ed6c53e32e5c19ba389505cac9ae8c218d166096315aee05539b3a8fe0c6f");
    }

    @Test
    public void testWithLength220() {
        testHex(new BMW384(),
                "7145fa124b7429a1fc2231237a949ba7201bcc1822d3272de005b682398196c25f7e5cc2f289fbf44415f699cb7fe6757791b1443410234ae061edf623359e2b4e32c19bf88450432dd01caa5eb16a1dc378f391ca5e3c4e5f356728bddd4975db7c890da8bbc84cc73ff244394d0d48954978765e4a00b593f70f2ca082673a261ed88dbcef1127728d8cd89bc2c597e9102ced6010f65fa75a14ebe467fa57ce3bd4948b6867d74a9df5c0ec6f530cbf2ee61ce6f06bc8f2864dff5583776b31df8c7ffcb61428a56bf7bd37188b4a5123bbf338393af46eda85e6",
                "bd2df9403d7ca12323771116b4b12d8222bca41c1e951051af49df6c6141e5d793bd86f7dba0237663e0532c6ff0994e");
    }

    @Test
    public void testWithLength221() {
        testHex(new BMW384(),
                "7fdfadcc9d29bad23ae038c6c65cda1aef757221b8872ed3d75ff8df7da0627d266e224e812c39f7983e4558bfd0a1f2bef3feb56ba09120ef762917b9c093867948547aee98600d10d87b20106878a8d22c64378bf634f7f75900c03986b077b0bf8b740a82447b61b99fee5376c5eb6680ec9e3088f0bdd0c56883413d60c1357d3c811950e5890e7600103c916341b80c743c6a852b7b4fb60c3ba21f3bc15b8382437a68454779cf3cd7f9f90ccc8ef28d0b706535b1e4108eb5627bb45d719cb046839aee311ca1abdc8319e050d67972cb35a6b1601b25dbf487",
                "ca421a853aa1fa3d9fe2044e37884a63f504122ecbf6df0f1e0c46df61c2b58f16d0b6aa1ffbd96e50b05e2c47cbcc63");
    }

    @Test
    public void testWithLength222() {
        testHex(new BMW384(),
                "988638219fd3095421f826f56e4f09e356296b628c3ce6930c9f2e758fd1a80c8273f2f61e4daae65c4f110d3e7ca0965ac7d24e34c0dc4ba2d6ff0bf5bbe93b3585f354d7543cb542a1aa54674d375077f2d360a8f4d42f3db131c3b7ab7306267ba107659864a90c8c909460a73621d1f5d9d3fd95beb19b23db1cb6c0d0fba91d36891529b8bd8263caa1bab56a4affaed44962df096d8d5b1eb845ef31188b3e10f1af811a13f156beb7a288aae593ebd1471b624aa1a7c6adf01e2200b3d72d88a3aed3100c88231e41efc376906f0b580dc895f080fda5741db1cb",
                "db5bdec4192b6d9cbe8627733ca7d8a9da6a76697b4ea8d37c8b9b16391f941568caf3224b02a8cdb6be2d2b791b150a");
    }

    @Test
    public void testWithLength223() {
        testHex(new BMW384(),
                "5aab62756d307a669d146aba988d9074c5a159b3de85151a819b117ca1ff6597f6156e80fdd28c9c3176835164d37da7da11d94e09add770b68a6e081cd22ca0c004bfe7cd283bf43a588da91f509b27a6584c474a4a2f3ee0f1f56447379240a5ab1fb77fdca49b305f07ba86b62756fb9efb4fc225c86845f026ea542076b91a0bc2cdd136e122c659be259d98e5841df4c2f60330d4d8cdee7bf1a0a244524eecc68ff2aef5bf0069c9e87a11c6e519de1a4062a10c83837388f7ef58598a3846f49d499682b683c4a062b421594fafbc1383c943ba83bdef515efcf10d",
                "bd4da04ad38550a5d4d153ae858fe31219107437b2ea2a06e8dd897e44af5287fec1abe05b25ce1eed753a9aafec9119");
    }

    @Test
    public void testWithLength224() {
        testHex(new BMW384(),
                "47b8216aa0fbb5d67966f2e82c17c07aa2d6327e96fcd83e3de7333689f3ee79994a1bf45082c4d725ed8d41205cb5bcdf5c341f77facb1da46a5b9b2cbc49eadf786bcd881f371a95fa17df73f606519aea0ff79d5a11427b98ee7f13a5c00637e2854134691059839121fea9abe2cd1bcbbbf27c74caf3678e05bfb1c949897ea01f56ffa4dafbe8644611685c617a3206c7a7036e4ac816799f693dafe7f19f303ce4eba09d21e03610201bfc665b72400a547a1e00fa9b7ad8d84f84b34aef118515e74def11b9188bd1e1f97d9a12c30132ec2806339bdadacda2fd8b78",
                "57a8740a01c3406a0f10f923ea9feb95183284426df334e99bbd5125265398e95e6175c5b33317ab6ae2a5767a960b6e");
    }

    @Test
    public void testWithLength225() {
        testHex(new BMW384(),
                "8cff1f67fe53c098896d9136389bd8881816ccab34862bb67a656e3d98896f3ce6ffd4da73975809fcdf9666760d6e561c55238b205d8049c1cedeef374d1735daa533147bfa960b2cce4a4f254176bb4d1bd1e89654432b8dbe1a135c42115b394b024856a2a83dc85d6782be4b444239567ccec4b184d4548eae3ff6a192f343292ba2e32a0f267f31cc26719eb85245d415fb897ac2da433ee91a99424c9d7f1766a44171d1651001c38fc79294accc68ceb5665d36218454d3ba169ae058a831338c17743603f81ee173bfc0927464f9bd728dee94c6aeab7aae6ee3a627e8",
                "4f87c3e2435eb55f4524fb1a4385bfaf9b8835903b0bc654c4d98b72c71067f9518163823a9a8747fef8caedd556c30a");
    }

    @Test
    public void testWithLength226() {
        testHex(new BMW384(),
                "eacd07971cff9b9939903f8c1d8cbb5d4db1b548a85d04e037514a583604e787f32992bf2111b97ac5e8a938233552731321522ab5e8583561260b7d13ebeef785b23a41fd8576a6da764a8ed6d822d4957a545d5244756c18aa80e1aad4d1f9c20d259dee1711e2cc8fd013169fb7cc4ce38b362f8e0936ae9198b7e838dcea4f7a5b9429bb3f6bbcf2dc92565e3676c1c5e6eb3dd2a0f86aa23edd3d0891f197447692794b3dfa269611ad97f72b795602b4fdb198f3fd3eb41b415064256e345e8d8c51c555dc8a21904a9b0f1ad0effab7786aac2da3b196507e9f33ca356427",
                "bcc95ee3460047e9762feab8372f32910a6f66e2af7d5f3a9afb53b49e1057467899cc009d014f05dfc8bcf4d659edc0");
    }

    @Test
    public void testWithLength227() {
        testHex(new BMW384(),
                "23ac4e9a42c6ef45c3336ce6dfc2ff7de8884cd23dc912fef0f7756c09d335c189f3ad3a23697abda851a81881a0c8ccafc980ab2c702564c2be15fe4c4b9f10dfb2248d0d0cb2e2887fd4598a1d4acda897944a2ffc580ff92719c95cf2aa42dc584674cb5a9bc5765b9d6ddf5789791d15f8dd925aa12bffafbce60827b490bb7df3dda6f2a143c8bf96abc903d83d59a791e2d62814a89b8080a28060568cf24a80ae61179fe84e0ffad00388178cb6a617d37efd54cc01970a4a41d1a8d3ddce46edbba4ab7c90ad565398d376f431189ce8c1c33e132feae6a8cd17a61c630012",
                "206fdf616e1c6396ef4cf6fb8f6702cfe1e37f2ebab0057b0114e57ab501a7783e8a6eec48ed4dfc247271f09063e474");
    }

    @Test
    public void testWithLength228() {
        testHex(new BMW384(),
                "0172df732282c9d488669c358e3492260cbe91c95cfbc1e3fea6c4b0ec129b45f242ace09f152fc6234e1bee8aab8cd56e8b486e1dcba9c05407c2f95da8d8f1c0af78ee2ed82a3a79ec0cb0709396ee62aadb84f8a4ee8a7ccca3c1ee84e302a09ea802204afecf04097e67d0f8e8a9d2651126c0a598a37081e42d168b0ae8a71951c524259e4e2054e535b779679bdade566fe55700858618e626b4a0faf895bcce9011504a49e05fd56127eae3d1f8917afb548ecadabda1020111fec9314c413498a360b08640549a22cb23c731ace743252a8227a0d2689d4c6001606678dfb921",
                "d4582d83f2d96a12c7b2f4649ee0377553c210badd002fc258174ee4fd4a4fa7ff9931ffb98b1f1de28e25d4c47543d6");
    }

    @Test
    public void testWithLength229() {
        testHex(new BMW384(),
                "3875b9240cf3e0a8b59c658540f26a701cf188496e2c2174788b126fd29402d6a75453ba0635284d08835f40051a2a9683dc92afb9383719191231170379ba6f4adc816fecbb0f9c446b785bf520796841e58878b73c58d3ebb097ce4761fdeabe15de2f319dfbaf1742cdeb389559c788131a6793e193856661376c81ce9568da19aa6925b47ffd77a43c7a0e758c37d69254909ff0fbd415ef8eb937bcd49f91468b49974c07dc819abd67395db0e05874ff83dddab895344abd0e7111b2df9e58d76d85ad98106b36295826be04d435615595605e4b4bb824b33c4afeb5e7bb0d19f909",
                "cbdc1dad2dc0b71da6fffccfbc0832b71b175199f1a2ebe03f4247fd7d64d79c6bed455949de7d1c81e80f79ca15f740");
    }

    @Test
    public void testWithLength230() {
        testHex(new BMW384(),
                "747cc1a59fefba94a9c75ba866c30dc5c1cb0c0f8e9361d98484956dd5d1a40f6184afbe3dac9f76028d1caeccfbf69199c6ce2b4c092a3f4d2a56fe5a33a00757f4d7dee5dfb0524311a97ae0668a47971b95766e2f6dd48c3f57841f91f04a00ad5ea70f2d479a2620dc5cd78eaab3a3b011719b7e78d19ddf70d9423798af77517ebc55392fcd01fc600d8d466b9e7a7a85bf33f9cc5419e9bd874ddfd60981150ddaf8d7febaa4374f0872a5628d318000311e2f5655365ad4d407c20e5c04df17a222e7deec79c5ab1116d8572f91cd06e1ccc7ced53736fc867fd49ecebe6bf8082e8a",
                "329af6ff2e9b7acb88404fc6ccc4b08f1d15f43fce9157dd13fc50eb92756d43ef2bef10a6bace6e74dac01b6b99b3bf");
    }

    @Test
    public void testWithLength231() {
        testHex(new BMW384(),
                "57af971fccaec97435dc2ec9ef0429bcedc6b647729ea168858a6e49ac1071e706f4a5a645ca14e8c7746d65511620682c906c8b86ec901f3dded4167b3f00b06cbfac6aee3728051b3e5ff10b4f9ed8bd0b8da94303c833755b3ca3aeddf0b54bc8d6632138b5d25bab03d17b3458a9d782108006f5bb7de75b5c0ba854b423d8bb801e701e99dc4feaad59bc1c7112453b04d33ea3635639fb802c73c2b71d58a56bbd671b18fe34ed2e3dca38827d63fdb1d4fb3285405004b2b3e26081a8ff08cd6d2b08f8e7b7e90a2ab1ed7a41b1d0128522c2f8bff56a7fe67969422ce839a9d4608f03",
                "9fb72f34ee233a6363d1fb1edb50424ddecfe06fd1551183241c66df6eaf656a0f4f74b33273202b5cadadf70951f010");
    }

    @Test
    public void testWithLength232() {
        testHex(new BMW384(),
                "04e16dedc1227902baaf332d3d08923601bdd64f573faa1bb7201918cfe16b1e10151dae875da0c0d63c59c3dd050c4c6a874011b018421afc4623ab0381831b2da2a8ba42c96e4f70864ac44e106f94311051e74c77c1291bf5db9539e69567bf6a11cf6932bbbad33f8946bf5814c066d851633d1a513510039b349939bfd42b858c21827c8ff05f1d09b1b0765dc78a135b5ca4dfba0801bcaddfa175623c8b647eacfb4444b85a44f73890607d06d507a4f8393658788669f6ef4deb58d08c50ca0756d5e2f49d1a7ad73e0f0b3d3b5f090acf622b1878c59133e4a848e05153592ea81c6fbf",
                "9315746f6647a47ab6aa6014aa252f6fe1480debc957e26bcc60fdabcf495f585844ce839b85bb355cd3e9ea61ddfee0");
    }

    @Test
    public void testWithLength233() {
        testHex(new BMW384(),
                "7c815c384eee0f288ece27cced52a01603127b079c007378bc5d1e6c5e9e6d1c735723acbbd5801ac49854b2b569d4472d33f40bbb8882956245c366dc3582d71696a97a4e19557e41e54dee482a14229005f93afd2c4a7d8614d10a97a9dfa07f7cd946fa45263063ddd29db8f9e34db60daa32684f0072ea2a9426ecebfa5239fb67f29c18cbaa2af6ed4bf4283936823ac1790164fec5457a9cba7c767ca59392d94cab7448f50eb34e9a93a80027471ce59736f099c886dea1ab4cba4d89f5fc7ae2f21ccd27f611eca4626b2d08dc22382e92c1efb2f6afdc8fdc3d2172604f5035c46b8197d3",
                "efb16a244851bc657d6f38aef9b270c7359e357b97bf999cca3bc01d91a08309259f0ec2b8b18dae5f322099156dd0ae");
    }

    @Test
    public void testWithLength234() {
        testHex(new BMW384(),
                "e29d505158dbdd937d9e3d2145658ee6f5992a2fc790f4f608d9cdb44a091d5b94b88e81fac4fdf5c49442f13b911c55886469629551189eaff62488f1a479b7db11a1560e198ddccccf50159093425ff7f1cb8d1d1246d0978764087d6bac257026b090efae8cec5f22b6f21c59ace1ac7386f5b8837ca6a12b6fbf5534dd0560ef05ca78104d3b943ddb220feaec89aa5e692a00f822a2ab9a2fe60350d75e7be16ff2526dc643872502d01f42f188abed0a6e9a6f5fd0d1ce7d5755c9ffa66b0af0b20bd806f08e06156690d81ac811778ca3dac2c249b96002017fce93e507e3b953acf99964b847",
                "94625a9bb273f02de07ec6fd802e795a3db1a37e1805cf9a48def349b0207730ed42440e02a50a39ddd6c6f9da9019fb");
    }

    @Test
    public void testWithLength235() {
        testHex(new BMW384(),
                "d85588696f576e65eca0155f395f0cfacd83f36a99111ed5768df2d116d2121e32357ba4f54ede927f189f297d3a97fad4e9a0f5b41d8d89dd7fe20156799c2b7b6bf9c957ba0d6763f5c3bc5129747bbb53652b49290cff1c87e2cdf2c4b95d8aaee09bc8fbfa6883e62d237885810491bfc101f1d8c636e3d0ede838ad05c207a3df4fad76452979eb99f29afaecedd1c63b8d36cf378454a1bb67a741c77ac6b6b3f95f4f02b64dabc15438613ea49750df42ee90101f115aa9abb9ff64324dde9dabbb01054e1bd6b4bcdc7930a44c2300d87ca78c06924d0323ad7887e46c90e8c4d100acd9eed21e",
                "80c8244eed8ba22dcaa057b79e55d3c10735e17b666fb1b51a70aa51ff795f4484e066a5e222bf2663302de0dbc48682");
    }

    @Test
    public void testWithLength236() {
        testHex(new BMW384(),
                "3a12f8508b40c32c74492b66323375dcfe49184c78f73179f3314b79e63376b8ac683f5a51f1534bd729b02b04d002f55cbd8e8fc9b5ec1ea6bbe6a0d0e7431518e6ba45d124035f9d3dce0a8bb7bf1430a9f657e0b4ea9f20eb20c786a58181a1e20a96f1628f8728a13bdf7a4b4b32fc8aa7054cc4881ae7fa19afa65c6c3ee1b3ade3192af42054a8a911b8ec1826865d46d93f1e7c5e2b7813c92a506e53886f3d4701bb93d2a681ad109c845904bb861af8af0646b6e399b38b614051d34f6842563a0f37ec00cb3d865fc5d746c4987de2a65071100883a2a9c7a2bfe1e2dd603d9ea24dc7c5fd06be",
                "f4746d1f9591587e45731d388bf55f9407a2993d056fa09f199e2ef7c5e40db934acd7dc7db23eef7e0436a7250bffd8");
    }

    @Test
    public void testWithLength237() {
        testHex(new BMW384(),
                "1861edce46fa5ad17e1ff1deae084dec580f97d0a67885dfe834b9dfac1ae076742ce9e267512ca51f6df5a455af0c5fd6abf94acea103a3370c354485a7846fb84f3ac7c2904b5b2fbf227002ce512133bb7e1c4e50057bfd1e44db33c7cdb969a99e284b184f50a14b068a1fc5009d9b298dbe92239572a7627aac02abe8f3e3b473417f36d4d2505d16b7577f4526c9d94a270a2dfe450d06da8f6fa956879a0a55cfe99e742ea555ea477ba3e9b44ccd508c375423611af92e55345dc215779b2d5119eba49c71d49b9fe3f1569fa24e5ca3e332d042422a8b8158d3ec66a80012976f31ffdf305f0c9c5e",
                "a3112a571b0c30568f2d67be5aed9122909125d1ff374e7f1ff5269317bf9283a42c698aedf68faeffce127210d2e46a");
    }

    @Test
    public void testWithLength238() {
        testHex(new BMW384(),
                "08d0ffde3a6e4ef65608ea672e4830c12943d7187ccff08f4941cfc13e545f3b9c7ad5eebbe2b01642b486caf855c2c73f58c1e4e3391da8e2d63d96e15fd84953ae5c231911b00ad6050cd7aafdaac9b0f663ae6aab45519d0f5391a541707d479034e73a6ad805ae3598096af078f1393301493d663dd71f83869ca27ba508b7e91e81e128c1716dc3acfe3084b2201e04cf8006617eecf1b640474a5d45cfde9f4d3ef92d6d055b909892194d8a8218db6d8203a84261d200d71473d7488f3427416b6896c137d455f231071cacbc86e0415ab88aec841d96b7b8af41e05bb461a40645bf176601f1e760de5f",
                "0906dac8451d79f4958ddf1cb79f744857bd597ab773be47aaecbb1251864ffe50b454394545217b1f59fe992e12a539");
    }

    @Test
    public void testWithLength239() {
        testHex(new BMW384(),
                "d782abb72a5be3392757be02d3e45be6e2099d6f000d042c8a543f50ed6ebc055a7f133b0dd8e9bc348536edcaae2e12ec18e8837df7a1b3c87ec46d50c241dee820fd586197552dc20beea50f445a07a38f1768a39e2b2ff05dddedf751f1def612d2e4d810daa3a0cc904516f9a43af660315385178a529e51f8aae141808c8bc5d7b60cac26bb984ac1890d0436ef780426c547e94a7b08f01acbfc4a3825eae04f520a9016f2fb8bf5165ed12736fc71e36a49a73614739eaa3ec834069b1b40f1350c2b3ab885c02c640b9f7686ed5f99527e41cfcd796fe4c256c9173186c226169ff257954ebda81c0e5f99",
                "9b85e04fc214cf3b03f702d92979dddb7f58232ea2767e66e0b3314ac5db15810e82408147d473190ac1bb38ec658bda");
    }

    @Test
    public void testWithLength240() {
        testHex(new BMW384(),
                "5fce8109a358570e40983e1184e541833bb9091e280f258cfb144387b05d190e431cb19baa67273ba0c58abe91308e1844dcd0b3678baa42f335f2fa05267a0240b3c718a5942b3b3e3bfa98a55c25a1466e8d7a603722cb2bbf03afa54cd769a99f310735ee5a05dae2c22d397bd95635f58c48a67f90e1b73aafcd3f82117f0166657838691005b18da6f341d6e90fc1cdb352b30fae45d348294e501b63252de14740f2b85ae5299ddec3172de8b6d0ba219a20a23bb5e10ff434d39db3f583305e9f5c039d98569e377b75a70ab837d1df269b8a4b566f40bb91b577455fd3c356c914fa06b9a7ce24c7317a172d",
                "449dbd90f4c7c71f12c0af8ea6adf8feb8876310f35f72aa273b452b47f7a22a0affb15c21e4f72d661db3748b964512");
    }

    @Test
    public void testWithLength241() {
        testHex(new BMW384(),
                "6172f1971a6e1e4e6170afbad95d5fec99bf69b24b674bc17dd78011615e502de6f56b86b1a71d3f4348087218ac7b7d09302993be272e4a591968aef18a1262d665610d1070ee91cc8da36e1f841a69a7a682c580e836941d21d909a3afc1f0b963e1ca5ab193e124a1a53df1c587470e5881fb54dae1b0d840f0c8f9d1b04c645ba1041c7d8dbf22030a623aa15638b3d99a2c400ff76f3252079af88d2b37f35ee66c1ad7801a28d3d388ac450b97d5f0f79e4541755356b3b1a5696b023f39ab7ab5f28df4202936bc97393b93bc915cb159ea1bd7a0a414cb4b7a1ac3af68f50d79f0c9c7314e750f7d02faa58bfa",
                "49c814f4f5e4e8d7d0301e10fb6ba50dc2ccfb14dce47dd5f80e3732c49bae35c05ace1509768653265eae62c78324f6");
    }

    @Test
    public void testWithLength242() {
        testHex(new BMW384(),
                "5668ecd99dfbe215c4118398ac9c9eaf1a1433fab4ccdd3968064752b625ea944731f75d48a27d047d67547f14dd0ffaa55fa5e29f7af0d161d85eafc4f2029b717c918eab9d304543290bdba7158b68020c0ba4e079bc95b5bc0fc044a992b94b4ccd3bd66d0eabb5dbbab904d62e00752c4e3b0091d773bcf4c14b4377da3efff824b1cb2fa01b32d1e46c909e626ed2dae920f4c7dbeb635bc754facbd8d49beba3f23c1c41ccbfcd0ee0c114e69737f5597c0bf1d859f0c767e18002ae8e39c26261ffde2920d3d0baf0e906138696cfe5b7e32b600f45df3aaa39932f3a7df95b60fa8712a2271fcaf3911ce7b511b1",
                "2b05973224f3530a0e09712603f9dc72dc2c5855720d0a7e5bf453faee413e72e9194f9151247e2cf462c15030fbba06");
    }

    @Test
    public void testWithLength243() {
        testHex(new BMW384(),
                "03d625488354df30e3f875a68edfcf340e8366a8e1ab67f9d5c5486a96829dfac0578289082b2a62117e1cf418b43b90e0adc881fc6ae8105c888e9ecd21aea1c9ae1a4038dfd17378fed71d02ae492087d7cdcd98f746855227967cb1ab4714261ee3bead3f4db118329d3ebef4bc48a875c19ba763966da0ebea800e01b2f50b00e9dd4caca6dcb314d00184ef71ea2391d760c950710db4a70f9212ffc54861f9dc752ce18867b8ad0c48df8466ef7231e7ac567f0eb55099e622ebb86cb237520190a61c66ad34f1f4e289cb3282ae3eaac6152ed24d2c92bae5a7658252a53c49b7b02dfe54fdb2e90074b6cf310ac661",
                "172087bdd12a280de15da461520b2262a4470ab14e40a9287f542b97249e0f590924c605ba5195cbcd754d1c39a2704f");
    }

    @Test
    public void testWithLength244() {
        testHex(new BMW384(),
                "2edc282ffb90b97118dd03aaa03b145f363905e3cbd2d50ecd692b37bf000185c651d3e9726c690d3773ec1e48510e42b17742b0b0377e7de6b8f55e00a8a4db4740cee6db0830529dd19617501dc1e9359aa3bcf147e0a76b3ab70c4984c13e339e6806bb35e683af8527093670859f3d8a0fc7d493bcba6bb12b5f65e71e705ca5d6c948d66ed3d730b26db395b3447737c26fad089aa0ad0e306cb28bf0acf106f89af3745f0ec72d534968cca543cd2ca50c94b1456743254e358c1317c07a07bf2b0eca438a709367fafc89a57239028fc5fecfd53b8ef958ef10ee0608b7f5cb9923ad97058ec067700cc746c127a61ee3",
                "cc06e7e4b7c33f28d880f09695dfc893f5e5786f69c9680889d489537a03c1ee8dc827fde4d38907160e1835e93b91ac");
    }

    @Test
    public void testWithLength245() {
        testHex(new BMW384(),
                "90b28a6aa1fe533915bcb8e81ed6cacdc10962b7ff82474f845eeb86977600cf70b07ba8e3796141ee340e3fce842a38a50afbe90301a3bdcc591f2e7d9de53e495525560b908c892439990a2ca2679c5539ffdf636777ad9c1cdef809cda9e8dcdb451abb9e9c17efa4379abd24b182bd981cafc792640a183b61694301d04c5b3eaad694a6bd4cc06ef5da8fa23b4fa2a64559c5a68397930079d250c51bcf00e2b16a6c49171433b0aadfd80231276560b80458dd77089b7a1bbcc9e7e4b9f881eacd6c92c4318348a13f4914eb27115a1cfc5d16d7fd94954c3532efaca2cab025103b2d02c6fd71da3a77f417d7932685888a",
                "50b465aa921240d10dc8e97f09f729a28c624f9b7934affa2154714587c44b9da720a98cc09b558b5861bf417cd01ef0");
    }

    @Test
    public void testWithLength246() {
        testHex(new BMW384(),
                "2969447d175490f2aa9bb055014dbef2e6854c95f8d60950bfe8c0be8de254c26b2d31b9e4de9c68c9adf49e4ee9b1c2850967f29f5d08738483b417bb96b2a56f0c8aca632b552059c59aac3f61f7b45c966b75f1d9931ff4e596406378cee91aaa726a3a84c33f37e9cdbe626b5745a0b06064a8a8d56e53aaf102d23dd9df0a3fdf7a638509a6761a33fa42fa8ddbd8e16159c93008b53765019c3f0e9f10b144ce2ac57f5d7297f9c9949e4ff68b70d339f87501ce8550b772f32c6da8ad2ce2100a895d8b08fa1eead7c376b407709703c510b50f87e73e43f8e7348f87c3832a547ef2bbe5799abedcf5e1f372ea809233f006",
                "79b7d372186ce3b8aeb58ec08c7781a2d7ce17960d27125555f7a7f158f0207fd87dcdb76a80f150d61d565631d8aaa0");
    }

    @Test
    public void testWithLength247() {
        testHex(new BMW384(),
                "721645633a44a2c78b19024eaecf58575ab23c27190833c26875dc0f0d50b46aea9c343d82ea7d5b3e50ec700545c615daeaea64726a0f05607576dcd396d812b03fb6551c641087856d050b10e6a4d5577b82a98afb89cee8594c9dc19e79feff0382fcfd127f1b803a4b9946f4ac9a4378e1e6e041b1389a53e3450cd32d9d2941b0cbabdb50da8ea2513145164c3ab6bcbd251c448d2d4b087ac57a59c2285d564f16da4ed5e607ed979592146ffb0ef3f3db308fb342df5eb5924a48256fc763141a278814c82d6d6348577545870ae3a83c7230ac02a1540fe1798f7ef09e335a865a2ae0949b21e4f748fb8a51f44750e213a8fb",
                "9cff35b91670e07a26f644f8230b06329aa9a702c68c9cda1009b9477fc48a1e23680a55f62abcc27e29d05a2dade013");
    }

    @Test
    public void testWithLength248() {
        testHex(new BMW384(),
                "6b860d39725a14b498bb714574b4d37ca787404768f64c648b1751b353ac92bac2c3a28ea909fdf0423336401a02e63ec24325300d823b6864bb701f9d7c7a1f8ec9d0ae3584aa6dd62ea1997cd831b4babd9a4da50932d4efda745c61e4130890e156aee6113716daf95764222a91187db2effea49d5d0596102d619bd26a616bbfda8335505fbb0d90b4c180d1a2335b91538e1668f9f9642790b4e55f9cab0fe2bdd2935d001ee6419abab5457880d0dbff20ed8758f4c20fe759efb33141cf0e892587fe8187e5fbc57786b7e8b089612c936dfc03d27efbbe7c8673f1606bd51d5ff386f4a7ab68edf59f385eb1291f117bfe717399",
                "6da744be6902e61d62805955f853b383eb3a254337f25e3e1c021221968abf67a1aa30d92e8fed1ecc179d0a668626e6");
    }

    @Test
    public void testWithLength249() {
        testHex(new BMW384(),
                "6a01830af3889a25183244decb508bd01253d5b508ab490d3124afbf42626b2e70894e9b562b288d0a2450cfacf14a0ddae5c04716e5a0082c33981f6037d23d5e045ee1ef2283fb8b6378a914c5d9441627a722c282ff452e25a7ea608d69cee4393a0725d17963d0342684f255496d8a18c2961145315130549311fc07f0312fb78e6077334f87eaa873bee8aa95698996eb21375eb2b4ef53c14401207deb4568398e5dd9a7cf97e8c9663e23334b46912f8344c19efcf8c2ba6f04325f1a27e062b62a58d0766fc6db4d2c6a1928604b0175d872d16b7908ebc041761187cc785526c2a3873feac3a642bb39f5351550af9770c328af7b",
                "36c691579bfb984937b27f67e3d5bb807d8bad56d287107a013b3639f9ff26f8830cd69316e6e0d3f19153472af0919b");
    }

    @Test
    public void testWithLength250() {
        testHex(new BMW384(),
                "b3c5e74b69933c2533106c563b4ca20238f2b6e675e8681e34a389894785bdade59652d4a73d80a5c85bd454fd1e9ffdad1c3815f5038e9ef432aac5c3c4fe840cc370cf86580a6011778bbedaf511a51b56d1a2eb68394aa299e26da9ada6a2f39b9faff7fba457689b9c1a577b2a1e505fdf75c7a0a64b1df81b3a356001bf0df4e02a1fc59f651c9d585ec6224bb279c6beba2966e8882d68376081b987468e7aed1ef90ebd090ae825795cdca1b4f09a979c8dfc21a48d8a53cdbb26c4db547fc06efe2f9850edd2685a4661cb4911f165d4b63ef25b87d0a96d3dff6ab0758999aad214d07bd4f133a6734fde445fe474711b69a98f7e2b",
                "8e500f232bb82e9772f2054dd75da6de0cafc4e69339f8c80158ebaaf2f19d84926d2d325827fa76a2689ed56957287f");
    }

    @Test
    public void testWithLength251() {
        testHex(new BMW384(),
                "83af34279ccb5430febec07a81950d30f4b66f484826afee7456f0071a51e1bbc55570b5cc7ec6f9309c17bf5befdd7c6ba6e968cf218a2b34bd5cf927ab846e38a40bbd81759e9e33381016a755f699df35d660007b5eadf292feefb735207ebf70b5bd17834f7bfa0e16cb219ad4af524ab1ea37334aa66435e5d397fc0a065c411ebbce32c240b90476d307ce802ec82c1c49bc1bec48c0675ec2a6c6f3ed3e5b741d13437095707c565e10d8a20b8c20468ff9514fcf31b4249cd82dcee58c0a2af538b291a87e3390d737191a07484a5d3f3fb8c8f15ce056e5e5f8febe5e1fb59d6740980aa06ca8a0c20f5712b4cde5d032e92ab89f0ae1",
                "ac31af1158c577dae7edf88381fc81900cba7510baa5fd269ab609f23297388f7a5dd727b53468abaa5e6a20d7b97afe");
    }

    @Test
    public void testWithLength252() {
        testHex(new BMW384(),
                "a7ed84749ccc56bb1dfba57119d279d412b8a986886d810f067af349e8749e9ea746a60b03742636c464fc1ee233acc52c1983914692b64309edfdf29f1ab912ec3e8da074d3f1d231511f5756f0b6eead3e89a6a88fe330a10face267bffbfc3e3090c7fd9a850561f363ad75ea881e7244f80ff55802d5ef7a1a4e7b89fcfa80f16df54d1b056ee637e6964b9e0ffd15b6196bdd7db270c56b47251485348e49813b4eb9ed122a01b3ea45ad5e1a929df61d5c0f3e77e1fdc356b63883a60e9cbb9fc3e00c2f32dbd469659883f690c6772e335f617bc33f161d6f6984252ee12e62b6000ac5231e0c9bc65be223d8dfd94c5004a101af9fd6c0fb",
                "7c94dbb94b99651cde32b8527a0bab2721513aaf77ad3f106fd7deff5b9aa05b702eb8234bb3aa8933109862e11d31d5");
    }

    @Test
    public void testWithLength253() {
        testHex(new BMW384(),
                "a6fe30dcfcda1a329e82ab50e32b5f50eb25c873c5d2305860a835aecee6264aa36a47429922c4b8b3afd00da16035830edb897831c4e7b00f2c23fc0b15fdc30d85fb70c30c431c638e1a25b51caf1d7e8b050b7f89bfb30f59f0f20fecff3d639abc4255b3868fc45dd81e47eb12ab40f2aac735df5d1dc1ad997cefc4d836b854cee9ac02900036f3867fe0d84afff37bde3308c2206c62c4743375094108877c73b87b2546fe05ea137bedfc06a2796274099a0d554da8f7d7223a48cbf31b7decaa1ebc8b145763e3673168c1b1b715c1cd99ecd3ddb238b06049885ecad9347c2436dff32c771f34a38587a44a82c5d3d137a03caa27e66c8ff6",
                "3cc06e09cf9b55998b6c3734b37c0247c7dcb64f3c7121f5df173d5682f07be653128c889f5a749ce98a7ceb8970054d");
    }

    @Test
    public void testWithLength254() {
        testHex(new BMW384(),
                "83167ff53704c3aa19e9fb3303539759c46dd4091a52ddae9ad86408b69335989e61414bc20ab4d01220e35241eff5c9522b079fba597674c8d716fe441e566110b6211531ceccf8fd06bc8e511d00785e57788ed9a1c5c73524f01830d2e1148c92d0edc97113e3b7b5cd3049627abdb8b39dd4d6890e0ee91993f92b03354a88f52251c546e64434d9c3d74544f23fb93e5a2d2f1fb15545b4e1367c97335b0291944c8b730ad3d4789273fa44fb98d78a36c3c3764abeeac7c569c1e43a352e5b770c3504f87090dee075a1c4c85c0c39cf421bdcc615f9eff6cb4fe6468004aece5f30e1ecc6db22ad9939bb2b0ccc96521dfbf4ae008b5b46bc006e",
                "5b47a49dd2b9319e40de0c63317383816d02c64bf0f4b99def15c3e2fa8ebc014c5fa77c5426d1f1ad526bf80e26c5d0");
    }

    @Test
    public void testWithLength255() {
        testHex(new BMW384(),
                "3a3a819c48efde2ad914fbf00e18ab6bc4f14513ab27d0c178a188b61431e7f5623cb66b23346775d386b50e982c493adbbfc54b9a3cd383382336a1a0b2150a15358f336d03ae18f666c7573d55c4fd181c29e6ccfde63ea35f0adf5885cfc0a3d84a2b2e4dd24496db789e663170cef74798aa1bbcd4574ea0bba40489d764b2f83aadc66b148b4a0cd95246c127d5871c4f11418690a5ddf01246a0c80a43c70088b6183639dcfda4125bd113a8f49ee23ed306faac576c3fb0c1e256671d817fc2534a52f5b439f72e424de376f4c565cca82307dd9ef76da5b7c4eb7e085172e328807c02d011ffbf33785378d79dc266f6a5be6bb0e4a92eceebaeb1",
                "7aa9e0d9af6aaae485c0773934d710b8e7161465aecdbb5340a9247605651e1cb4d9ae0ffd368091d2c59796a10b6c1f");
    }
}
