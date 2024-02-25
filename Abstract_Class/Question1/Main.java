package Abstract_Class.Question1;

abstract class Shape {
    String name;
    String color;
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private int radius;

    public Circle(String name, String color, int radius) {
        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {
    private int side;

    public Square(String name, String color, int side) {
        this.name = name;
        this.color = color;
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }


    double calculatePerimeter() {
        return 4 * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle","Red",7);
        Square square = new Square("Square","Blue",5);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());

        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Perimeter of Square: " + square.calculatePerimeter());
    }
}
