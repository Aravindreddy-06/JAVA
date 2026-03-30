import java.util.*;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int n_copy = n;
        int rev = 0;
        while(n > 0){
            int rem = n%10;
            rev = (rev * 10) + rem;
            n = n/10;
        }
        if(rev == n_copy){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not a Palindrome");
        }
    }
}