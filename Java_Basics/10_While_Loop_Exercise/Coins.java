import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        double moneyInSt = Math.round(money * 100);
        int coinsCount = 0;

        while (moneyInSt > 0){
            if (moneyInSt >= 200){
                moneyInSt -= 200;
                coinsCount++;
            }else if (moneyInSt >= 100){
                moneyInSt -= 100;
                coinsCount++;
            }else if (moneyInSt >= 50){
                moneyInSt -= 50;
                coinsCount++;
            }else if (moneyInSt >= 20){
                moneyInSt -= 20;
                coinsCount++;
            }else if (moneyInSt >= 10){
                moneyInSt -= 10;
                coinsCount++;
            }else if (moneyInSt >= 5){
                moneyInSt -= 5;
                coinsCount++;
            }else if (moneyInSt >= 2){
                moneyInSt -= 2;
                coinsCount++;
            }else if (moneyInSt >= 1){
                moneyInSt -= 1;
                coinsCount++;
            }
        }
        System.out.println(coinsCount);
    }
}

