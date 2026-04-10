import java.util.*;

public class ArraySum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        System.out.println("Enter Target Sum: ");
        int target = sc.nextInt();

        int i=0;
        int j=n-1;

        boolean sumFound = false;
        while(i < j){
            int  sum = arr[i] + arr[j];
            if(sum == target){
                sumFound = true;
                break;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        if(sumFound){
            System.out.println("Sum Found.");
        }else{
            System.out.println("Sum Not found.");
        }
    }
}