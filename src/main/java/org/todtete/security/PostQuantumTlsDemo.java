package org.todtete.security;

import java.security.Provider;
import java.security.Security;
import java.util.Arrays;

/**
 * Demonstrates how Java 27 exposes security capabilities
 * relevant to post-quantum cryptography.
 *
 * <p>
 * Java 27 introduces hybrid key exchange capabilities for
 * TLS 1.3 through JEP 527.
 * </p>
 *
 * <p>
 * The purpose of this class is educational: it demonstrates
 * how the platform evolves its security infrastructure rather
 * than implementing cryptographic algorithms manually.
 * </p>
 */
public final class PostQuantumTlsDemo {

    private PostQuantumTlsDemo() {
    }

    /**
     * Key encapsulation mechanism standardised by NIST and used
     * by the hybrid TLS 1.3 key exchange of JEP 527.
     */
    private static final String KEY_ENCAPSULATION_ALGORITHM =
            "ML-KEM";

    public static void demonstrate() {

        System.out.println("Java security providers:");

        /*
         * Security.getProviders() returns an array, so it has to be
         * wrapped in a stream before it can be traversed functionally.
         */
        Arrays.stream(Security.getProviders())
                .forEach(provider ->
                        System.out.println(
                                provider.getName()
                                        + " - "
                                        + provider.getInfo()));

        System.out.println();

        System.out.println(
                "Post-quantum key encapsulation ("
                        + KEY_ENCAPSULATION_ALGORITHM
                        + ") available: "
                        + isPostQuantumKeyExchangeAvailable());
    }

    /**
     * Indicates whether the running JVM exposes the post-quantum
     * key encapsulation mechanism used by hybrid TLS 1.3.
     *
     * @return {@code true} when a provider supplies the algorithm
     */
    public static boolean isPostQuantumKeyExchangeAvailable() {

        Provider[] providers =
                Security.getProviders(
                        "KeyPairGenerator."
                                + KEY_ENCAPSULATION_ALGORITHM);

        return providers != null
                && providers.length > 0;
    }
}