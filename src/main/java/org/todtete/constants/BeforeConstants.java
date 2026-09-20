package org.todtete.constants;
/**
 * Demonstrates the traditional approach to declaring constants
 * before the Lazy Constants API introduced in Java 27.
 *
 * <p>
 * A static final field is initialized when the class is initialized.
 * This means that potentially expensive initialization can happen
 * even when the constant is never actually used.
 * </p>
 *
 * <p>
 * This class is intentionally simple because its purpose is to
 * establish the "Before" scenario for comparison with
 * {@link LazyConstantsDemo}.
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27 Feature Lab
 */
public final class BeforeConstants {

    /**
     * Example of eager initialization.
     *
     * <p>
     * The value is created as part of class initialization.
     * </p>
     */
    private static final String APPLICATION_CONFIGURATION =
            initializeConfiguration();

    private BeforeConstants() {
        // Utility class.
    }

    /**
     * Simulates an expensive initialization operation.
     *
     * @return application configuration
     */
    private static String initializeConfiguration() {

        System.out.println(
                "Initializing configuration eagerly...");

        return "Production configuration";
    }

    /**
     * Returns the configuration.
     *
     * @return configuration value
     */
    public static String getConfiguration() {
        return APPLICATION_CONFIGURATION;
    }
}