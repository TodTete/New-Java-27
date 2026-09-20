package org.todtete.security;

import java.security.Security;

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

    public static void demonstrate() {

        System.out.println("Java security providers:");

        Security.getProviders()
                .forEach(provider ->
                        System.out.println(
                                provider.getName()
                                        + " - "
                                        + provider.getInfo()));
    }
}