package Speed_Racing;

public class Car {
    private final String model;
    private double fuelAmount;
    private final double fuelEfficiency;
    private int distanceTravelled;

    public Car(String model, double fuelAmount, double fuelEfficiency) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelEfficiency = fuelEfficiency;
        this.distanceTravelled = 0;
    }

    public boolean drive (int distance) {
        double neededFuel = this.fuelEfficiency * distance;
        if (this.fuelAmount >= distance * this.fuelEfficiency) {
            this.fuelAmount -= neededFuel;
            this.distanceTravelled += distance;
            return true;
        }
        return false;
    }

    @Override
    public
    String toString () {
        return String.format ("%s %.2f %d", this.model, this.fuelAmount, this.distanceTravelled);
    }
}
