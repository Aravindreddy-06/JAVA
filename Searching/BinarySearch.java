import java.util.*;

public class BinarySearch{
    public static int Search(int arr[], int key){
        int low = 0;
        int high = arr.length-1;
        Arrays.sort(arr);
        
        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                high = mid - 1;
            }else{
                low = mid + 1;
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

        int result = Search(arr, key);

        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}