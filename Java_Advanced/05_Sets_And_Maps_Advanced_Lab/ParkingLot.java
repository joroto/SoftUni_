import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> cars = new LinkedHashSet<>();

        String input;

        while (!(input = scan.nextLine()).equals("END")){
            String[] tokens = input.split(", ");

            switch (tokens[0]){
                case "IN":
                    cars.add(tokens[1]);
                    break;
                case "OUT":
                    cars.remove(tokens[1]);
                    break;
            }
        }
        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            cars.forEach(System.out::println);
        }
    }
}
