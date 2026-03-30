import java.util.*;

public class FindCommonElements{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array 1");
        int n = sc.nextInt();
        System.out.println("Enter the Size of the array 2");
        int m = sc.nextInt();
        sc.nextLine();

        String arr1[] = new String[n];
        String arr2[] = new String[m];

        System.out.println("Enter the Elements: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextLine();
        }
        System.out.println("Enter the Elements: ");
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextLine();
        }

        Set<String> set = new HashSet<>();
        for(String s : arr1){
            set.add(s);
        }

        System.out.println("Common Elements: ");
        for(String s : arr2){
            if(set.contains(s)){
                System.out.println(s);
            }
        }
    }
}