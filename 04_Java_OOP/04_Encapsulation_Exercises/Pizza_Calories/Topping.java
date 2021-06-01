package Pizza_Calories;

import java.util.Arrays;
import java.util.List;

public class Topping {
    private String toppingType;
    private double weight;
    private static final List<String > types = Arrays.asList
            ("Meat", "Veggies", "Cheese", "Sauce");

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType){
        if(!types.contains(toppingType)){
            throw new IllegalArgumentException("Cannot place "+ toppingType +" on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if(weight > 50 || weight < 1){
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        double type = 0;
        switch (this.toppingType){
            case"Meat":
                type = 1.2;
                break;
            case"Veggies":
                type = 0.8;
                break;
            case"Cheese":
                type = 1.1;
                break;
            case"Sauce":
                type = 0.9;
                break;
        }
        return 2 * this.weight * type;
    }
}
