package org.todtete.security;

import org.junit.jupiter.api.Test;

import java.security.Security;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for {@link PostQuantumTlsDemo}.
 *
 * <p>
 * JEP 527 - Post-Quantum Hybrid Key Exchange for TLS 1.3.
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27 Feature Lab
 */
class PostQuantumTlsTest {

    @Test
    void shouldExposeSecurityProviders() {

        assertTrue(
                Security.getProviders().length > 0,
                "The JVM should register security providers.");

        assertDoesNotThrow(
                PostQuantumTlsDemo::demonstrate);
    }

    @Test
    void shouldProvidePostQuantumKeyEncapsulation() {

        assertTrue(
                PostQuantumTlsDemo
                        .isPostQuantumKeyExchangeAvailable(),
                "Java 27 ships ML-KEM as part of the platform.");
    }
}
