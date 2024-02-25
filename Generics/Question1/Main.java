package Generics.Question1;

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void displayType() {
        if (value == null) {
            System.out.println("Box is empty");
        } else {
            System.out.println("Type of value in the box: " + value.getClass().getSimpleName());
        }
    }

    public boolean isEmpty() {
        return value == null;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        System.out.println("Is the box empty?: " + integerBox.isEmpty());
        integerBox.setValue(42);
        System.out.println("Retrieved: " + integerBox.getValue());
        integerBox.displayType();
        System.out.println("Is the box empty?: " + integerBox.isEmpty());
    }
}
