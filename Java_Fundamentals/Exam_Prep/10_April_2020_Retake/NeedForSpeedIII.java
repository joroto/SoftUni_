import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, int[]> cars = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] line  = scan.nextLine().split("\\|");
            String model = line[0];
            int mileage = Integer.parseInt(line[1]);
            int fuel = Integer.parseInt(line[2]);

            int[] hm = new int[]{mileage, fuel};
            cars.put(model, hm);
        }

        String com;
        while (!(com = scan.nextLine()).equals("Stop")){
            String[] line = com.split(" : ");
            String car = line[1];

            switch (line[0]){
                case "Drive":
                    int distance = Integer.parseInt(line[2]);
                    int fuel = Integer.parseInt(line[3]);

                    if(cars.get(car)[1] - fuel >= 0){
                        cars.get(car)[1] -= fuel;
                        cars.get(car)[0] += distance;
                        System.out.println(car +" driven for "+ distance +" kilometers. "+ fuel +" liters of fuel consumed.");
                    }else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if(cars.get(car)[0] >= 100000){
                        System.out.println("Time to sell the "+ car +"!");
                        cars.remove(car);
                    }
                    break;
                case "Refuel":
                    int fuelR = Integer.parseInt(line[2]);
                    if (cars.get(car)[1] + fuelR > 75){
                        int refueled = 75 - cars.get(car)[1];
                        cars.get(car)[1] = 75;
                        System.out.println(car +" refueled with "+ refueled +" liters");
                    }else {
                        cars.get(car)[1] += fuelR;
                        System.out.println(car +" refueled with "+ fuelR +" liters");
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(line[2]);
                    if(cars.get(car)[0] - kilometers < 10000){
                        cars.get(car)[0] = 10000;
                    }else {
                        cars.get(car)[0] -= kilometers;
                        System.out.println(car +" mileage decreased by "+ kilometers +" kilometers");
                    }
                    break;
            }
        }
        cars.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue()[0], a.getValue()[0]))
                .forEach(c ->{
                    System.out.println(c.getKey() +" -> Mileage: " + c.getValue()[0] + " kms, Fuel in the tank: "
                            + c.getValue()[1] + " lt.");
                });
    }
}
