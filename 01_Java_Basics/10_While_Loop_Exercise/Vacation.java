import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scan.nextLine());
        double availableMoney = Double.parseDouble(scan.nextLine());
        int daysCount = 0;
        int spendCount = 0;

        while (availableMoney < moneyNeeded && spendCount < 5){
            String command = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            daysCount++;
            if (command.equals("save")){
                availableMoney += money;
                spendCount = 0;
            }else if (command.equals("spend")){
                availableMoney -=money;
                spendCount++;
                if (availableMoney < 0){
                    availableMoney = 0;
                }
            }
        }
        if (spendCount == 5){
            System.out.println("You can't save the money.");
            System.out.println(daysCount);
        }
        if (availableMoney >= moneyNeeded){
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}

