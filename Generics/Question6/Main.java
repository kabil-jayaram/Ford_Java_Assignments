package Generics.Question6;

abstract class Shape<T> {
    public abstract double calculateArea();
}

class Circle<T> extends Shape<T> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle<T> extends Shape<T> {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape<Integer> rectangle = new Rectangle<>(3.5, 2.7);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Shape<Double> circle = new Circle<>(12.63);
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
