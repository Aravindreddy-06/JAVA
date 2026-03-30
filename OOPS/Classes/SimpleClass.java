class Student{
    String name;
    int age;

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
    }
}

public class SimpleClass{
    public static void main(String args[]){
        Student s1 = new Student();

        s1.name = "Aravind";
        s1.age = 20;

        s1.display();
    }
}