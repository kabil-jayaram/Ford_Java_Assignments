package Code.Question4;

import java.util.*;

class InheritanceA {
    public void findCircleArea(float rad) {
        double circleArea = Math.PI * rad * rad;
        System.out.println("The area of Circle is " + circleArea + " sq cm");
    }
}

class InheritanceB extends InheritanceA {
    public void findRectangleArea(int l, int b) {
        double rectangleArea = l * b;
        System.out.println("The area of Rectangle is " + rectangleArea + " sq cm");
    }
}

class InheritanceC extends InheritanceB {
    public void findTriangleArea(int b, int h) {
        double triangleArea = 0.5 * b * h;
        System.out.println("The area of Triangle is " + triangleArea + " sq cm");
    }
}

public class Main {
    public static void main(String[] args) {
        InheritanceC obj = new InheritanceC();
        obj.findCircleArea((float) 17.53);
        obj.findRectangleArea(12,42);
        obj.findTriangleArea(7,42);
    }
}
