package Point_In_Rectangle;

public class Rectangle {
    private Point botLeft;
    private Point topRight;

    public Rectangle(Point botLeft, Point topRight) {
        this.botLeft = botLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point){
       boolean x = botLeft.getX() <= point.getX() && topRight.getX() >= point.getX();
       boolean y = botLeft.getY() <= point.getY() && topRight.getY() >= point.getY();

        return x && y;
    }
}
