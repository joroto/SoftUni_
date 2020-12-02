import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rent = Double.parseDouble(scan.nextLine());

        double cake = rent * 0.20;
        double drinks = cake - 0.45 * cake;
        double animator = rent / 3;

        double price = rent + cake + drinks + animator;
        System.out.println(price);


    }


}
