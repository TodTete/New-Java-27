package org.todtete.performance;

/**
 * Demonstrates how the application can inspect
 * the Garbage Collector selected by the JVM.
 *
 * <p>
 * Java 27 makes G1 the default garbage collector
 * across supported environments.
 * </p>
 */
public final class G1GarbageCollectorDemo {

    private G1GarbageCollectorDemo() {
    }

    public static void demonstrate() {

        System.out.println(
                "Garbage Collectors available to the JVM:");

        java.lang.management.ManagementFactory
                .getGarbageCollectorMXBeans()
                .forEach(gc ->
                        System.out.println(
                                gc.getName()));
    }
}