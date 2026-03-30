import java.util.*;

public class Swap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a =  sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("A after swap:" + a + "\nB after swap:" + b);
    }
}