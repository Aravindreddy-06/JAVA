import java.util.*;

public class RemoveDuplicates {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        for(int i=1; i<n; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("Resulted Array: ");
        for(int i=0; i<=j; i++){
            System.out.print(arr[i] + " ");
        }
    }
}