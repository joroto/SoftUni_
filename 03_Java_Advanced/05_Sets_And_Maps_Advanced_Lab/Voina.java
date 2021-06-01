import java.util.*;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashSet<Integer> player1Cards = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> player2Cards = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int i = 0; i < 50; i++) {
            int firstNumber = player1Cards.iterator().next();
            player1Cards.remove(firstNumber);
            int secondNumber = player2Cards.iterator().next();
            player2Cards.remove(secondNumber);
            if(firstNumber > secondNumber){
                player1Cards.add(firstNumber);
                player1Cards.add(secondNumber);
            }else if (secondNumber > firstNumber){
                player2Cards.add(firstNumber);
                player2Cards.add(secondNumber);
            }
        }
        if(player1Cards.isEmpty()){
            System.out.println("Second player win!");
        }else if(player2Cards.isEmpty()){
            System.out.println("First player win!");
        }else {
            System.out.println("Draw");
        }
    }
}
