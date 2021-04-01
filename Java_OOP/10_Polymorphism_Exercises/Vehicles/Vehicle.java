package Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuel;
    private double consumption;

    protected Vehicle (double fuel, double consumption) {
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public String drive(double distance) {
        double fuelNeeded = distance * this.consumption;
        if(fuelNeeded > this.fuel){
            return this.getClass().getSimpleName() + " needs refueling";
        }
        DecimalFormat formatter =
                new DecimalFormat("##.##");

        this.fuel -= fuelNeeded;
        return String.format
                (this.getClass().getSimpleName() + " travelled %s km", formatter.format(distance));
    }

    public void refuel(double liters) {
        this.fuel += liters;
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + ": %.2f", this.fuel);
    }
}
