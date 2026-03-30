import java.util.*;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        int a = 0, b = 1;
        if(num >= 1){
            System.out.print(a + " ");
        }
        for(int i=2; i<=num; i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(a + " ");
        }
    }
}