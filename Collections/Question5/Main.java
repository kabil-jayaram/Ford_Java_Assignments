package Collections.Question5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in stack: ");
        int size = scanner.nextInt();
        int i;
        System.out.println("Enter the Stack Elements");
        for(i = 0;i < size;i++)
            integerStack.push(scanner.nextInt());
        System.out.println("Original Stack: " + integerStack);
        Stack<Integer> reversedStack = new Stack<>();
        while(!integerStack.isEmpty())
            reversedStack.push(integerStack.pop());
        System.out.println("Reversed Stack: " + reversedStack);
        scanner.close();
    }
}
