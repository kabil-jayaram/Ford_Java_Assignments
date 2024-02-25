package Exception_Handling.Question3;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
    private String message;

    public InvalidAgeException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class Main {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the age: ");
            age = scanner.nextInt();

            if(age < 0 || age > 150)
                throw new InvalidAgeException("Age must ne between 0 and 150");
        } catch (InvalidAgeException ex) {
            System.out.println("InvalidAgeException: " + ex.getMessage());
        }
    }
}
