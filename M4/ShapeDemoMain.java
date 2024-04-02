
// Main.java
public class ShapeDemoMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(6, 8);

        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of triangle: " + triangle.area());
    }
}
