import java.util.*;

public class ArrayDeclaration{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}