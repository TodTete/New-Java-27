package org.todtete.vector;

import org.junit.jupiter.api.Test;

import java.util.random.RandomGenerator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for {@link VectorApiDemo}.
 *
 * <p>
 * JEP 537 - Vector API (Twelfth Incubator).
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27 Feature Lab
 */
class VectorApiTest {

    private static final float TOLERANCE = 0.0001f;

    /**
     * Verifies the addition of a small array that does not
     * necessarily fill a complete vector.
     */
    @Test
    void shouldAddSmallArrays() {

        float[] result =
                VectorApiDemo.add(
                        new float[] {1.0f, 2.0f, 3.0f, 4.0f},
                        new float[] {10.0f, 20.0f, 30.0f, 40.0f});

        assertArrayEquals(
                new float[] {11.0f, 22.0f, 33.0f, 44.0f},
                result,
                TOLERANCE);
    }

    /**
     * Verifies that the tail loop handles array lengths that are
     * not a multiple of the preferred vector width.
     */
    @Test
    void shouldAddArraysWithIncompleteTrailingVector() {

        int length = 1_003;

        RandomGenerator random =
                RandomGenerator.getDefault();

        float[] left = new float[length];
        float[] right = new float[length];
        float[] expected = new float[length];

        for (int i = 0; i < length; i++) {

            left[i] = random.nextFloat();
            right[i] = random.nextFloat();

            expected[i] = left[i] + right[i];
        }

        assertArrayEquals(
                expected,
                VectorApiDemo.add(left, right),
                TOLERANCE);
    }

    /**
     * Verifies that an empty input produces an empty result.
     */
    @Test
    void shouldReturnEmptyResultForEmptyInput() {

        assertEquals(
                0,
                VectorApiDemo.add(
                        new float[0],
                        new float[0]).length);
    }

    /**
     * Verifies that mismatched lengths are rejected.
     */
    @Test
    void shouldRejectArraysOfDifferentLength() {

        assertThrows(
                IllegalArgumentException.class,
                () -> VectorApiDemo.add(
                        new float[] {1.0f},
                        new float[] {1.0f, 2.0f}));
    }
}
