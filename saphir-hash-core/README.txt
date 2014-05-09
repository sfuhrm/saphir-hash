sphlib 3.0
==========

Overview
========

Sphlib is a set of implementations of various hash functions, both in C
and in Java. The C code is meant to be easily imported into other
projects, in particular embedded systems. The Java core code implements
an API somewhat similar to that of java.security.MessageDigest.

The C source can be obtained at this URL:

	http://www.saphir2.com/sphlib/


*************************************************************************
IMPORTANT NOTE: for users of the previous version (sphlib-2.1)
--------------------------------------------------------------
BLAKE, Groestl, JH, Keccak and Skein have been updated, to match the
"tweaked" specifications published for the third round of the SHA-3
competition. Thus, these function now return distinct values from what
they were producing previously. Also, for Skein with a 224-bit or
256-bit output, the size of the context structure has changed, so
calling code must be recompiled as well.
*************************************************************************


License
=======

Licensing is specified in the LICENSE.txt file. This is an MIT-like,
BSD-like open-source license. Basically, we will get the fame but not
the blame. If you reuse our code in your own projects, and distribute
the result, then you should state that you used our code and that we
always disclaimed any kind of warranty, and will continue to do so in
the foreseeable future, and beyond. You have no other obligation such as
disclosing your own source code. See the LICENSE.txt file for the
details in a lawyer-compatible language.

The authors are the "Projet RNRT SAPHIR", which is a research project
sponsored by the French government; project members are public and
private organizations:
- Cryptolog
- DCSSI
- Ecole Normale Superieure
- France Telecom
- Gemalto
Projet RNRT SAPHIR was continued into Projet RNRT SAPHIR2, with four
new additional members:
- EADS SN
- Sagem Securite
- INRIA
- UVSQ
We use the "Projet RNRT SAPHIR" expression to designate both SAPHIR and
SAPHIR2.

All the actual code has been written by:

   Thomas Pornin <thomas.pornin@cryptolog.com>

to whom technical questions may be addressed. Note that I do not claim
authorship: all writing was done on behalf of the Projet RNRT SAPHIR.

Refactorings, adjustments to the Maven build tool and the junit testing
framework were done by

	Stephan Fuhrmann <stephan@tynne.de>

Documentation
=============

The programming interface for the Java code can be
generated using the command "mvn javadoc:aggregate".

Conformance
===========

The hash functions have been implemented with regards to their
published specification. Whenever possible, the correction of the
implementation has been verified with regards to published test
vectors. Some functions have several variants; for instance, there
are three distinct "Whirlpool" which sphlib implements, under the
names "Whirlpool-0", "Whirlpool-1" and "Whirlpool".

For the SHA-3 candidates, sphlib follows the "round 3" specifications,
thus including the "tweaks" that some of the candidates added right
after round 1 and all also the tweaks that the "finalists" added after
round 2. For some of those functions, the officially submitted code and
test vectors turned out to be flawed (non conforming to the
specification), and corrections were published by their authors; sphlib
follows the specification and agrees with those corrected versions.

For two of the second round SHA-3 candidates (Hamsi and SHAvite-3), the
most recently published specifications (as of June 18th, 2010) have some
flaws which do not alter the function robustness or performance, but
still mean that some or all of the published implementations and test
vectors are wrong. The respective designers of those functions are aware
of those flaws and intend to publish corrections at some point. sphlib
anticipates on those corrections and already implements them.

All systems
------------

Building can be done with this simple call:

	mvn clean package

which should:

 - compile the library
 - compile the unit tests
 - run the unit tests

Installation (Java code)
========================

Java code is in the src/ directory. Hash function implementations are
located in the "fr.cryptohash" package; there is one specific class for
each hash function, a common interface called "Digest", and some
non-public helper classes.

The "fr.cryptohash.test.regression" package contains a set of
JUnit tests that compare a big amount of pre calculated digest
results with the actual function results.

The Java code should be compatible both with older virtual machines
(e.g. Java 1.1) and with J2ME platforms.

The test code requires Java 1.6 because of the JUnit annotations. This
is why the compiler plugin is configured to use Java 1.6.

#######################################################################
                          IMPORTANT WARNING

It appears that some versions of the Java virtual machine from Sun (now
Oracle) have a bug, in which the code for ECHO is not properly handled
at runtime. To check whether your VM has the bug, run the
fr.cryptohash.test.TestDigest application, preferably with the '-server'
command-line flag (this is the default on x86_64 but not on i386).

Affected versions include at least 1.6.0_16. However, 1.6.0_19 and
1.6.0_20 seem fine. If unsure then update your JVM to the latest
published version.

Some OpenJDK versions are also affected, including 6b16-1.6.1.
#######################################################################


The NIST SHA-3 API
==================

Internally, sphlib tended to use the name "sha3" for the 64-bit
functions of the SHA-2 family, namely SHA-384 and SHA-512. This is
historical. Here, we talk about the SHA-3 contest which was launched in
2008 by NIST, to define the next family of hash functions which will
become an american standard, as substitutes for the existing SHA-224,
SHA-256, SHA-384 and SHA-512 functions. Many candidate functions have
been submitted so far. The competition has reached its second round, in
which 14 candidates have been kept. sphlib currently implements those
14 candidates.

For the purposes of this competition, the NIST published a C API. All
candidates were asked to provide reference and optimized implementations
fitting in that API.

The basic sphlib API is distinct from the NIST API. However, a
compatibility layer has been added to sphlib-1.1. It consists in the
sha3nist.c and sha3nist.h source files. With these files, you may use
some of the sphlib implementations through an API conforming to the NIST
specification. Namely, you may select either the SHA-2 family, or any of
the implemented SHA-3 candidates.

To use that layer, modify sha3nist.h to designate the hash functions
you wish to use. By default, the SHA-224/... functions are used. To
use Shabal instead, replace the following line:

   #define SPH_NIST   sha

with this:

   #define SPH_NIST   shabal

and add the sha3nist.c file to the list of C files to compile into your
application. Similarly, use "bmw" for Blue Midnight Wish, "jh" for JH,
and so on.


Future work
===========

Future versions of sphlib may feature:
- options for better conditional inclusion (e.g. not compiling RIPEMD if
you only want RIPEMD-160)
- optimized versions for footprint-constrained environments (which should
also help platforms with a small L1 cache)
- a better compilation and installation procedure for the library and
standalone tools
- man pages for the standalone tools
- a building process for sphlib as a shared library


Change log
==========

** new in sphlib-3.0
   - Updated BLAKE, Groestl, JH, Keccak and Skein to SHA-3 round 3 tweaks
   - Fixed suboptimal code in Keccak
   - Fixed a data-management bug in Hamsi

** new in sphlib-2.1
   - Added implementations of CubeHash, Groestl, Hamsi, Keccak and
     SHAvite-3 (C and Java)
   - Added Java implementations for RadioGatun
   - Optimized RadioGatun on small architectures and 32-bit x86
   - Made "size-generic" Java implementation of Shabal (supports all
     output sizes multiple of 32, from 32 to 512 bits)
   - Added macros for explicit architecture feature activation or
     deactivation
   - Renamed SHABAL -> Shabal, and WHIRLPOOL -> Whirlpool
   - Fixed some bugs on exotic architectures

** new in sphlib-2.0
   - Added implementations of BLAKE, Blue Midnight Wish, ECHO, Fugue,
     JH, Luffa, SIMD and Skein (C and Java)
   - Changed default optimization level to -O1 with GCC
   - Moved SHA-384 / SHA-512 headers to sph_sha2.h; sph_sha3.h now
     includes sph_sha2.h and the header files for all SHA-3 candidates
   - Renamed implementation file for SHA-384 / SHA-512 (now sha2big.c)
   - Added support for signed integer types of at least 32 or 64 bits
   - Improved MIPS support (endianness detection)
   - Fixed code with exotic architectures (oversized integers)

** new in sphlib-1.1
   - Fixed bug in Panama implementation (some special padding cases)
   - Added RadioGatun[32] and RadioGatun[64] (C)
   - Added SHABAL-192/224/256/384/512 (C and Java)
   - Added API for fractional bits on some functions (MD5, SHA-0, SHA-1,
     SHA-224/256/384/512 and SHABAL)
   - Added compatibility layer for the NIST SHA-3 competition API
