import java.util.*;

class Employee {
    private String name;
    private int salary;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter
    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class Salary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 30000),
            new Employee("Bob", 50000),
            new Employee("Charlie", 45000),
            new Employee("David", 25000)
        );

        long count = employees.stream()
                              .filter(emp -> emp.getSalary() > 40000)
                              .count();

        System.out.println("Employees with salary > 40000: " + count);
    }
}