package Streams.Question6;

import java.util.*;

@FunctionalInterface
interface SquareOperation {
    int square(int number);
}

class ParallelProcessing {
    public static int sumOfSquares(List<Integer> numbers, SquareOperation operation) {
        return numbers.parallelStream().map(operation::square).reduce(0, ((num1, num2) -> num1 + num2));
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        SquareOperation squareOperation = (number -> number * number);
        int sum = ParallelProcessing.sumOfSquares(numbers, squareOperation);
        System.out.println("Sum of Squares: " + sum);
    }
}
