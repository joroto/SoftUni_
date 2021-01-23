import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nightsCount = Integer.parseInt(scan.nextLine());

        double studio = 0;
        double apartment = 0;

        if (month.equals("May") || month.equals("October")){
            studio = 50 * nightsCount;
            apartment = 65 * nightsCount;
            if (nightsCount > 14){
                studio -= 0.3 * studio;
            }else if (nightsCount > 7){
                studio -= 0.05 * studio;
            }
        }else if (month.equals("June") || month.equals("September")){
            studio = 75.20 * nightsCount;
            apartment = 68.70 * nightsCount;
            if (nightsCount > 14) {
                studio -= 0.2 * studio;
            }
        }else if (month.equals("July") || month.equals("August")){
            studio = 76 * nightsCount;
            apartment = 77 * nightsCount;
        }
        if (nightsCount > 14){
            apartment -= 0.1 * apartment;
        }

        System.out.printf("Apartment: %.2f lv.\n", apartment);
        System.out.printf("Studio: %.2f lv.\n", studio);
    }
}

