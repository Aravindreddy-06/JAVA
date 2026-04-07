/*
🟦 Longest Subarray with Sum Equals K
📝 Problem Description
Given an integer array nums and an integer k, return the length of the longest subarray whose sum is equal to k.

A subarray is a contiguous sequence of elements within an array.

📥 Input
An integer array nums
An integer k

📤 Output
Return an integer representing the maximum length of a subarray whose sum equals k


🧪 Example 1
Input: nums = [1, -1, 5, -2, 3], k = 3
Output: 4
Explanation:
Subarray [1, -1, 5, -2] has sum = 3 and length = 4.

🧪 Example 2
Input: nums = [-2, -1, 2, 1], k = 1
Output: 2
Explanation:
Subarray [-1, 2] has sum = 1 and length = 2.

🧪 Example 3
Input: nums = [1, 2, 3], k = 3
Output: 2
Explanation:
Subarray [1, 2] has sum = 3.

*/

import java.util.*;

public class SubarraySum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();

        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target k: ");
        int k = sc.nextInt();
        int sum = 0;
        int maxLen = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum == k){
                maxLen = i+1;
            }

            if(map.containsKey(sum - k)){
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println("Length of the Max SubArray with Sum Equals K: " + maxLen);
    }
}