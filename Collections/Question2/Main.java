package Collections.Question2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in set1 and set2: ");
        int len1 = scanner.nextInt();
        int len2 = scanner.nextInt();
        int i;
        System.out.println("Enter elements in the set1: ");
        for(i = 0;i < len1;i++)
            set1.add(scanner.next());

        System.out.println("Enter elements in the set2: ");
        for(i = 0;i < len2;i++)
            set2.add(scanner.next());

        Set<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        System.out.println("Common Elements: " + commonElements);
        scanner.close();
    }
}
