import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] tokens = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = tokens[0];
        int s = tokens[1];
        int x = tokens[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n; i++) {
            stack.add(numbers[i]);
        }

        for (int i = 0; i < s; i++) {
            stack.poll();
        }

        if(stack.contains(x)){
            System.out.println("true");
        }else {
            if(stack.size() > 0) {
                System.out.println(Collections.min(stack));
            }else {
                System.out.println("0");
            }
        }
    }
}