package Generics.Question4;

import java.util.*;

class ListPrinter {
    public static void printList(List<?> list) {
        for (Object element : list)
            System.out.println(element);
    }

    public static void displayElements(List<?> list) {
        for (int i =  0; i < list.size(); i++) {
            System.out.println("Element " + i + ": " + list.get(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        ListPrinter.printList(integerList);
        ListPrinter.displayElements(integerList);
    }
}
