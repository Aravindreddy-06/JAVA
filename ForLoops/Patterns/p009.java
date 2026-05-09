/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/

import java.util.*;

public class p009{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}