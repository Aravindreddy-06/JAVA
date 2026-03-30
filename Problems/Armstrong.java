import java.util.*;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int n_copy = n;
        int sum = 0;
        int count = String.valueOf(n).length();
        if(count == 1){
            System.out.print("Armstrong Number");
            return;
        }

        while(n > 0){
            int rem = n%10;
            int cube = rem * rem * rem;
            sum += cube;
            n /= 10;
        }
        if(sum == n_copy){
            System.out.print("Armstrong Number");
        }else{
            System.out.print("Not an Armstrong Number");
        }
    }
}