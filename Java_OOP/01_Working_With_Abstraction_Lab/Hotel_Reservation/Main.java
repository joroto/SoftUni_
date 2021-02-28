package Hotel_Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(line[0]);
        int numberOfDays = Integer.parseInt(line[1]);
        String season = line[2];
        String discountType = line[3];

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay);
        priceCalculator.CalculatePrice(numberOfDays, season, discountType);
    }
}
