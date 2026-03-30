class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+this.name + ", Age: "+this.age);
    }
}

public class thisKeyword{
    public static void main(String args[]){
        Student s = new Student("Aravind", 20);
        s.display();
    }
}