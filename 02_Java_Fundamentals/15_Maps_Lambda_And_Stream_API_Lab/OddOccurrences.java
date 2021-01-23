import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        Map <String, Integer> numberOccurrences = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String currentString = input[i].toLowerCase();

            Integer occurrences = numberOccurrences.get(currentString);
            if (occurrences == null){
                occurrences = 0;
            }
            numberOccurrences.put(currentString, occurrences + 1);
        }

        ArrayList<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : numberOccurrences.entrySet()) {
            if (!(entry.getValue() % 2 == 0)){
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1){
                System.out.print(", ");
            }
        }
    }
}

