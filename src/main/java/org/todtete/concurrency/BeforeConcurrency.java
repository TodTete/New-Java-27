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

    public static void execute() throws Exception {

        try (ExecutorService executor =
                     Executors.newFixedThreadPool(2)) {

            Future<String> firstTask =
                    executor.submit(() -> "Task A");

            Future<String> secondTask =
                    executor.submit(() -> "Task B");

            String firstResult = firstTask.get();
            String secondResult = secondTask.get();

            System.out.println(firstResult);
            System.out.println(secondResult);
        }
    }
}