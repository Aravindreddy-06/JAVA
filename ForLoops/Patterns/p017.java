/*
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
1 2 
1 2 3 
1 2 3 4
1 2 3 4 5
*/

import java.util.*;
public class p017{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}