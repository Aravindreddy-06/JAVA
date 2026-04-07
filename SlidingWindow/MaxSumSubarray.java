/*
🧩 Maximum Sum Subarray of Size K
📝 Problem Description (LeetCode Style)
Given an integer array nums and an integer k, find the maximum sum of any contiguous subarray of size k.

Return the maximum sum.

📌 Examples
✅ Example 1
Input: nums = [2, 1, 5, 1, 3, 2], k = 3
Output: 9
Explanation:
Subarrays of size 3:
[2,1,5] → 8
[1,5,1] → 7
[5,1,3] → 9 ✅
[1,3,2] → 6
Maximum sum = 9

✅ Example 2
Input: nums = [1, 4, 2, 10, 2, 3, 1, 0, 20], k = 4
Output: 24
Explanation:
Subarrays:
[1,4,2,10] → 17
[4,2,10,2] → 18
[2,10,2,3] → 17
[10,2,3,1] → 16
[2,3,1,0] → 6
[3,1,0,20] → 24 ✅
Maximum sum = 24
*/
import java.util.*;

public class MaxSumSubarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target k: ");
        int k = sc.nextInt();

        //step1: First Window Sum
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }
        int max_sum = windowSum;
        
        //step2: Sliding Window.
        for(int i=k; i<n; i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];

            max_sum = Math.max(max_sum, windowSum);
        }
        System.out.println("Subarrays With Max Sum Equal to k: " + max_sum);
    }
}