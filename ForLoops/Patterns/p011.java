/*
1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
*/

import java.util.*;

public class p011{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<n; k++){
                System.out.print(k+1 + " ");
            }
            System.out.println("");
        }
    }
}