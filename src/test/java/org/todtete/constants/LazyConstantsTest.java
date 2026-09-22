package org.todtete.constants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Unit tests for {@link LazyConstantsDemo}.
 *
 * <p>
 * These tests verify the observable behavior of the lazy
 * constant exposed by the demonstration.
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27 Feature Lab
 */
class LazyConstantsTest {

    /**
     * Verifies that the lazy constant returns the expected value.
     */
    @Test
    void shouldReturnExpectedConfiguration() {

        String configuration =
                LazyConstantsDemo.getConfiguration();

        assertEquals(
                "Production configuration",
                configuration);
    }

    /**
     * Verifies that subsequent accesses return the same
     * instance, which proves the supplier ran only once.
     */
    @Test
    void shouldReturnSameValueOnRepeatedAccess() {

        String first =
                LazyConstantsDemo.getConfiguration();

        String second =
                LazyConstantsDemo.getConfiguration();

        assertSame(first, second);
    }

    /**
     * Verifies that the eager counterpart exposes the same value.
     */
    @Test
    void shouldMatchTraditionalConfiguration() {

        assertEquals(
                BeforeConstants.getConfiguration(),
                LazyConstantsDemo.getConfiguration());
    }
}
