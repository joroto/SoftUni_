import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        ArrayDeque<String> kid = new ArrayDeque<>();

        for (String s : input) {
            kid.offer(s);
        }

        while (kid.size() > 1) {
            for (int i = 1; i < n; i++) {
                kid.offer(kid.poll());
            }
            if (checkPrime(cycle)) {
                System.out.println("Prime " + kid.peek());
            } else {
                System.out.println("Removed " + kid.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + kid.poll());
    }

    public static boolean checkPrime(int i) {
        int factors = 0;
        int j = 1;

        while (j <= i) {
            if (i % j == 0) {
                factors++;
            }
            j++;
        }
        return (factors == 2);
    }
}