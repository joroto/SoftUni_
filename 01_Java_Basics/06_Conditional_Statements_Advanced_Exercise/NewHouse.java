import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowerType = scan.nextLine();
        int flowerCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        int rosesPrice = 5;
        double dahliasPrice = 3.80;
        double tulipsPrice = 2.80;
        double narcissusPrice = 3;
        double gladiolusPrice  = 2.50;

        double price = 0;

        switch (flowerType){
            case "Roses":
                price = flowerCount * rosesPrice;
                if (flowerCount > 80){
                    price = price - 0.10 * price;
                }
                break;
            case "Dahlias":
                price = flowerCount * dahliasPrice;
                if (flowerCount > 90){
                    price = price - 0.15 * price;
                }
                break;
            case "Tulips":
                price = flowerCount * tulipsPrice;
                if (flowerCount > 80){
                    price = flowerCount * tulipsPrice;
                }
                break;
            case "Narcissus":
                price = flowerCount * narcissusPrice;
                if (flowerCount < 120){
                    price = price + 0.15 * price;
                }
                break;
            case "Gladiolus":
                price = flowerCount * gladiolusPrice;
                if (flowerCount < 80){
                    price = price + 0.20 * price;
                }
                break;
        }

        if (budget >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, budget - price);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}

