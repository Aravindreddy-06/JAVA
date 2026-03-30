import java.util.*;

public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        int p = sc.nextInt();

        System.out.print("Enter the Duration: ");
        int t = sc.nextInt();

        System.out.print("Enter the Rate(%): ");
        int r = sc.nextInt();

        float simpleInterest = ((p*t*r)/100);
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}