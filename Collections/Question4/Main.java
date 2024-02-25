package Collections.Question4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Queue Operations");
            System.out.println("1 - Enqueue Elements");
            System.out.println("2 - Dequeue Elements");
            System.out.println("3 - Display all Elements");
            System.out.println("4 - Exit");
            System.out.print("Enter the choice: ");
            try {
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter Element to add: ");
                        String element = scanner.next();
                        stringQueue.add(element);
                        System.out.println("Element " + element + " added to the queue");
                        break;
                    case 2:
                        System.out.print("Enter Element to remove: ");
                        element = scanner.next();
                        stringQueue.remove(element);
                        System.out.println("Element " + element + " removed from the queue");
                        break;
                    case 3:
                        if(!stringQueue.isEmpty()) {
                            System.out.println("Elements in Queue: ");
                            for (String queueElement : stringQueue)
                                System.out.println(queueElement);
                        } else
                            System.out.println("Queue is empty");
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
