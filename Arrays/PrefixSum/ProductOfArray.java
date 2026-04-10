/*
238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.


Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/
import java.util.*;
public class ProductOfArray{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int res[] = new int[n];
        res[0] = 1;
        for(int i=1; i<n; i++){
            res[i] = res[i-1] * arr[i-1];
        }

        int product = 1;
        for(int i=n-1; i>=0; i--){
            res[i] *= product;
            product *= arr[i];
        }

        System.out.println("Result Array: ");
        for(int num : res){
            System.out.print(num + " ");
        }
    }
}