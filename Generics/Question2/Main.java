package Generics.Question2;

class ArrayUtil {
    public static <T> void swapElements(T[] array, int index1, int index2) {
        T temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> void displayArray(T[] array) {
        for(T element : array)
            System.out.println(element);
    }
}

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "orange", "banana"};
        ArrayUtil.swapElements(stringArray, 0, 2);
        ArrayUtil.displayArray(stringArray);
    }
}
