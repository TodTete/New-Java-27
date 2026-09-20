package org.todtete.constants;

import java.lang.runtime.LazyConstant;

/**
 * Demonstrates the Lazy Constants API introduced as a
 * preview feature in Java 27.
 *
 * <p>
 * Lazy constants allow values to be initialized only when
 * they are actually required.
 * </p>
 *
 * <p>
 * Unlike traditional eager initialization, the value does
 * not need to be created during class initialization.
 * </p>
 *
 * <p>
 * JEP 531 - Lazy Constants (Third Preview).
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27
 */
public final class LazyConstantsDemo {

    /**
     * Lazy constant whose value is initialized on first access.
     */
    private static final LazyConstant<String>
            APPLICATION_CONFIGURATION =
            LazyConstant.of(() -> {

                System.out.println(
                        "Initializing configuration lazily...");

                return "Production configuration";
            });

    private LazyConstantsDemo() {
        // Utility class.
    }

    /**
     * Demonstrates lazy initialization.
     *
     * @return configuration value
     */
    public static String getConfiguration() {

        return APPLICATION_CONFIGURATION.get();
    }

    /**
     * Runs the demonstration.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println(
                "Application started.");

        System.out.println(
                "Configuration has not been requested yet.");

        System.out.println(
                "Configuration: "
                        + getConfiguration());
    }
}