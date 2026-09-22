package org.todtete.patternmatching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the Java 27 pattern matching example.
 */
class PatternMatchingTest {

    @Test
    void shouldIdentifyPositiveInteger() {

        String result =
                Java27PatternMatching.classify(10);

        assertEquals(
                "Positive integer",
                result);
    }

    @Test
    void shouldIdentifyNegativeInteger() {

        String result =
                Java27PatternMatching.classify(-10);

        assertEquals(
                "Negative integer",
                result);
    }

    @Test
    void shouldIdentifyZero() {

        String result =
                Java27PatternMatching.classify(0);

        assertEquals(
                "Zero",
                result);
    }

    @Test
    void shouldClassifyBoundaryValues() {

        assertEquals(
                "Positive integer",
                Java27PatternMatching.classify(
                        Integer.MAX_VALUE));

        assertEquals(
                "Negative integer",
                Java27PatternMatching.classify(
                        Integer.MIN_VALUE));
    }

    @Test
    void shouldKeepTraditionalBehaviourAvailable() {

        assertEquals(
                "Positive integer",
                BeforePatternMatching.classify(10));

        assertEquals(
                "Positive double",
                BeforePatternMatching.classify(10.5));

        assertEquals(
                "Other number",
                BeforePatternMatching.classify(10L));
    }
}
