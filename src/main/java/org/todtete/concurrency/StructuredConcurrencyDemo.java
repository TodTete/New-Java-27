package org.todtete.concurrency;

import java.util.concurrent.StructuredTaskScope;

/**
 * Demonstrates structured concurrency in Java 27.
 *
 * <p>
 * Structured concurrency treats related concurrent tasks
 * as a single unit of work.
 * </p>
 *
 * <p>
 * This improves readability and makes task ownership,
 * cancellation and error propagation easier to reason about.
 * </p>
 *
 * <p>
 * JEP 533 is a preview feature in Java 27.
 * </p>
 */
public final class StructuredConcurrencyDemo {

    private StructuredConcurrencyDemo() {
    }

    public static void execute() throws Exception {

        try (var scope =
                     StructuredTaskScope.open()) {

            var taskA = scope.fork(
                    () -> "Task A completed");

            var taskB = scope.fork(
                    () -> "Task B completed");

            scope.join();

            System.out.println(taskA.get());
            System.out.println(taskB.get());
        }
    }
}