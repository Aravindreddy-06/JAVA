import java.util.*;

public class StringArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[n];

        System.out.print("Enter the Array Names: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        System.out.println("Array Names: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}