import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        ArrayDeque<String> history = new ArrayDeque<>();

        while (!(input = scan.nextLine()).equals("Home")){
            switch (input){
                case "back":
                    if (history.size() <= 1){
                        System.out.println("no previous URLs");
                    }else {
                        history.pop();
                        System.out.println(history.peek());
                    }
                    break;
                default:
                    history.push(input);
                    System.out.println(input);
                    break;
            }
        }
    }
}
