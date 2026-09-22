package org.todtete.performance;

/**
 * Documentation-oriented example for Compact Object Headers.
 *
 * <p>
 * JEP 534 makes compact object headers the default in Java 27.
 * This is primarily a JVM-level optimization rather than
 * a source-code feature.
 * </p>
 *
 * <p>
 * Developers do not normally need to modify application code
 * to take advantage of this optimization.
 * </p>
 */
public final class CompactObjectHeadersDemo {

    private CompactObjectHeadersDemo() {
    }

    public static void demonstrate() {

        System.out.println(
                "Compact Object Headers are a JVM-level optimization.");

        System.out.println(
                "No application-level syntax is required.");
    }
}