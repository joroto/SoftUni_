import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> people = new LinkedHashMap<>();

        String input;

        while (!(input = scan.nextLine()).equals("JOKER")){
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String[] cardsInput = tokens[1].split(", ");

            Set<String> cards = new HashSet<>(Arrays.asList(cardsInput));

            if(!people.containsKey(name)){
                people.put(name, HandOfCardsSum(cards));
            }else {
                people.put(name, people.get(name) + HandOfCardsSum(cards));
            }
        }

        people.forEach((k, v) -> System.out.printf("%s: %d\n", k, v));
        // FIXME: 2/1/2021 
    }
    public static int HandOfCardsSum (Set<String> cards){
        int sum = 0;

        for (String card : cards) {
            char first = card.charAt(0);
            char second = card.charAt(1);


            if(Character.isDigit(first)){
                int power = Integer.parseInt(String.valueOf(first));
                switch (second){
                    case 'S':
                        sum += power * 4;
                        break;
                    case 'H':
                        sum += power * 3;
                        break;
                    case 'D':
                        sum += power * 2;
                        break;
                    case 'C':
                        sum += power;
                        break;
                }
            }else {
                int power = 0;
                switch (first){
                    case 'J':
                        power = 11;
                        break;
                    case 'Q':
                        power = 12;
                        break;
                    case 'K':
                        power = 13;
                        break;
                    case 'A':
                        power = 14;
                        break;
                }
                switch (second){
                    case 'S':
                        sum += power * 4;
                        break;
                    case 'H':
                        sum += power * 3;
                        break;
                    case 'D':
                        sum += power * 2;
                        break;
                    case 'C':
                        sum += power;
                        break;
                }
            }
        }
        return sum;
    }
}
