import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleCount = scan.nextInt();
        String peopleType = scan.next();
        String dayType = scan.next();
        double price = 0;
        double priceAll = 0;

        switch (peopleType) {
            case "Students":
                switch (dayType) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                priceAll = peopleCount * price;
                if (peopleCount >= 30){
                    priceAll = priceAll - 0.15 * priceAll;
                }
                break;
            case "Business":
                switch (dayType) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                priceAll = peopleCount * price;
                if (peopleCount >= 100){
                    priceAll = priceAll - 10 * price;
                }
                break;
            case "Regular":
                switch (dayType) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                priceAll = peopleCount * price;

                if (peopleCount >= 10 && peopleCount <= 20){
                    priceAll = priceAll - 0.05 * priceAll;
                }
                break;
        }

        System.out.printf("Total price: %.2f", priceAll);

    }
}

