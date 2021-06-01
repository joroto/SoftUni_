package Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        Map<String, Person> people = new LinkedHashMap<>();

        while (!(input = scan.nextLine()).equals("End")){
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            people.putIfAbsent(name, new Person(name));

            switch (tokens[1]){
                case "company":
                    people.get(name).getCompany().setName(tokens[2]);
                    people.get(name).getCompany().setDepartment(tokens[3]);
                    people.get(name).getCompany().setSalary(Double.parseDouble(tokens[4]));
                    break;
                case "pokemon":
                    people.get(name).getPokemons().add(new Pokemon(tokens[2], tokens[3]));
                    break;
                case "parents":
                    people.get(name).getParents().add(new Parent(tokens[2], tokens[3]));
                    break;
                case "children":
                    people.get(name).getChildren().add(new Child(tokens[2], tokens[3]));
                    break;
                case "car":
                    people.get(name).getCar().setModel(tokens[2]);
                    people.get(name).getCar().setSpeed(Integer.parseInt(tokens[3]));
                    break;
            }
        }

        //printing---

        String requestedName = scan.nextLine();

        String companyName = people.get(requestedName).getCompany().getName();
        String companyDepartment = people.get(requestedName).getCompany().getDepartment();
        double salary = people.get(requestedName).getCompany().getSalary();

        String carModel = people.get(requestedName).getCar().getModel();
        int carSpeed = people.get(requestedName).getCar().getSpeed();

        System.out.println(requestedName);
        System.out.println("Company:");
        if(companyName != null) {
            System.out.printf("%s %s %.2f\n", companyName, companyDepartment, salary);
        }
        System.out.println("Car:");
        if(carModel != null) {
            System.out.printf("%s %s\n", carModel, carSpeed);
        }
        System.out.println("Pokemon:");

        people.get(requestedName).getPokemons().forEach(p -> System.out.println(p.getName() + " " + p.getType()));

        System.out.println("Parents:");

        people.get(requestedName).getParents().forEach(p -> System.out.println(p.getName() + " " + p.getBirthday()));

        System.out.println("Children:");

        people.get(requestedName).getChildren().forEach(c -> System.out.println(c.getName() + " " + c.getBirthday()));
    }
}
