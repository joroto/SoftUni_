import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());
        double lv = usd * 1.79549;
        System.out.println(lv);
    }
}
