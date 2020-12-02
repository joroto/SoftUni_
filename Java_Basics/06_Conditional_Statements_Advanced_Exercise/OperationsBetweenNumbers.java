import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        char operator = scan.nextLine().charAt(0);

        double result = 0;
        String type;

        if (n2 != 0) {
            switch (operator) {
                case '+':
                    result = n1 + n2;
                    if (result % 2 == 0) {
                        type = "even";
                    } else {
                        type = "odd";
                    }
                    System.out.printf("%d + %d = %.0f - %s", n1, n2, result, type);
                    break;
                case '-':
                    result = n1 - n2;
                    if (result % 2 == 0) {
                        type = "even";
                    } else {
                        type = "odd";
                    }
                    System.out.printf("%d - %d = %.0f - %s", n1, n2, result, type);
                    break;
                case '*':
                    result = n1 * n2;
                    if (result % 2 == 0) {
                        type = "even";
                    } else {
                        type = "odd";
                    }
                    System.out.printf("%d * %d = %.0f - %s", n1, n2, result, type);
                    break;
                case '/':
                    result = n1 * 1.0 / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, result);
                    break;
                case '%':
                    result = n1 % n2;
                    System.out.printf("%d %% %d = %.0f", n1, n2, result);
                    break;
            }
        }else {
            System.out.printf("Cannot divide %d by zero", n1);
        }
    }
}
