package Raw_Data;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(/*cargoWeight*/ cargoType);

            Tire[] tires = new Tire[4];
            int count = 0;
            for (int j = tokens.length - 1; j > 5; j -= 2) {
                int tireAge = Integer.parseInt(tokens[j]);
                double tirePressure = Double.parseDouble(tokens[j - 1]);
                tires[count] = new Tire(tirePressure, tireAge);
                count++;
            }

            Car car = new Car(model, engine, cargo, tires);
            cars.putIfAbsent(model, car);

        }
        String cargoType = scan.nextLine();
        for (Car car : cars.values()) {
            if (cargoType.equals("flamable")
                    && car.getCargo().getType().equals("flamable")
                    && car.getEngine().getEnginePower() > 250) {
                System.out.println(car);
            } else if (cargoType.equals("fragile")
                    && car.getCargo().getType().equals("fragile")
                    && car.hasSoftTire()) {
                System.out.println(car);
            }
        }
    }
}
