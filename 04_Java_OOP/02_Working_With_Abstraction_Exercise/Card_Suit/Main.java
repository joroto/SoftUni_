package Card_Suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if(scan.nextLine().equals("Card Suits")) {
            System.out.println("Card Suits:");
            for (Card_Suits card : Card_Suits.values()) {
                System.out.println(card);
            }
        }else if(scan.nextLine().equals("Card Ranks")) {
            System.out.println("Card Ranks:");
            for (CardRank card : CardRank.values()) {
                System.out.println(card);
            }
        }
    }
}
