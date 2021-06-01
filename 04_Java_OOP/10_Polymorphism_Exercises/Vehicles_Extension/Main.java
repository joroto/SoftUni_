package Vehicles_Extension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens;

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        tokens = scan.nextLine().split("\\s+");
        vehicleMap.put("Car", new Car(Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3])));

        tokens = scan.nextLine().split("\\s+");
        vehicleMap.put("Truck", new Truck(Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3])));

        tokens = scan.nextLine().split("\\s+");
        vehicleMap.put("Bus", new Bus(Double.parseDouble(tokens[1]),
                Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3])));

        int commandsCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < commandsCount; i++) {
            try {
                String command = scan.nextLine();
                String[] params = command.split("\\s+");
                double argument = Double.parseDouble(params[2]);


                if(command.equals("DriveEmpty")){
                    Bus bus = (Bus) vehicleMap.get(params[1]);
                    bus.setEmpty(true);
                    bus.drive(argument);
                }else if (command.contains("Drive")) {
                    System.out.println(vehicleMap.get(params[1]).drive(argument));
                } else {
                    vehicleMap.get(params[1]).refuel(argument);
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }

    }
}
