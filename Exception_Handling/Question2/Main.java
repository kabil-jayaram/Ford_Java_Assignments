package Exception_Handling.Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter any number: ");
            n1 = Integer.parseInt(scanner.next());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: Invalid Input. Please provide a valid integer");
        }
    }
}
