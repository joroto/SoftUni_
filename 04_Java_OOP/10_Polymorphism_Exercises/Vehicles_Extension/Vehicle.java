package Vehicles_Extension;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuel;
    private double consumption;
    private double tankCapacity;

    protected Vehicle (double fuel, double consumption, double tankCapacity) {
        setFuel(fuel);
        setConsumption(consumption);
        this.tankCapacity = tankCapacity;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setFuel(double fuel) {
        validateFuel(fuel);
        this.fuel = fuel;
    }

    private void validateFuel(double fuel){
        if(fuel <= 0){
            throw new IllegalStateException("Fuel must be a positive number");
        }
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
        validateFuel(liters);
        if(fuel + liters <= tankCapacity) {
            setFuel(fuel + liters);
        }else {
            throw new IllegalStateException("Cannot fit fuel in tank");
        }
    }

    @Override
    public String toString() {
        return String.format(this.getClass().getSimpleName() + ": %.2f", this.fuel);
    }
}
