import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        double price = 0;

        if (budget <= 100){
            String place = "Bulgaria";
            if (season.equals("summer")){
                String type = "Camp";
                price = 0.30 * budget;
                System.out.printf("Somewhere in %s \n", place);
                System.out.printf("%s - %.2f", type, price);
            }else if (season.equals("winter")){
                String type = "Hotel";
                price = 0.70 * budget;
                System.out.printf("Somewhere in %s \n", place);
                System.out.printf("%s - %.2f", type, price);
            }
        }else if (budget <= 1000){
            String place = "Balkans";
            if (season.equals("summer")){
                String type = "Camp";
                price = 0.40 * budget;
                System.out.printf("Somewhere in %s \n", place);
                System.out.printf("%s - %.2f", type, price);
            }else if (season.equals("winter")){
                String type = "Hotel";
                price = 0.80 * budget;
                System.out.printf("Somewhere in %s \n", place);
                System.out.printf("%s - %.2f", type, price);
            }
        }else {
            String place = "Europe";
            String type = "Hotel";
            price = 0.90 * budget;
            System.out.printf("Somewhere in %s \n", place);
            System.out.printf("%s - %.2f", type, price);
        }

    }
}

