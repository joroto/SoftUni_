import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> history2 = new ArrayDeque<>();

        while (!(input = scan.nextLine()).equals("Home")) {
            switch (input) {
                case "back":
                    if (history.size() < 2) {
                        System.out.println("no previous URLs");
                    } else {
                        history2.addFirst(history.pop());
                        System.out.println(history.peek());
                    }
                    break;
                case "forward":
                    if(history2.isEmpty()){
                        System.out.println("no next URLs");
                    }else {
                        System.out.println(history2.peek());
                        history.push(history2.pop());
                    }
                    break;
                default:
                    history.push(input);
                    System.out.println(input);
                    history2.clear();
                    break;
            }
        }
    }
}
