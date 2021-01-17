import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> deq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] commands = Arrays.stream(scan.nextLine()
                    .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            switch (commands[0]){
                case 1:
                    deq.push(commands[1]);
                    break;
                case 2:
                    deq.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(deq));
                    break;
            }

        }

    }
}
