public class TestShape {
    public static void main(String[] args) {
        // Membuat objek Circle
        Circle circle = new Circle(5.0, "red", true);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        // Membuat objek Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0, "blue", false);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        // Membuat objek Square
        Square square = new Square(4.0, "yellow", true);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
