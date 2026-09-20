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
 * This provides a clearer lifecycle for concurrent tasks
 * and improves cancellation, error propagation and
 * observability.
 * </p>
 *
 * <p>
 * JEP 533 - Structured Concurrency (Seventh Preview).
 * </p>
 *
 * @author Ricardo Vallejo Sanchez
 * @since Java 27
 */
public final class StructuredConcurrencyDemo {

    private StructuredConcurrencyDemo() {
        // Utility class.
    }

    /**
     * Executes two related tasks concurrently.
     *
     * @return combined result
     * @throws Exception if a subtask fails
     */
    public static String execute() throws Exception {

        try (var scope = StructuredTaskScope.open()) {

            var taskA = scope.fork(
                    () -> "Task A completed");

            var taskB = scope.fork(
                    () -> "Task B completed");

            /*
             * join() waits for the subtasks to finish.
             * If a subtask fails, the structured scope
             * propagates the failure.
             */
            scope.join();

            return taskA.get()
                    + " | "
                    + taskB.get();
        }
    }

    /**
     * Application entry point.
     *
     * @param args command-line arguments
     * @throws Exception if execution fails
     */
    public static void main(String[] args)
            throws Exception {

        System.out.println(execute());
    }
}