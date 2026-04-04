//Callable<Integer> return result from thread using future get()

import java.util.concurrent.*;

public class p05 {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create Callable task
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += i;
                Thread.sleep(200); // simulate work
            }
            return sum; // returning result
        };

        // Submit task and get Future
        Future<Integer> future = executor.submit(task);

        // Get result (blocks until result is ready)
        Integer result = future.get();

        System.out.println("Result: " + result);

        executor.shutdown();
    }
}