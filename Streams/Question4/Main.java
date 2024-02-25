package Streams.Question4;

import java.util.*;

@FunctionalInterface
interface SumOperation {
    int sum(int num1, int num2);
}

class ReducingOperation {
    public static int sumList(List<Integer> numbers, SumOperation operation) {
        return numbers.stream().reduce(0, operation::sum);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        SumOperation sumOperation = ((num1, num2) -> num1 + num2);
        int sum = ReducingOperation.sumList(numbers, sumOperation);
        System.out.println("Sum of List: " + sum);
    }
}
