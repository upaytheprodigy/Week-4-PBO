public class TestCircle {
    public static void main(String[] args) {
        // Circle default constructor (radius = 1.0, color = "red")
        Circle c1 = new Circle();
        System.out.println("Circle c1: radius=" + c1.getRadius() + ", color=" + c1.getColor() + ", area=" + c1.getArea());

        // Circle dengan radius saja (color default = "red")
        Circle c2 = new Circle(2.5);
        System.out.println("Circle c2: radius=" + c2.getRadius() + ", color=" + c2.getColor() + ", area=" + c2.getArea());

        // Circle dengan radius dan color
        Circle c3 = new Circle(3.0, "blue");
        System.out.println("Circle c3: radius=" + c3.getRadius() + ", color=" + c3.getColor() + ", area=" + c3.getArea());

        // Uji setter dan getter untuk color
        c3.setColor("green");
        System.out.println("Circle c3 setelah diubah warna: radius=" + c3.getRadius() + ", color=" + c3.getColor());

        // Uji toString()
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
