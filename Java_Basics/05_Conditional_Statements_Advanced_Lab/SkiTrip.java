import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine()) - 1;
        String typeRoom = scan.nextLine();
        String review = scan.nextLine();

        double roomForOne = 18.00;
        double apartmentRent = 25.00;
        double presidentApartmentRent = 35.00;

        double price = 0;
        switch (typeRoom){
            case "room for one person":
                price = days * roomForOne;
                break;
            case "apartment":
                price = days * apartmentRent;
                if (days < 10){
                    price = price - 0.30 * price;
                }else if (days >= 10 && days <= 15){
                    price = price - 0.35 * price;
                }else {
                    price = price - 0.5 * price;
                }break;
            case "president apartment":
                price = days * presidentApartmentRent;
                if (days < 10){
                    price = price - 0.10 * price;
                }else if (days >= 10 && days <= 15){
                    price = price - 0.15 * price;
                }else {
                    price = price - 0.20 * price;
                }break;
        }
        if (review.equals("positive")){
            price = price + 0.25 * price;
        }else if (review.equals("negative")){
            price = price - 0.10 * price;
        }
        System.out.printf("%.2f", price);
    }
}

