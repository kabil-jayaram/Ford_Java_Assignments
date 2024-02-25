package Collections2.Question7;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeDatabase = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Employee Database Operations");
            System.out.println("1 - Add Employee");
            System.out.println("2 - Remove Employee");
            System.out.println("3 - Display all Employees");
            System.out.println("4 - Exit");
            System.out.print("Enter the choice: ");
            try {
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter Employee ID and Name to add: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        Employee employee = new Employee(id, name);
                        employeeDatabase.put(id, employee);
                        System.out.println("Employee " + name + " with ID " + id + " added to the database");
                        break;
                    case 2:
                        System.out.print("Enter Employee ID to remove: ");
                        id = scanner.nextInt();
                        employeeDatabase.remove(id);
                        System.out.println("Employee with ID " + id + " removed from the database");
                        break;
                    case 3:
                        if(!employeeDatabase.isEmpty()) {
                            System.out.println("Employees in ascending order of ID: ");
                            for(Map.Entry<Integer, Employee> employeeEntry: employeeDatabase.entrySet())
                                System.out.println(employeeEntry.getKey() + " - " + employeeEntry.getValue().getName());
                        } else
                            System.out.println("Employee Database is empty");
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between  1 and  4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }
    }
}
