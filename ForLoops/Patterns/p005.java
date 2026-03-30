/*(Pascal Triangle)
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

*/


import java.util.*;

public class p005{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            int val = 1;
            for(int k=0; k<=i; k++){
                System.out.print(val + " ");
                val = val * (i-k) / (k+1);
            }
            System.out.println();
        }
    }
}

