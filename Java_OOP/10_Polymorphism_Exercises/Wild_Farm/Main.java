package Wild_Farm;

import Wild_Farm.animals.Cat;
import Wild_Farm.animals.Mouse;
import Wild_Farm.animals.Tiger;
import Wild_Farm.animals.Zebra;
import Wild_Farm.foods.Meat;
import Wild_Farm.foods.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String evenLine;
        while (!(evenLine = scan.nextLine()).equals("End")) {
            String oddLine = scan.nextLine();

            Animal animal = createAnimal(evenLine.split("\\s+"));
            Food food = createFood(oddLine.split("\\s+"));

            animal.makeSound();

            try {
                animal.eat(food);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            animals.add(animal);
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static Food createFood(String[] tokens) {
        int quantity = Integer.parseInt(tokens[1]);
        return tokens[0].equals("Meat") ? new Meat(quantity) : new Vegetable(quantity);
    }

    private static Animal createAnimal(String[] tokens) {
        switch (tokens[0]){
            case "Mouse":
                return new Mouse(tokens[1], "Mouse",
                        Double.parseDouble(tokens[2]), tokens[3]);
            case "Zebra":
                return new Zebra(tokens[1], "Zebra",
                        Double.parseDouble(tokens[2]), tokens[3]);
            case "Cat":
                return new Cat(tokens[1], "Cat",
                        Double.parseDouble(tokens[2]), tokens[3], tokens[4]);
            case "Tiger":
                return new Tiger(tokens[1], "Tiger",
                        Double.parseDouble(tokens[2]), tokens[3]);
        }
        return new Mouse("0", "0", 0, "0");
    }
}
