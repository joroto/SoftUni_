package Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza{
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public void setName(String name) {
        if(name == null || name.length() > 15 || name.trim().isEmpty()){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setToppings(int top) {
        if(top < 0 || top > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(top);
    }

    public Pizza(String name, int toppingsC) {
        setName(name);
        this.setToppings(toppingsC);
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        double calories = this.dough.calculateCalories();

        for (Topping topping : toppings) {
            calories += topping.calculateCalories();
        }
        return calories;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", this.name, getOverallCalories());
    }
}
