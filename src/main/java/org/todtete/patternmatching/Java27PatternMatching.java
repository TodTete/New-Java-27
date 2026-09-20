package org.todtete.patternmatching;
/**
 * Demonstrates Java 27 primitive pattern matching.
 *
 * <p>
 * This example uses the fifth preview of JEP 532:
 *
 * Primitive Types in Patterns, instanceof, and switch.
 * </p>
 *
 * <p>
 * Preview features are experimental language features and
 * must be explicitly enabled when compiling and running
 * the application.
 * </p>
 */
public final class Java27PatternMatching {

    private Java27PatternMatching() {
        // Utility class.
    }

    /**
     * Classifies a numeric primitive using pattern matching.
     *
     * @param value numeric value
     * @return textual classification
     */
    public static String classify(int value) {

        return switch (value) {

            case int number when number > 0 ->
                    "Positive integer";

            case int number when number < 0 ->
                    "Negative integer";

            case 0 ->
                    "Zero";
        };
    }
}