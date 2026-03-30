import java.util.*;

public class UserInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name:");
        String name = sc.nextLine();

        System.out.print("Enter your Age:");
        int age = sc.nextInt();

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}