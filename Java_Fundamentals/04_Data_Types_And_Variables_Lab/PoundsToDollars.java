import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int inputPounds = Integer.parseInt(scan.nextLine());
        double dollars = inputPounds * 1.31;

        System.out.printf("%.3f", dollars);
    }
}

