import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double depositSum = Double.parseDouble(scan.nextLine());
        int term = Integer.parseInt((scan.nextLine()));
        double annualInterestRate = Double.parseDouble(scan.nextLine());

        double interest = (depositSum * annualInterestRate) / 100;
        double monthInterest = interest / 12;
        double sum = depositSum + (term * monthInterest);
        System.out.println(sum);

    }
}

