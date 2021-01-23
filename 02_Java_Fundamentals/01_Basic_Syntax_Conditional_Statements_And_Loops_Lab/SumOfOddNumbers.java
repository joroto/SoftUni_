import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int numcount = 0;

        for (int i = 1; numcount < n; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
                sum += i;
                numcount++;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
