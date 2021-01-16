import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = Integer.parseInt(scan.nextLine());;
        int cooks = Integer.parseInt(scan.nextLine());
        int cakes = Integer.parseInt(scan.nextLine());
        int waffles = Integer.parseInt(scan.nextLine());
        int pancakes = Integer.parseInt(scan.nextLine());

        double cakesPrice = cakes * 45;
        double wafflesPrice = waffles * 5.80;
        double pancakesPrice = pancakes * 3.20;

        double profit = (cakesPrice + wafflesPrice + pancakesPrice) * cooks;
        double profitWholePeriod = profit * days;

        double profitAfterExpenses = profitWholePeriod - 0.125 * profitWholePeriod;
        System.out.printf("%.2f", profitAfterExpenses);
    }
}

