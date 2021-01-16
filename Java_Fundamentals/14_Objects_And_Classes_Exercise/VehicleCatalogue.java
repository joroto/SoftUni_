import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehicleCatalogue {

    public static class Vehicle{
        String typeVehicle;
        String modelVehicle;
        String colorVehicle;
        int horsepowerVehicle;

        public Vehicle(String typeVehicle, String modelVehicle, String colorVehicle, int horsepowerVehicle) {
            this.typeVehicle = typeVehicle;
            this.modelVehicle = modelVehicle;
            this.colorVehicle = colorVehicle;
            this.horsepowerVehicle = horsepowerVehicle;
        }

        public String getTypeVehicle() {
            return typeVehicle;
        }

        public String getModelVehicle() {
            return modelVehicle;
        }

        public String getColorVehicle() {
            return colorVehicle;
        }

        public int getHorsepowerVehicle() {
            return horsepowerVehicle;
        }
        @Override
        public String toString() {
            return String.format("Type: %s\n" +
                            "Model: %s\n" +
                            "Color: %s\n" +
                            "Horsepower: %d", getTypeVehicle().toUpperCase().charAt(0) + this.getTypeVehicle().substring(1),
                    getModelVehicle(), getColorVehicle(), getHorsepowerVehicle());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type;
        List<Vehicle> vehicleList = new ArrayList<>();

        while(!(type = scan.nextLine()).equals("End")){
            String[] line = type.split(" ");

            Vehicle vehicle = new Vehicle(line[0], line[1], line[2], Integer.parseInt(line[3]));
            vehicleList.add(vehicle);
        }

        String command;

        while (!(command = scan.nextLine()).equals("Close the Catalogue")){
            String finalCommand = command;
            vehicleList
                    .stream()
                    .filter(v -> v.getModelVehicle().equals(finalCommand))
                    .forEach(System.out::println);
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", Average(vehicleList.stream()
                .filter(v -> v.getTypeVehicle().equals("car"))
                    .collect(Collectors.toList())));

        System.out.printf("Trucks have average horsepower of: %.2f.\n", Average(vehicleList.stream()
                .filter(v -> v.getTypeVehicle().equals("truck"))
                .collect(Collectors.toList())));
    }

    private static double Average (List<Vehicle> vehicleList){
        if(vehicleList.size() == 0){
            return 0.0;
        }
        double sum = 0;
        for (Vehicle vehicle : vehicleList){
            sum += vehicle.getHorsepowerVehicle();
        }
        return sum / vehicleList.size();
    }
}

