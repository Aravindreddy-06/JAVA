import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Builtin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //sorting
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        //Fill Array with Element

        Arrays.fill(arr,5);
        System.out.println("Filled Array: " + Arrays.toString(arr));
        //Binary Search
        int index = Arrays.binarySearch(arr,5);
        System.out.println("Element Found at Index: " + index);

        //Arrays.copyOf(arr,arr.length)
        int copy[] = Arrays.copyOf(arr,arr.length);
        System.out.println("Copy String: " + Arrays.toString(copy));

        //Equals
        System.out.println("Is Equal? " + Arrays.equals(arr,copy));

        //asList() -> converts arrays to fixed size List.
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        System.out.println("List: " + list);

    }
}