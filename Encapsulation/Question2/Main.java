package Encapsulation.Question2;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void giveSalaryRaise(double salary) {
        if(salary < this.salary)
            System.out.println("New Salary is less than the Old Salary");
        else if(salary == this.salary)
            System.out.println("New Salary is the same as the Old Salary");
        else
            System.out.println("New Salary is more than the Old Salary");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John",9875,50000.0);
        employee.giveSalaryRaise(55000.0);
    }
}
