package Vehicles_Extension;

public class Bus extends Vehicle{
    private static final double AC_ADDITIONAL_CONSUMPTION
            = 1.4;
    private boolean isEmpty = false;

    protected Bus(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public void setConsumption(double fuel){
        if(isEmpty){
            super.setConsumption(fuel);
        }else {
            super.setConsumption(fuel + AC_ADDITIONAL_CONSUMPTION);
        }
    }
}
