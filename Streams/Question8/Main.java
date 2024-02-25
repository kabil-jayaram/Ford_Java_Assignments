package Streams.Question8;

import java.util.*;

class MinMaxFinder {
    public static Map<String, Integer> findMinMax(List<Integer> numbers) {
        Map<String, Integer> result = new HashMap<>();
        Optional<Integer> optionalMin = numbers.stream().min((num1, num2) -> num1.compareTo(num2));
        Optional<Integer> optionalMax = numbers.stream().max((num1, num2) -> num1.compareTo(num2));

        if(optionalMin.isPresent())
            result.put("min", optionalMin.get());
        if(optionalMax.isPresent())
            result.put("max", optionalMax.get());

        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 4);
        Map<String, Integer> result = MinMaxFinder.findMinMax(numbers);
        System.out.println("Minimum and Maximum: " + result);
    }
}
