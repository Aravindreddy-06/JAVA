/*
1 2 3 4
 2 3 4
  3 4
   4
  3 4
 2 3 4 
1 2 3 4
*/

import java.util.*;

public class p012{
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
            System.out.println(" ");
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print(n-i+k + " ");
            }
            System.out.println(" ");
        }
    } 
}