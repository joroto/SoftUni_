package Stack_Iterator;

import java.util.Arrays;
import java.util.Scanner;

public
class Main {
    public static
    void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        CoolStack stack = new CoolStack();
        String command = scan.nextLine ();

        while (!command.equals ("END")){
            String[] tokens = command.split ("\\s+",2);

            switch (tokens[0]){
                case "Push":
                    int[] numbers = Arrays.stream (tokens[1].trim ().split (", ")).mapToInt (Integer::parseInt).toArray ();
                    for (int number : numbers) {
                        stack.push(number);
                    }
                    break;
                case "Pop":
                    stack.pop ();
            }

            command = scan.nextLine ();
        }
        stack.iterator().forEachRemaining (System.out::println);
        stack.iterator().forEachRemaining (System.out::println);
    }
}