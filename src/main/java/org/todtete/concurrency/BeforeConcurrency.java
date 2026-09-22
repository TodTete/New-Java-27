package org.todtete.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Demonstrates a traditional approach to executing
 * multiple concurrent operations.
 */
public final class BeforeConcurrency {

    private BeforeConcurrency() {
    }

    /**
     * Executes two independent tasks on a shared thread pool.
     *
     * <p>
     * The caller owns the lifecycle of the executor, the error
     * handling and the cancellation of any pending task.
     * </p>
     *
     * @return combined result of both tasks
     * @throws Exception if a task fails or the caller is interrupted
     */
    public static String execute() throws Exception {

        try (ExecutorService executor =
                     Executors.newFixedThreadPool(2)) {

            Future<String> firstTask =
                    executor.submit(() -> "Task A completed");

            Future<String> secondTask =
                    executor.submit(() -> "Task B completed");

            String firstResult = firstTask.get();
            String secondResult = secondTask.get();

            return firstResult
                    + " | "
                    + secondResult;
        }
    }

    /**
     * Prints the outcome of the traditional approach.
     *
     * @throws Exception if a task fails
     */
    public static void demonstrate() throws Exception {
        System.out.println(execute());
    }
}