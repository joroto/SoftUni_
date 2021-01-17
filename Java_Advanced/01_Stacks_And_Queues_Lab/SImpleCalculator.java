import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SImpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        ArrayDeque<String> numbers = new ArrayDeque<>();

        Collections.addAll(numbers, input);

        while(numbers.size() > 1){
            int first = Integer.parseInt(numbers.pop());
            String command = numbers.pop();
            int second = Integer.parseInt(numbers.pop());

            int sum = command.equals("+")
                    ? first + second
                    : first - second;
            numbers.push(String.valueOf(sum));
        }
        System.out.println(numbers.pop());
    }
}
