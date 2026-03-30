/*
A
A B 
A B C
A B C D
A B C D E
*/


import java.util.*;

public class p003{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No of rows: ");
        int n = sc.nextInt();

        char ch = 65;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                char temp = (char)(ch + j);
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}