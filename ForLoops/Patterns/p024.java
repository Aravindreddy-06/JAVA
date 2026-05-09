/*
    A
   B B
  C C C
 D D D D 
E E E E E
*/
import java.util.*;
public class p024{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int n = sc.nextInt();

        char ch = 65;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                char temp = (char)(ch + i);
                System.out.print(temp + " ");
            }
            System.out.println("");
        }
    }
}