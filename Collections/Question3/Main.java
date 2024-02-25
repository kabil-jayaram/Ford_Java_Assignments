package Collections.Question3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Map Operations");
            System.out.println("1 - Add Student and Grade");
            System.out.println("2 - Remove Student");
            System.out.println("3 - Display all Students and Grades");
            System.out.println("4 - Exit");
            System.out.print("Enter the choice: ");
            try {
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter Student and Grade to add: ");
                        String name = scanner.next();
                        int grade = scanner.nextInt();
                        studentGrades.put(name, grade);
                        System.out.println("Student " + name + " with Grade " + grade + " added to the map");
                        break;
                    case 2:
                        System.out.print("Enter Student to remove: ");
                        name = scanner.next();
                        studentGrades.remove(name);
                        System.out.println("Student " + name + " removed from the map");
                        break;
                    case 3:
                        if(!studentGrades.isEmpty()) {
                            System.out.println("Students and their Grades:");
                            for (Map.Entry<String, Integer> entry : studentGrades.entrySet())
                                System.out.println(entry.getKey() + " - " + entry.getValue());
                        } else
                            System.out.println("Map is empty");
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
