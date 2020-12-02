import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int staff = Integer.parseInt(scan.nextLine());
        double pricePerOutfit = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.10;

         if ( staff > 150){
             pricePerOutfit = pricePerOutfit - 0.10 * pricePerOutfit;
         }

         double price = pricePerOutfit * staff + decor;

         double left = budget - price;

         if (left >= 0){
             System.out.println("Action!");
             System.out.printf("Wingard starts filming with %.2f leva left.", left);
         }else{
             left = Math.abs(left);
             System.out.println("Not enough money!");
             System.out.printf("Wingard needs %.2f leva more.", left);
         }
    }
}

