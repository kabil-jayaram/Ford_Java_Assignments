package Abstract_Class.Question2;

abstract class Employee {
    String name;
    String id;
    double monthlySalary;

    abstract double calculateAnnualSalary();
}

class Manager extends Employee {
    public Manager(String name, String id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    double calculateAnnualSalary() {
        return this.monthlySalary * 12;
    }
}

class Developer extends Employee {
    public Developer(String name, String id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    double calculateAnnualSalary() {
        return this.monthlySalary * 12;
    }
}

public class Main {
    public static void main(String[] args) {
       Manager manager = new Manager("John","M001",5000);
        System.out.println("Manager Annual Salary: " + manager.calculateAnnualSalary());

       Developer developer = new Developer("Raja","D001",4000);
        System.out.println("Developer Annual Salary: " + developer.calculateAnnualSalary());
    }
}
