import java.util.*;

class Student{
    String name;
    int age;

    void getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Enter Age: ");
        age = sc.nextInt();
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassUserInput{
    public static void main(String args[]){
        Student s1 = new Student();

        s1.getInput();
        s1.display();
    }
}