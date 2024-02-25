package Streams.Question2;

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface SquareOperation {
    int square(int number);
}

class MappingOperation {
    public static List<Integer> squareList(List<Integer> numbers, SquareOperation operation) {
        return numbers.stream().map(operation::square).collect(Collectors.toList());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        SquareOperation squareOperation = (number -> number * number);
        List<Integer> squaredNumbers = MappingOperation.squareList(numbers, squareOperation);
        System.out.println(squaredNumbers);
    }
}
