package Wild_Farm.animals;

import Wild_Farm.Food;
import Wild_Farm.foods.Vegetable;

public class Mouse extends Mammal{
    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if(!(food instanceof Vegetable)){
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        super.eat(food);
    }
}
