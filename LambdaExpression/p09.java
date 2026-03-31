import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class p09 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", 50000));
        list.add(new Employee("Bob", 40000));
        list.add(new Employee("Charlie", 50000));
        list.add(new Employee("Adam", 40000));

        list.sort((e1, e2) -> {
            if (e1.salary != e2.salary) {
                return e1.salary - e2.salary; // sort by salary
            } else {
                return e1.name.compareTo(e2.name); // sort by name
            }
        });

        System.out.println(list);
    }
}

/*
✅ Cleaner (BEST Practice – Interview)
list.sort(Comparator.comparingInt((Employee e) -> e.salary).thenComparing(e -> e.name));

🔥 Descending Salary + Ascending Name
list.sort(Comparator.comparingInt((Employee e) -> e.salary).reversed().thenComparing(e -> e.name));
*/