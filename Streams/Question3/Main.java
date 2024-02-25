package Streams.Question3;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface FilterCondition {
    boolean test(int number);
}

@FunctionalInterface
interface SquareOperation {
    int square(int number);
}

class CombinedOperation {
    public static List<Integer> filterAndSquareList(List<Integer> numbers, FilterCondition condition, SquareOperation operation) {
        return numbers.stream().filter(condition::test).map(operation::square).toList();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        FilterCondition condition = (number -> number % 2 == 0);
        SquareOperation squareOperation = (number -> number * number);
        List<Integer> filteredAndSquaredList = CombinedOperation.filterAndSquareList(numbers, condition, squareOperation);
        System.out.println("Filtered adn Squared List: " + filteredAndSquaredList);
    }
}
