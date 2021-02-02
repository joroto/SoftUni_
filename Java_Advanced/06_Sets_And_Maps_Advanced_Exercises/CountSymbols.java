import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<Character, Integer> data = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            if(data.containsKey(input.charAt(i))){
                data.put(input.charAt(i), data.get(input.charAt(i)) + 1);
            }else {
                data.put(input.charAt(i), 1);
            }
        }

        data.forEach((key, value) ->
                System.out.printf("%s: %d time/s\n", key, value)
        );
    }
}
