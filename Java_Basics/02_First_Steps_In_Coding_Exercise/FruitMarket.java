import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scan.nextLine());
        double kgBananas = Double.parseDouble(scan.nextLine());
        double kgOranges = Double.parseDouble(scan.nextLine());
        double kgRaspberries = Double.parseDouble(scan.nextLine());
        double kgStrawberries = Double.parseDouble(scan.nextLine());

        double raspberryPrice = strawberryPrice - 0.5 * strawberryPrice;
        double orangesPrice = raspberryPrice - 0.4 * raspberryPrice;
        double bananasPrice = raspberryPrice - 0.8 * raspberryPrice;

        double finalPrice = strawberryPrice * kgStrawberries + bananasPrice * kgBananas + orangesPrice * kgOranges + raspberryPrice * kgRaspberries;

        System.out.printf("%.2f", finalPrice);

    }
}
