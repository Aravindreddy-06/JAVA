//Range Sum Query using prefix sum array.
import java.util.*;

public class RangeSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            arr[i] = sum;
        }

        System.out.println("Prefix Sum Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}