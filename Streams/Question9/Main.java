package Streams.Question9;

import java.util.*;
import java.util.stream.Stream;

class CombineStreams {
    public static List<Integer> combineLists(List<Integer> list1, List<Integer> list2) {
        return Stream.concat(list1.stream(), list2.stream()).toList();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> mergedList = CombineStreams.combineLists(list1, list2);
        System.out.println("Merged List: " + mergedList);
    }
}
