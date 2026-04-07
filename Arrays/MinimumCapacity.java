//Minimum capacity to ship packages in D days.

import java.util.*;

public class MinimumCapacity {

    // Function to check required days for given capacity
    public static int findDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;

        for (int w : weights) {
            if (load + w > capacity) {
                days++;
                load = w;
            } else {
                load += w;
            }
        }
        return days;
    }

    public static int shipWithinDays(int[] weights, int D) {
        int low = 0, high = 0;

        // Define search space
        for (int w : weights) {
            low = Math.max(low, w); // max element
            high += w; // sum
        }

        // Binary search
        while (low < high) {
            int mid = (low + high) / 2;

            int days = findDays(weights, mid);

            if (days <= D) {
                high = mid; // try smaller capacity
            } else {
                low = mid + 1; // need bigger capacity
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weights = new int[n];

        // Input weights
        System.out.println("Enter weights: ");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        // Input days
        System.out.print("Enter number of days: ");
        int D = sc.nextInt();

        int result = shipWithinDays(weights, D);

        System.out.println("Minimum capacity required: " + result);

        sc.close();
    }
}