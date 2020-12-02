import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());

        double coffeePrice = 0;
        double waterPrice = 0;
        double beerPrice = 0;
        double sweetsPrice = 0;
        double peanutsPrice = 0;

        switch (city){
            case "Sofia":
                switch (product){
                    case "coffee":
                        coffeePrice = amount * 0.5;
                        System.out.println(coffeePrice);
                        break;
                    case "water":
                        waterPrice = amount * 0.8;
                        System.out.println(waterPrice);
                        break;
                    case "beer":
                        beerPrice = amount * 1.20;
                        System.out.println(beerPrice);
                        break;
                    case "sweets":
                        sweetsPrice = amount * 1.45;
                        System.out.println(sweetsPrice);
                        break;
                    case "peanuts":
                        peanutsPrice = amount * 1.60;
                        System.out.println(peanutsPrice);
                        break;
                }
                break;
            case "Plovdiv":
                switch (product){
                    case "coffee":
                        coffeePrice = amount * 0.4;
                        System.out.println(coffeePrice);
                        break;
                    case "water":
                        waterPrice = amount * 0.7;
                        System.out.println(waterPrice);
                        break;
                    case "beer":
                        beerPrice = amount * 1.15;
                        System.out.println(beerPrice);
                        break;
                    case "sweets":
                        sweetsPrice = amount * 1.30;
                        System.out.println(sweetsPrice);
                        break;
                    case "peanuts":
                        peanutsPrice = amount * 1.50;
                        System.out.println(peanutsPrice);
                        break;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        coffeePrice = amount * 0.45;
                        System.out.println(coffeePrice);
                        break;
                    case "water":
                        waterPrice = amount * 0.7;
                        System.out.println(waterPrice);
                        break;
                    case "beer":
                        beerPrice = amount * 1.10;
                        System.out.println(beerPrice);
                        break;
                    case "sweets":
                        sweetsPrice = amount * 1.35;
                        System.out.println(sweetsPrice);
                        break;
                    case "peanuts":
                        peanutsPrice = amount * 1.55;
                        System.out.println(peanutsPrice);
                        break;
                }
                break;
        }
    }
}

