import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursiveFibonacci {
    static Map<Long, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = Integer.parseInt(scan.nextLine());

        System.out.println(getFib(n + 1));
    }

    static long getFib(long n) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = getFib(n - 1) + getFib(n - 2);

        memo.put(n, result);

        return result;
    }
}