import java.util.Scanner;

public class InchesToCm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = a * 2.54;
        System.out.println(b);

    }
}
