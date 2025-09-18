public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor dengan default color, radius dan height
    public Cylinder() {
        super(); // panggil constructor Circle()
        height = 1.0;
    }

    // Constructor dengan given height
    public Cylinder(double height) {
        super(); // panggil constructor Circle()
        this.height = height;
    }

    // Constructor dengan given radius dan height
    public Cylinder(double radius, double height) {
        super(radius); // panggil constructor Circle(radius)
        this.height = height;
    }

    // Constructor dengan given radius, height, dan color
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // panggil constructor Circle(radius, color)
        this.height = height;
    }

    // Getter height
    public double getHeight() {
        return height;
    }

    // Override getArea() → hitung luas permukaan tabung
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Perbaiki getVolume() → luas alas (super.getArea) × height
    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
