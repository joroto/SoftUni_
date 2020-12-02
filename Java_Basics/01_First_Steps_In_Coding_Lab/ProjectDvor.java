import java.util.Scanner;

public class ProjectDvor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kvadratura = Double.parseDouble(scan.nextLine());
        double cena = kvadratura * 7.61;
        double otstypka = 0.18 * cena;
        double smetka = cena - otstypka;
        System.out.println("The final price is " + smetka +" lv.");
        System.out.println("The discount is " + otstypka +" lv.");
    }
}
