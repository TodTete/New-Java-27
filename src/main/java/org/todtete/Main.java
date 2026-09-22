package org.todtete;

import org.todtete.concurrency.BeforeConcurrency;
import org.todtete.concurrency.StructuredConcurrencyDemo;
import org.todtete.constants.BeforeConstants;
import org.todtete.constants.LazyConstantsDemo;
import org.todtete.patternmatching.BeforePatternMatching;
import org.todtete.patternmatching.Java27PatternMatching;
import org.todtete.performance.CompactObjectHeadersDemo;
import org.todtete.performance.G1GarbageCollectorDemo;
import org.todtete.security.PostQuantumTlsDemo;
import org.todtete.vector.VectorApiDemo;

import java.util.Arrays;

/**
 * Entry point for the Java 27 Feature Lab.
 *
 * <p>
 * This class runs every demonstration of the laboratory in
 * sequence so the whole project can be executed with a single
 * command.
 * </p>
 *
 * <p>
 * The project is organized around practical Before &amp; After
 * comparisons to demonstrate how Java continues to evolve.
 * </p>
 */
public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("======================================");
        System.out.println("       Java 27 Feature Lab");
        System.out.println("======================================");
        System.out.println();

        System.out.println("Java version: " +
                Runtime.version());

        System.out.println();

        System.out.println("""
                This laboratory explores selected Java 27
                features through practical Before & After examples.

                Topics:
                - Pattern matching with primitive types
                - Structured concurrency
                - Lazy constants
                - Runtime and performance improvements
                - Post-quantum security
                - Vector API
                """);

        runPatternMatching();
        runConcurrency();
        runLazyConstants();
        runPerformance();
        runSecurity();
        runVectorApi();

        section("Laboratory completed");
    }

    /**
     * Prints a section header.
     *
     * @param title section title
     */
    private static void section(String title) {

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println(title);
        System.out.println("--------------------------------------");
    }

    private static void runPatternMatching() {

        section("1. Pattern matching with primitive types");

        System.out.println("Before: "
                + BeforePatternMatching.classify(10));

        System.out.println("After:  "
                + Java27PatternMatching.classify(10));

        System.out.println("After:  "
                + Java27PatternMatching.classify(-10));

        System.out.println("After:  "
                + Java27PatternMatching.classify(0));
    }

    private static void runConcurrency() throws Exception {

        section("2. Structured concurrency");

        System.out.print("Before: ");
        BeforeConcurrency.demonstrate();

        System.out.print("After:  ");
        StructuredConcurrencyDemo.demonstrate();
    }

    private static void runLazyConstants() {

        section("3. Lazy constants");

        System.out.println("Before: "
                + BeforeConstants.getConfiguration());

        System.out.println("After:  "
                + LazyConstantsDemo.getConfiguration());
    }

    private static void runPerformance() {

        section("4. Runtime and performance");

        CompactObjectHeadersDemo.demonstrate();

        System.out.println();

        G1GarbageCollectorDemo.demonstrate();
    }

    private static void runSecurity() {

        section("5. Post-quantum security");

        PostQuantumTlsDemo.demonstrate();
    }

    private static void runVectorApi() {

        section("6. Vector API");

        float[] left = {1.0f, 2.0f, 3.0f, 4.0f};
        float[] right = {10.0f, 20.0f, 30.0f, 40.0f};

        System.out.println("Result: "
                + Arrays.toString(
                        VectorApiDemo.add(left, right)));
    }
}
