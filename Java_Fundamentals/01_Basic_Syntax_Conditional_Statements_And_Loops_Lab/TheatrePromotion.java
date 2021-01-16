import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dayType = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price;

        switch (dayType){
            case "Weekday":
                if (0 <= age && age <= 18){
                    price = 12;
                    System.out.printf("%d$", price);
                }else if (18 < age && age <= 64){
                    price = 18;
                    System.out.printf("%d$", price);
                }else if (64 <= age && age <= 122){
                    price = 12;
                    System.out.printf("%d$", price);
                }else {
                    System.out.print("Error!");
                }
                break;
            case "Weekend":
                if (0 <= age && age <= 18){
                    price = 15;
                    System.out.printf("%d$", price);
                }else if (18 < age && age <= 64){
                    price = 20;
                    System.out.printf("%d$", price);
                }else if (64 <= age && age <= 122){
                    price = 15;
                    System.out.printf("%d$", price);
                }else {
                    System.out.print("Error!");
                }
                break;
            case "Holiday":
                if (0 <= age && age <= 18){
                    price = 5;
                    System.out.printf("%d$", price);
                }else if (18 < age && age <= 64){
                    price = 12;
                    System.out.printf("%d$", price);
                }else if (64 <= age && age <= 122){
                    price = 10;
                    System.out.printf("%d$", price);
                }else {
                    System.out.print("Error!");
                }
                break;
        }
    }
}

