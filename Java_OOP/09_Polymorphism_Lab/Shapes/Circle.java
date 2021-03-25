package Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public final double getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
