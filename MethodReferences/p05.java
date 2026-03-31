// 4. Reference to a Constructor

import java.util.function.Supplier;

class Student {
    Student() {
        System.out.println("Student object created");
    }
}

class p05{
    public static void main(String[] args) {

        Supplier<Student> supplier = Student::new;
        supplier.get();
    }
}