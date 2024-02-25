package Exception_Handling.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, result;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator: ");
            n1 = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            n2 = scanner.nextInt();

            result = n1 / n2;

            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage() + " not allowed");
        }
    }
}
