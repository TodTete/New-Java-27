package org.todtete.concurrency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link StructuredConcurrencyDemo}.
 *
 * <p>
 * JEP 533 - Structured Concurrency (Seventh Preview).
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27 Feature Lab
 */
class StructuredConcurrencyTest {

    /**
     * Verifies that both subtasks complete and that their
     * results are combined in fork order.
     */
    @Test
    void shouldCombineResultsOfBothSubtasks() throws Exception {

        String result =
                StructuredConcurrencyDemo.execute();

        assertEquals(
                "Task A completed | Task B completed",
                result);
    }

    /**
     * Verifies that the structured scope produces the same
     * outcome as the traditional executor based approach.
     */
    @Test
    void shouldMatchTraditionalApproach() throws Exception {

        assertEquals(
                BeforeConcurrency.execute(),
                StructuredConcurrencyDemo.execute());
    }
}
