import java.util.Scanner;

public class FactorialDivision {
    public static double Factorial (double a){
        double fact = 1;
        for (int i = 2; i <= a; i++) {
           fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());

        double sum = Factorial(a) / Factorial(b);

        System.out.printf("%.2f", sum);
    }
}

