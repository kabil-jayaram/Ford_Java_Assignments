package Code.Question3;
class ThreeDimensionShape {
    private double width, height, depth;

    public ThreeDimensionShape() { // No Parameter Constructor
        this.width = this.height = this.depth = 0;
    }

    public ThreeDimensionShape(double length) { // 1 Paramter Constructor
        this.width = this.height = this.depth = length;
    }

    public ThreeDimensionShape(double width, double height, double depth) { // 3 Parameter Constructor
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double calculateVolume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        ThreeDimensionShape Shape1 = new ThreeDimensionShape();
        ThreeDimensionShape Shape2 = new ThreeDimensionShape(8.7);
        ThreeDimensionShape Shape3 = new ThreeDimensionShape(5.1, 12.9, 1.3);

        System.out.println("The Volume of Shape1: " + Shape1.calculateVolume());
        System.out.println("The Volume of Shape2: " + Shape2.calculateVolume());
        System.out.println("The Volume of Shape3: " + Shape3.calculateVolume());
    }
}