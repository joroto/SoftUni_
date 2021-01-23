import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        double money = 0;

        while (!(input = scan.nextLine()).equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2){
                money += coins;
            }else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }
        }

        while (!(input = scan.nextLine()).equals("End")) {
            if (input.equals("Nuts") || input.equals("Water") || input.equals("Crisps") || input.equals("Soda") || input.equals("Coke")){
                switch (input){
                    case "Nuts":
                        if (money >= 2) {
                            money -= 2.0;
                            System.out.println("Purchased Nuts");
                        }else {
                            System.out.println("Sorry, not enough money\n");
                        }
                        break;
                    case "Water":
                        if (money >= 0.7) {
                            money -= 0.7;
                            System.out.println("Purchased Water");
                        }else {
                            System.out.println("Sorry, not enough money\n");
                        }
                        break;
                    case "Crisps":
                        if (money >= 1.5) {
                            money -= 1.5;
                            System.out.println("Purchased Crisps");
                        }else {
                            System.out.println("Sorry, not enough money\n");
                        }
                        break;
                    case "Soda":
                        if (money >= 0.8) {
                            money -= 0.8;
                            System.out.println("Purchased Soda");
                        }else {
                            System.out.println("Sorry, not enough money\n");
                        }
                        break;
                    case "Coke":
                        if (money >= 1.0) {
                            money -= 1.0;
                            System.out.println("Purchased Coke");
                        }else {
                            System.out.println("Sorry, not enough money\n");
                        }
                        break;
                }
            }else {
                System.out.print("Invalid product\n");
            }
        }

        System.out.printf("Change: %.2f", money);
    }
}

