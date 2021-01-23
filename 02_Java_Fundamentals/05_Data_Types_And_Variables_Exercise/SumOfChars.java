import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            char ch = scan.next().charAt(0);
            sum += (int) ch;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
