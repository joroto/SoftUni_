package Vehicles;

public class Truck extends Vehicle {
    private static final double AC_ADDITIONAL_CONSUMPTION
            = 1.6;

    protected Truck(double fuel, double consumption) {
        super(fuel, consumption + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}





