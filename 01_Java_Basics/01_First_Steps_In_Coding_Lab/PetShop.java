import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());
        double cena = dogs * 2.50 + animals * 4;
        System.out.println(cena + " lv.");
    }

}
