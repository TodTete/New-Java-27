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

    /**
     * Executes two related tasks as a single unit of work.
     *
     * @return combined result of both subtasks
     * @throws Exception if a subtask fails or the scope is interrupted
     */
    public static String execute() throws Exception {

        try (var scope =
                     StructuredTaskScope.open()) {

            var taskA = scope.fork(
                    () -> "Task A completed");

            var taskB = scope.fork(
                    () -> "Task B completed");

            /*
             * join() waits for every subtask. When one of them fails
             * the scope cancels the remaining work and propagates
             * the failure to the caller.
             */
            scope.join();

            return taskA.get()
                    + " | "
                    + taskB.get();
        }
    }

    /**
     * Prints the outcome of the structured scope.
     *
     * @throws Exception if a subtask fails
     */
    public static void demonstrate() throws Exception {
        System.out.println(execute());
    }
}