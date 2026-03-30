import java.util.*;

class Student{
    String name;
    int age;
    int marks;
    char grade;

    Student(Scanner sc){ //constructor

        System.out.print("Enter the Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter the Student Age: ");
        age = sc.nextInt();

        System.out.print("Enter the Student Marks: ");
        marks = sc.nextInt();
        sc.nextLine();

        if(marks >= 90) grade = 'A';
        else if(marks >= 75) grade = 'B';
        else if(marks >= 50) grade = 'C';
        else grade = 'F';
    }
    void display(){
        System.out.println("Name: "+name + ", Age: "+age +", Marks: "+marks +", Grade: "+grade);
    }
}

public class ClassUsingConstructor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student s[] = new Student[n]; //Creating the Object.

        for(int i=0; i<n; i++){
            System.out.println("\nEnter details for student "+ (i+1));
            s[i] = new Student(sc);
        }

        //output
        System.out.println("\nStudent Details: ");
        for(int i=0; i<n; i++){
            s[i].display();
        }
    }
}