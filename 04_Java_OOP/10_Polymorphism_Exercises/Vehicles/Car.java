package Vehicles;

public class Car extends Vehicle{
    private static final double AC_ADDITIONAL_CONSUMPTION
            = 0.9;

    protected Car(double fuel, double consumption) {
        super(fuel, consumption + AC_ADDITIONAL_CONSUMPTION);
    }
}
