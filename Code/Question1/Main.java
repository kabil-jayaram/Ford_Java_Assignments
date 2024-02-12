package Code.Question1;

import java.util.*;

class Employee {
    private String firstName, lastName, department, company;

    public Employee() {

    }
    public Employee(String firstName, String lastName, String department, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getCompany() {
        return company;
    }
}

class CredentialService {
    private String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        public String generatePassword() {
        StringBuilder pswd = new StringBuilder();
        int i, index, alpha = 0, nums = 0, symbol = 0;
        for(i = 0;i < 10;i++) {
            index = (int)(alphaNumericString.length() * Math.random());
            pswd.append(alphaNumericString.charAt(index));
        }
        return pswd.toString();
    }

    public String generateEmailAddress(String firstName, String lastName, String company, String department) {
        return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + company.toLowerCase() + "." + "com";
    }

    public void showCredentials(Employee obj) {
        System.out.println("\nDear " + obj.getFirstName() + " your generated credentials are as follows: ");
        System.out.println("Email: " + generateEmailAddress(obj.getFirstName(), obj.getLastName(), obj.getCompany(), obj.getDepartment()));
        System.out.println("Password: " + generatePassword());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String firstName = in.next();
        System.out.print("Enter your Last Name: ");
        String lastName = in.next();
        System.out.print("Enter the Company Name: ");
        String company = in.next();
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int ch = in.nextInt();
        String department;
        if(ch == 1)
            department = "tech";
        else if(ch == 2)
            department = "admin";
        else if(ch == 3)
            department = "hr";
        else
            department = "legal";

        Employee emp = new Employee(firstName,lastName,department,company);
        CredentialService credserv = new CredentialService();
        credserv.showCredentials(emp);
    }
}
