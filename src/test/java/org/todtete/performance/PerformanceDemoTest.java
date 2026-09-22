package org.todtete.performance;

import org.junit.jupiter.api.Test;

import java.lang.management.ManagementFactory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Unit tests for the runtime and performance demonstrations.
 *
 * <p>
 * These demonstrations describe JVM level behaviour, so the tests
 * verify that they can be executed and that the JVM exposes the
 * information they rely on.
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27 Feature Lab
 */
class PerformanceDemoTest {

    @Test
    void shouldDescribeCompactObjectHeaders() {

        assertDoesNotThrow(
                CompactObjectHeadersDemo::demonstrate);
    }

    @Test
    void shouldListGarbageCollectors() {

        assertDoesNotThrow(
                G1GarbageCollectorDemo::demonstrate);

        assertFalse(
                ManagementFactory
                        .getGarbageCollectorMXBeans()
                        .isEmpty(),
                "The JVM should expose at least one collector.");
    }
}
