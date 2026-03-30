import java.util.*;

public class LinearSearch{
    public static int search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Key Value: ");
        int key = sc.nextInt();

        int result = search(arr, key);

        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}