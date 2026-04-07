//Find peak Element in Mountain Array.

import java.util.*;

public class PeakElement {

    public static int peakIndex(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1; // move right
            } else {
                high = mid; // keep mid
            }
        }
        return low; // peak index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter mountain array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peak = peakIndex(arr);

        System.out.println("Peak element index: " + peak);
        System.out.println("Peak element value: " + arr[peak]);

        sc.close();
    }
}