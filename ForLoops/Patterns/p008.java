/*
* * * * *
 * * * *
  * * *
   * *
    *
*/

import java.util.*;

public class p008{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=n-i; k>0; k--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}