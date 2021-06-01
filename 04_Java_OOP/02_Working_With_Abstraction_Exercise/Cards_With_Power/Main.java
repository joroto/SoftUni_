package Cards_With_Power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rank = scan.nextLine();
        String suit = scan.nextLine();

        System.out.printf("Card name: %s of %s; Card power: %d",
                CardRank.valueOf(rank), Card_Suits.valueOf(suit),
                CardRank.valueOf(rank).getRankPower() + Card_Suits.valueOf(suit).getSuitPower());
    }
}
