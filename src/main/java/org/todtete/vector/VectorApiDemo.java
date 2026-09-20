package org.todtete.vector;

import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorSpecies;

/**
 * Demonstrates the Vector API available as an incubating
 * feature in Java 27.
 *
 * <p>
 * The Vector API allows Java applications to express
 * vector computations that can be compiled to appropriate
 * hardware vector instructions at runtime.
 * </p>
 *
 * <p>
 * This example compares the conceptual scalar operation
 * of adding two arrays with a vectorized implementation.
 * </p>
 *
 * <p>
 * JEP 537 - Vector API (Twelfth Incubator).
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27
 */
public final class VectorApiDemo {

    /**
     * Preferred vector species for the current platform.
     */
    private static final VectorSpecies<Float> SPECIES =
            FloatVector.SPECIES_PREFERRED;

    private VectorApiDemo() {
        // Utility class.
    }

    /**
     * Adds two float arrays using the Vector API.
     *
     * @param left first input array
     * @param right second input array
     * @return resulting array
     */
    public static float[] add(
            float[] left,
            float[] right) {

        if (left.length != right.length) {
            throw new IllegalArgumentException(
                    "Arrays must have the same length.");
        }

        float[] result =
                new float[left.length];

        int upperBound =
                SPECIES.loopBound(left.length);

        /*
         * Process multiple elements per iteration
         * using the preferred vector width.
         */
        for (int i = 0;
             i < upperBound;
             i += SPECIES.length()) {

            var leftVector =
                    FloatVector.fromArray(
                            SPECIES,
                            left,
                            i);

            var rightVector =
                    FloatVector.fromArray(
                            SPECIES,
                            right,
                            i);

            var resultVector =
                    leftVector.add(rightVector);

            resultVector.intoArray(
                    result,
                    i);
        }

        /*
         * Process remaining elements that do not fill
         * a complete vector.
         */
        for (int i = upperBound;
             i < left.length;
             i++) {

            result[i] =
                    left[i] + right[i];
        }

        return result;
    }

    /**
     * Executes a simple demonstration.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        float[] left = {
                1.0f, 2.0f, 3.0f, 4.0f
        };

        float[] right = {
                10.0f, 20.0f, 30.0f, 40.0f
        };

        float[] result =
                add(left, right);

        for (float value : result) {
            System.out.println(value);
        }
    }
}