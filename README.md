# Saphir Hash

Saphir Hash is a Java library for calculating cryptographic message digests.
The library is derived from the sphlib 3.0 code that can be found here:

	http://www.saphir2.com/sphlib/

Compared to the standard SUN message digest algorithm this library
contains many experimental hash algorithms.

## Documentation

The documentation can be viewed when doing

	mvn javadoc:javadoc

## Building

The library is built with Apache Maven. You can build it by
doing

	mvn clean package
	
in the top library folder.


## Authors

The original library was written by the "Projet RNRT SAPHIR", 
which is a research project sponsored by the French government; 
project members are public and private organizations:

* Cryptolog
* ANSSI
* École Normale Superieure
* France Telecom
* Gemalto

Projet RNRT SAPHIR was continued into Projet RNRT SAPHIR2, with four new additional members:

* Cassidian
* Morpho
* INRIA
* UVSQ

We use the "Projet RNRT SAPHIR" expression to designate both SAPHIR and SAPHIR2.

All the actual code has been written by:

   Thomas Pornin <thomas.pornin at cryptolog.com> 
   
The additions were written by:

   Stephan Fuhrmann <stephan@tynne.de>

## List of changes

The following is a rough list of changes and additions done by me,
Stephan Fuhrmann:

* Moved project structure to modern maven build with subprojects.
* Moved tests to JUnit tests
* Created JCA adapter to the digest algorithms
* Created speed benchmark code to compare against SUN and BouncyCastle implementations

## License

The original library is in a MIT-like license, the rest is in a BSD-like license.

See the file LICENSE.md for a detailed discussion.
