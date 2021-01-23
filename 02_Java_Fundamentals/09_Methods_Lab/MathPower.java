import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static double Powered (double input, int power){
        return Math.pow(input, power);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());

        System.out.print(new DecimalFormat("0.####").format(Powered(input, power)));
    }
}
