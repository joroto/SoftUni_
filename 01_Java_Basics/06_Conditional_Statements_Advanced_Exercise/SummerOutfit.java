import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degrees = Integer.parseInt(scan.nextLine());
        String partOfDay = scan.nextLine();

        switch (partOfDay){
            case "Morning":
                if (degrees >= 10 && degrees <=18){
                    String shoes = "Sneakers";
                    String outfit = "Sweatshirt";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }else if  (degrees > 18 && degrees <=24){
                    String shoes = "Moccasins";
                    String outfit = "Shirt";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }else if (degrees >= 25){
                    String shoes = "Sandals";
                    String outfit = "T-shirt";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <=18){
                    String shoes = "Moccasins";
                    String outfit = "Shirt";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }else if  (degrees > 18 && degrees <=24){
                    String shoes = "Sandals";
                    String outfit = "T-Shirt";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }else if (degrees >= 25){
                    String shoes = "Barefoot";
                    String outfit = "Swim Suit";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }
                break;
            case "Evening":
                if (degrees >= 10 && degrees <=18){
                    String shoes = "Moccasins";
                    String outfit = "Shirt";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }else if  (degrees > 18 && degrees <=24){
                    String shoes = "Moccasins";
                    String outfit = "Shirt";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }else if (degrees >= 25){
                    String shoes = "Moccasins";
                    String outfit = "Shirt";
                    System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
                }
                break;
        }
    }
}

