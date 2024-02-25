package Streams.Question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface FilterCondition {
    boolean test(int number);
}

class FilterOperation {
    public static List<Integer> filterList(List<Integer> numbers, FilterCondition condition) {
        List<Integer> filteredList = new ArrayList<>();
        for(int number : numbers) {
            boolean result = condition.test(number);
            if(result)
                filteredList.add(number);
        }
        return filteredList;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        FilterCondition condition = (number -> number % 2 == 0);
        List<Integer> filteredList = FilterOperation.filterList(numbers, condition);
        System.out.println("Filtered List: " + filteredList);
    }
}
