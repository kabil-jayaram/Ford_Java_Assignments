package Streams.Question7;

import java.util.*;

class StringConcatenation {
    public static String concatenateStrings(List<String> strings) {
        Optional<String> optional = strings.stream().reduce((string, string2) -> string.concat(string2));
        if(optional.isPresent())
            return optional.get();
        return "Empty String";
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", " ", "World", "!");
        String concatenatedString = StringConcatenation.concatenateStrings(strings);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
