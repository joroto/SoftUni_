package Shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return (2 * height) + (2 * width);
    }

    @Override
    double calculateArea() {
        return height * width;
    }

    public final double getHeight() {
        return height;
    }

    public final double getWidth() {
        return width;
    }
}
