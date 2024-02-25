package Generics.Question7;

import java.util.*;

abstract class Shape<T> {
    public abstract double calculateArea();
}

class Circle<T> extends Shape<T> {
    private double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle<T> extends Shape<T> {
    private double width;
    private double height;


    @Override
    public double calculateArea() {
        return width * height;
    }
}

class CovariantStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() -  1);
    }
}

public class Main {
    public static void main(String[] args) {
        CovariantStack<Shape<?>> shapeStack = new CovariantStack<>();
        shapeStack.push(new Circle<>());
        shapeStack.push(new Rectangle<>());
        Shape<?> poppedShape = shapeStack.pop();
        System.out.println("Popped Shape: " + poppedShape);
    }
}
