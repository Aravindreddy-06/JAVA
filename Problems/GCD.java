import java.util.*;

public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a: ");
        int a = sc.nextInt();

        System.out.print("Enter the b: ");
        int b = sc.nextInt();

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("CGD = " + a);
    }
}