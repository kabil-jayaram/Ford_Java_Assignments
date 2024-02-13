package Code.Question2;

import java.util.Arrays;

class ArraySort {
    String[] names = new String[4];

    public ArraySort(String[] names) {
        this.names = names;
    }

    public String[] Sort() {
        Arrays.sort(names);
        return names;
    }

}
public class Main {
    public static void main(String[] args) {
        String[] names = {"Johith", "Haribala", "Jayanth", "Dhanush", "Jeyavelan", "Jayabharanivelu"};
        ArraySort sort = new ArraySort(names);
        System.out.println("Array before sorting: " + Arrays.toString(names));
        String[] sortedNames = sort.Sort();
        System.out.println("Array after sorting: " + Arrays.toString(names));
    }
}
