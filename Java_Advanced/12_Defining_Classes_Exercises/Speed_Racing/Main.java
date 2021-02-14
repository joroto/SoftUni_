package Speed_Racing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelEfficiency = Double.parseDouble(input[2]);
            Car car = new Car(model, fuelAmount, fuelEfficiency);
            cars.put(model, car);
        }

        String input;

        while (!(input = scan.nextLine()).equals("End")){
            String[] tokens = input.split(" ");
            String carModel = tokens[1];
            int distance = Integer.parseInt(tokens[2]);

            Car carToDrive = cars.get(carModel);
            if(!carToDrive.drive(distance)) {
                System.out.println("Insufficient fuel for the drive");
            }
        }
        cars.values().forEach(System.out::println);
    }
}
