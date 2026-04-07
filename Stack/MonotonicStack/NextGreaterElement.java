/*
Decreasing stack: big → small
Array: 10, 8, 5, 3
Stack becomes:
Top → 3
       5
       8
       10

Increasing stack: small → big
Array: 3, 5, 8, 10
Stack becomes:
Top → 10
       8
       5
       3
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 3, 4};
        int n = arr.length;

        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // Assign result
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }

            // Push current element
            st.push(arr[i]);
        }

        // Print result
        System.out.println("Next Greater Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}