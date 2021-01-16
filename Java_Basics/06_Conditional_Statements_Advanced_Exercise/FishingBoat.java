import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int men = Integer.parseInt(scan.nextLine());

        double rent = 0;

        switch (season){
            case "Autumn":
                rent = 4200;
                if (men <= 6){
                    rent = rent - 0.10 * rent;
                }else if (men <=11){
                    rent = rent - 0.15 * rent;
                }else {
                    rent = rent - 0.25 * rent;
                }
                break;
            case "Summer":
                rent = 4200;
                if (men <= 6){
                    rent = rent - 0.10 * rent;
                }else if (men <= 11){
                    rent = rent - 0.15 * rent;
                }else {
                    rent = rent - 0.25 * rent;
                }
                if (men % 2 == 0){
                    rent = rent - 0.05 * rent;
                }
                break;
            case "Spring":
                rent = 3000;
                if (men <= 6){
                    rent = rent - 0.10 * rent;
                }else if (men <=11){
                    rent = rent - 0.15 * rent;
                }else {
                    rent = rent - 0.25 * rent;
                }
                if (men % 2 == 0){
                    rent = rent - 0.05 * rent;
                }
                break;
            case "Winter":
                rent = 2600;
                if (men <= 6){
                    rent = rent - 0.10 * rent;
                }else if (men <=11){
                    rent = rent - 0.15 * rent;
                }else {
                    rent = rent - 0.25 * rent;
                }
                if (men % 2 == 0){
                    rent = rent - 0.05 * rent;
                }
                break;
        }

        if(budget >= rent){
            System.out.printf("Yes! You have %.2f leva left.", budget - rent );
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}

