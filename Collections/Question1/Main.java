package Collections.Question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner =  new Scanner(System.in);
        while(true) {
            System.out.println("ArrayList Operations");
            System.out.println("1 - Add Element");
            System.out.println("2 - Remove Element");
            System.out.println("3 - Find Element Index");
            System.out.println("4 - Display all Element");
            System.out.println("5 - Exit");
            System.out.print("Enter the choice: ");
            try {
                int ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter element to add: ");
                        int element = scanner.nextInt();
                        integerList.add(element);
                        System.out.println("Element " + element + " added to the list");
                        break;
                    case 2:
                        System.out.print("Enter element to remove: ");
                        element = scanner.nextInt();
                        integerList.remove(Integer.valueOf(element));
                        System.out.println("Element " + element + " removed from the list");
                        break;
                    case 3:
                        System.out.print("Enter element to find: ");
                        element = scanner.nextInt();
                        int index = integerList.indexOf(Integer.valueOf(element));
                        System.out.println("Element " + element + " found at index " + index);
                        break;
                    case 4:
                        if(!integerList.isEmpty())
                            System.out.println("Elements in the list: " + Arrays.toString(integerList.toArray()));
                        else
                            System.out.println("List is empty");
                        break;
                    case 5:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between  1 and  5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }
    }
}
