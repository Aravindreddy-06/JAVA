import java.util.*;

public class LCM {
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
        int gcd = a;
        int lcm = (a * b)/gcd; //Formula

        System.out.println("CGD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}