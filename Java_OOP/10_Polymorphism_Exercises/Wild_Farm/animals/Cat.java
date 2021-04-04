package Wild_Farm.animals;

import Wild_Farm.Food;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(super.toString());
        str.insert(str.indexOf(",") + 1," " + this.breed + ",");
        return str.toString();
    }
}