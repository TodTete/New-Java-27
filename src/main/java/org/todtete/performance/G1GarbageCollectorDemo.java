package org.todtete.performance;

/**
 * Demonstrates how the application can inspect
 * the Garbage Collector selected by the JVM.
 *
 * <p>
 * JEP 523 makes G1 the default garbage collector in all
 * environments.
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