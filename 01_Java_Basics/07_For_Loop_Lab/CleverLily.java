import java.util.Scanner;
 
public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int ageLily = Integer.parseInt(scan.nextLine());
        double washerPrice = Double.parseDouble(scan.nextLine());
        int priceToy = Integer.parseInt(scan.nextLine());
        int toys = 0;
        double money = 0;
        double profit = 0;
 
        for (int i = 1; i <= ageLily; i++){
            if (i % 2 != 0){
                toys++;
            }else{
                money += 10;
                profit = profit + money;
            }
        }
        if (ageLily % 2 == 0) {
            profit = profit - (ageLily / 2.0);
        }else {
            ageLily += 1;
            profit = profit - (ageLily / 2.0);
            profit += 1;
        }
        double priceToys = toys * priceToy;
        double saved = priceToys + profit;
 
        if(saved >= washerPrice){
            System.out.printf("Yes! %.2f", saved - washerPrice);
        }else {
            System.out.printf("No! %.2f", washerPrice - saved);
        }
    }
}
