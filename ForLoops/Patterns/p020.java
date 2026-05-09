/*
    * 
   * *
  *   *
 *     *
* * * * *
*/

import java.util.*;

public class p020{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                if(i==0 || i==n-1 || k==0 || k==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}