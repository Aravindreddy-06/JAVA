/*
1 2 3 4 5
2 3 4 5
3 4 5
4 5 
5
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5
*/

import java.util.*;
public class p018{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(j+1+i + " ");
            }
            System.out.println("");
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(n+j-i + " ");
            }
            System.out.println("");
        }
    }
}