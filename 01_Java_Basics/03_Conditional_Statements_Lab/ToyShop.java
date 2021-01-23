import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scan.nextLine());
        int puzzleCount = Integer.parseInt(scan.nextLine());
        int dollCount = Integer.parseInt(scan.nextLine());
        int bearCount = Integer.parseInt(scan.nextLine());
        int minionCount = Integer.parseInt(scan.nextLine());
        int truckCount = Integer.parseInt(scan.nextLine());

        int merchCount = puzzleCount + dollCount + bearCount + minionCount + truckCount;

        double puzzlesPrice = puzzleCount * 2.60;
        double dollsPrice = dollCount * 3;
        double bearsPrice = bearCount * 4.10;
        double minionsPrice = minionCount * 8.20;
        double trucksPrice = truckCount * 2;

        double price = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;

        if (merchCount >= 50){
            price = price - 0.25 * price;
        }

        price = price - 0.10 * price;
        double sum = price - tripPrice;

        if (sum >= 0){
            System.out.printf("Yes! %.2f lv left.", sum);
        }
        else {
            sum = Math.abs(sum);
            System.out.printf("Not enough money! %.2f lv needed.", sum);
        }
    }
}

