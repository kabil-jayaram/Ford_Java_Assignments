package Generics.Question3;

import java.util.*;

class MaxFinder {
    public static <T extends Comparable<T>> T findMax(Collection<T> collection) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty");
        }
        return Collections.max(collection);
    }

    public static <T> void displayMax(T max) {
        System.out.println(max);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(3.14, 2.71, 1.618);
        Double maxDouble = MaxFinder.findMax(doubleList);
        MaxFinder.displayMax(maxDouble);
    }
}
