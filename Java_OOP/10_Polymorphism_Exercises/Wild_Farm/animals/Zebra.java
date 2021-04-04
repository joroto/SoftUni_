package Wild_Farm.animals;

import Wild_Farm.Food;
import Wild_Farm.foods.Vegetable;

public class Zebra extends Mammal{
    public Zebra(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if(!(food instanceof Vegetable)){
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }
}
