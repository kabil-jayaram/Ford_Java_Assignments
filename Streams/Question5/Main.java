package Streams.Question5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class CategorizingStrings {
    public static Map<Boolean, List<String>> categorizeStrings(List<String> strings) {
        Function<String, Boolean> groupByVowels = (string -> "aeiouAEIOU".contains(string.substring(0, 1)));
        return strings.stream().collect(Collectors.groupingBy(groupByVowels));
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "pear", "grape");
        Map<Boolean, List<String>> resultMap = CategorizingStrings.categorizeStrings(strings);
        System.out.println("Categorized Strings: " + resultMap);
    }
}
