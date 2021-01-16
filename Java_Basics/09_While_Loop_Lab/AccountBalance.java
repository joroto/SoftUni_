import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double money = 0;
        String input = scan.nextLine();
        while (!input.equals("NoMoreMoney")) {
            money = Double.parseDouble(input);
            if (money >= 0) {
                sum += money;
                System.out.printf("Increase: %.2f\n", money);
                input = scan.nextLine();
            }else{
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f\n", sum);
    }
}
