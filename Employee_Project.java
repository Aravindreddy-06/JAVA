import java.io.*;
import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return id + "," + name + "," + salary;
    }

    public static Employee fromString(String data) {
        String[] parts = data.split(",");
        return new Employee(
                Integer.parseInt(parts[0]),
                parts[1],
                Double.parseDouble(parts[2])
        );
    }
}

public class Employee_Project {

    static final String FILE_NAME = "employees.txt";

    // Add Employee
    public static void addEmployee(Employee emp) throws IOException {
        FileWriter fw = new FileWriter(FILE_NAME, true);
        fw.write(emp.toString() + "\n");
        fw.close();
    }

    // View Employees
    public static List<Employee> getAllEmployees() throws IOException {
        List<Employee> list = new ArrayList<>();
        File file = new File(FILE_NAME);

        if (!file.exists()) return list;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            list.add(Employee.fromString(line));
        }
        br.close();

        return list;
    }

    // Search Employee
    public static Employee searchEmployee(int id) throws IOException {
        for (Employee e : getAllEmployees()) {
            if (e.getId() == id) return e;
        }
        return null;
    }

    // Delete Employee
    public static void deleteEmployee(int id) throws IOException {
        List<Employee> list = getAllEmployees();

        FileWriter fw = new FileWriter(FILE_NAME);
        for (Employee e : list) {
            if (e.getId() != id) {
                fw.write(e.toString() + "\n");
            }
        }
        fw.close();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Employee");
            System.out.println("2.View Employees");
            System.out.println("3.Search Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    addEmployee(new Employee(id, name, salary));
                    System.out.println("Employee Added!");
                    break;

                case 2:
                    List<Employee> list = getAllEmployees();
                    if (list.isEmpty()) {
                        System.out.println("No Employees Found");
                    } else {
                        for (Employee e : list) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    Employee e = searchEmployee(searchId);
                    if (e != null)
                        System.out.println("Found: " + e);
                    else
                        System.out.println("Not Found");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    deleteEmployee(deleteId);
                    System.out.println("Deleted Successfully!");
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;
            }
        }
    }
}