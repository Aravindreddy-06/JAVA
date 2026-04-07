/*
🟦 Count Pairs with Difference = k
📝 Problem Description
Given an integer array nums and an integer k, return the number of unique pairs (i, j) such that:

|nums[i] - nums[j]| = k   and   i ≠ j
🧪 Example 1
Input: nums = [1, 2, 3, 4, 5], k = 2
Output: 3
Explanation:
Pairs → (1,3), (2,4), (3,5)

🧪 Example 2
Input: nums = [1, 1, 1, 2, 2], k = 0
Output: 2
Explanation:
Pairs → (1,1), (2,2) (count unique numbers with freq ≥ 2)
*/

import java.util.*;

public class CountPairs{
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
        
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int count = 0;
        for(int num : map.keySet()){
            if(k > 0 && map.containsKey(num+k)){
                count++;
            }

            
            if(k == 0 && map.get(num) > 1){
                count++;
            }
        }
        System.out.println("Subarray Pairs with difference k is: " + count);
    }
}