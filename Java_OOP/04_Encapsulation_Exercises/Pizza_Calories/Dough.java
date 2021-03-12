package Pizza_Calories;

import java.util.Arrays;
import java.util.List;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;
    private static List<String > types = Arrays.asList
            ("White", "Wholegrain", "Homemade", "Crispy", "Chewy");

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        this.bakingTechnique = bakingTechnique;
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setFlourType(String flourType) {
        if(!types.contains(flourType)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy")
                && !bakingTechnique.equals("Homemade")) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories(){
        double type = 0;
        double technique = 0;
        switch (this.flourType){
            case "White":
                type = 1.5;
                break;
            case "Wholegrain":
                type = 1.0;
                break;
        }
        switch (this.bakingTechnique){
            case "Crispy":
                technique = 0.9;
                break;
            case "Chewy":
                technique = 1.1;
                break;
            case "Homemade":
                technique = 1.0;
                break;
        }

        return (2 * this.weight) * type * technique;
    }
}
