package Class_Box_Data_Validation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    private void checkValidity(String string, double parameter){
        if(parameter <= 0){
            throw new IllegalArgumentException (string + " cannot be zero or negative.");
        }
    }

    private void setLength(double length) {
        checkValidity("Length", length);
        this.length = length;
    }

    private void setWidth(double width) {
        checkValidity("Width", width);
        this.width = width;
    }

    private void setHeight(double height) {
        checkValidity("Height", height);
        this.height = height;
    }

    public double calculateSurfaceArea(){
        return    2 * (length * width)
                + 2 * (length * height)
                + 2 * (width * height);
    }

    public double calculateLateralSurfaceArea(){
        return  2 * (length * height)
                + 2 * (width * height);
    }
    public double calculateVolume(){
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f\nLateral Surface Area - %.2f\nVolume – %.2f",
                            calculateSurfaceArea(), calculateLateralSurfaceArea(), calculateVolume());
    }
}
