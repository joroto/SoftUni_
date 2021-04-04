package Wild_Farm;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;
    private String livingRegion;

    protected Animal(String animalName, String animalType, double animalWeight, String livingRegion) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.livingRegion = livingRegion;
    }

    protected String getAnimalType() {
        return animalType;
    }

    public abstract void makeSound();

    public void eat(Food food){
        this.foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",
        this.animalType, this.animalName,
                format.format(this.animalWeight), this.livingRegion, this.foodEaten);
    }
}
