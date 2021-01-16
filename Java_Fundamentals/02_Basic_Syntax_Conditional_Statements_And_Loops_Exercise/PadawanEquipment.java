import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceOfSabre = Double.parseDouble(scanner.nextLine());
        double priceOFRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;

        double totalPriceOfSabres = Math.ceil(students * 1.1) * priceOfSabre;
        double totalPriceOFRobes = priceOFRobe * students;
        int freeBelts = students/ 6;
        double totalPriceOfBelts = (students - freeBelts) * priceOfBelt;
        
        totalPrice = totalPriceOfSabres + totalPriceOFRobes + totalPriceOfBelts;

        if (totalPrice <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else  {
            System.out.printf("Ivan Cho will need %.2flv more.", totalPrice - money);
        }
    }
}
