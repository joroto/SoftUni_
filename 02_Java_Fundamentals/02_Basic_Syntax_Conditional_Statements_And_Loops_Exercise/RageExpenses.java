import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostCount = scan.nextInt();
        double headsetPrice = scan.nextDouble();
        double mousePrice = scan.nextDouble();
        double keyboardPrice = scan.nextDouble();
        double displayPrice = scan.nextDouble();

        double expenses = 0;
        int timesKeyboardIsDed = 0;

        for (int i = 1; i <= lostCount; i++) {
            if (i % 2 == 0) {
                expenses += headsetPrice;
            }
            if (i % 3 == 0) {
                expenses += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                expenses += keyboardPrice;
                timesKeyboardIsDed++;
                if(timesKeyboardIsDed % 2 == 0){
                    expenses+=displayPrice;
                }
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}

