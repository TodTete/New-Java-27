package org.todtete;
/**
 * Entry point for the Java 27 Feature Lab.
 *
 * <p>
 * This class provides a simple entry point to the project and
 * summarizes the purpose of the laboratory.
 * </p>
 *
 * <p>
 * The project is organized around practical Before & After
 * comparisons to demonstrate how Java continues to evolve.
 * </p>
 */
public class Main {

    public static void main(String[] args) {

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
    }
}