import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> deq = new ArrayDeque<>();

        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '('){
                deq.push(String.valueOf(i));
            }else if(ch == ')'){
                int startIndex = Integer.parseInt(deq.pop());
                String content = input.substring(startIndex, i + 1);
                System.out.println(content);
            }
        }
    }
}
