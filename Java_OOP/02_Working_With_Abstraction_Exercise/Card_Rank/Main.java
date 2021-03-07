package Card_Rank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1:1 with last one?

        if (scan.nextLine().equals("Card Ranks")) {
            System.out.println("Card Ranks:");
            for (CardRank card : CardRank.values()) {
                System.out.println(card);
            }
        }
    }
}
