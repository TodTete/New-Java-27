package org.todtete.patternmatching;
/**
 * Demonstrates a traditional approach for handling
 * different numeric types.
 *
 * <p>
 * Before modern primitive pattern matching, developers
 * commonly needed explicit type checks and conversions.
 * </p>
 */
public final class BeforePatternMatching {

    private BeforePatternMatching() {
        // Utility class.
    }

    public static String classify(Number value) {

        if (value instanceof Integer) {

            int number = value.intValue();

            if (number > 0) {
                return "Positive integer";
            }

            return "Non-positive integer";
        }

        if (value instanceof Double) {

            double number = value.doubleValue();

            if (number > 0) {
                return "Positive double";
            }

            return "Non-positive double";
        }

        return "Other number";
    }
}