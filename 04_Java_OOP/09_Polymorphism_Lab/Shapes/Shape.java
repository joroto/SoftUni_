package Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected double getPerimeter() {
        return perimeter;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    protected double getArea() {
        return area;
    }

    abstract double calculatePerimeter();
    abstract double calculateArea();
}
