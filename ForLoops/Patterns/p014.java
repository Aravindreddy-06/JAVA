/*
* * * * *
* * * *
* * *
* *
*
* *
* * *
* * * *
* * * * *
*/

import java.util.*;


public class p014{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=0; k<n-i-1; k++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}