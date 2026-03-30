import java.util.*;

public class MoveZeroestoEnd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println("Resulted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}