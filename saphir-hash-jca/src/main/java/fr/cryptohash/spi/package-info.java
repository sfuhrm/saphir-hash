/**
 * Adapters from the fr.cryptohash world to the Java JCA world for
 * every hash implementation. You usually don't need to interact
 * with these classes. You'll probably prefer
 * using 
 * {@link java.security.MessageDigest#getInstance(java.lang.String, java.lang.String) MessageDigest#getInstance()}
 * to get a {@link java.security.MessageDigest MessageDigest} instance directly.
 * @author Stephan Fuhrmann &lt;stephan@tynne.de&gt;
 */

package fr.cryptohash.spi;
