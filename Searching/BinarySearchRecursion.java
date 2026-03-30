import java.util.*;

public class BinarySearchRecursion{
    public static int Search(int arr[], int low, int high, int key){
        Arrays.sort(arr);

        if(low > high) return -1;

        int mid = (low + high)/2;
        if(arr[mid] == key){
            return mid;
        }else if(arr[mid] > key){
            return Search(arr, low, mid-1, key);
        }else{
            return Search(arr, mid+1, high, key);
        }
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

        int result = Search(arr, 0, arr.length-1, key);

        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}