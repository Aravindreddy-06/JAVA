import java.util.*;

public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }

        System.out.println("Reversed Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}