package Interfaces.Question2;

abstract class Shape {
    abstract double calculateArea();
    public void displayInfo() {
        if (this instanceof Circle) {
            Circle circle = (Circle) this;
            System.out.println("Details of Circle: ");
            System.out.println("Radius: " + circle.getRadius());
        } else {
            Rectangle rectangle = (Rectangle) this;
            System.out.println("Details of Rectangle: ");
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Breadth: " + rectangle.getBreadth());
        }
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Rectangle extends Shape {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    double calculateArea() {
        return this.length * this.breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.println("Area of Circle with radius " + circle.getRadius() + " is " + circle.calculateArea());
        circle.displayInfo();

        Rectangle rectangle = new Rectangle(7, 14);
        System.out.println("Area of Rectangle with length " + rectangle.getLength() + " and breadth " + rectangle.getBreadth() + " is " + rectangle.calculateArea());
        rectangle.displayInfo();
    }
}
