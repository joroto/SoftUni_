import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        BigInteger factorial = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= input; i++) {
            factorial = factorial.multiply(BigInteger
            .valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(factorial);
    }
}

