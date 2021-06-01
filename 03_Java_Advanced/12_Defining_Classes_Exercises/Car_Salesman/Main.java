package Car_Salesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Engine> engines = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);
            Engine engine = null;
            if (tokens.length == 2) {
                engine = new Engine(model, power);
            }else if(tokens.length == 3){
                String string = tokens[2];
                if(isNumber(string)){
                    int displacement = Integer.parseInt(tokens[2]);
                    engine = new Engine(model, power, displacement);
                }else {
                    String efficiency = tokens[2];
                    engine = new Engine(model, power, efficiency);
                }
            }else if(tokens.length == 4){
                int displacement = Integer.parseInt(tokens[2]);
                String efficiency = tokens[3];
                engine = new Engine(model, power, displacement, efficiency);
            }
            engines.put(model, engine);
        }

        int m = Integer.parseInt(scan.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            // <Model>
            // <Engine>
            // <Weight>
            // <Color>
            String[] tokens = scan.nextLine().split("\\s+");
            String model = tokens[0];
            Engine engine = engines.get(tokens[1]);
            Car car = null;

            if(tokens.length == 2){
                car = new Car(model, engine);
            }else if(tokens.length == 3){
                String str = tokens[2];
                if(isNumber(str)){
                    int weight = Integer.parseInt(tokens[2]);
                    car = new Car(model, engine, weight);
                }else {
                    String color = tokens[2];
                    car = new Car(model, engine, color);
                }
            }else if(tokens.length == 4){
                int weight = Integer.parseInt(tokens[2]);
                String color = tokens[3];
                car = new Car(model, engine, weight, color);
            }
            cars.add(car);
        }

        cars.forEach(c -> {
            System.out.println(c.getModel() + ":");
            System.out.println(c.getEngine().getModel() + ":");
            System.out.println("Power: " + c.getEngine().getPower());
            if(c.getEngine().getDisplacement() == -1){
                System.out.println("Displacement: n/a");
            }else {
                System.out.println("Displacement: " + c.getEngine().getDisplacement());
            };
            System.out.println("Efficiency: " + c.getEngine().getEfficiency());
            if(c.getWeight() == -1){
                System.out.println("Weight: n/a");
            }else {
                System.out.println("Weight: " + c.getWeight());
            }
            System.out.println("Color: " + c.getColor());
        });
    }


    public static boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
