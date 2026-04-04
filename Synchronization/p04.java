//Executor service fixed thread pool of 3.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class p04 {
    public static void main(String[] args) {

        // Create thread pool of size 3
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit 6 tasks
        for (int i = 1; i <= 6; i++) {
            int taskId = i;

            executor.submit(() -> {
                System.out.println(
                    "Task " + taskId + " executed by " + Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutdown executor
        executor.shutdown();
    }
}