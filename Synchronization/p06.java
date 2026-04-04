//Parallel sum of array using 4 threads and executor service.

import java.util.concurrent.*;

public class p06 {
    public static void main(String[] args) throws Exception {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int numThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        int length = arr.length;
        int chunkSize = (int) Math.ceil((double) length / numThreads);

        Future<Integer>[] futures = new Future[numThreads];

        // Submit tasks
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, length);

            futures[i] = executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += arr[j];
                }
                System.out.println(Thread.currentThread().getName() +
                                   " computed sum: " + sum);
                return sum;
            });
        }

        // Collect results
        int totalSum = 0;
        for (Future<Integer> f : futures) {
            totalSum += f.get();  // blocking call
        }

        System.out.println("Total Sum: " + totalSum);

        executor.shutdown();
    }
}