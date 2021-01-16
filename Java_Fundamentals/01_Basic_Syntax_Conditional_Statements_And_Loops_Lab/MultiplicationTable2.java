import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());
        int input2 = Integer.parseInt(scan.nextLine());

        if (1 <= input && input <= 100) {
            if (input2 <= 10) {
                for (int i = input2; i <= 10; i++) {
                    System.out.printf("%d X %d = %d\n", input, i, input * i);
                }
            }else {
                    System.out.printf("%d X %d = %d", input, input2, input * input2);
            }
        }
    }
}
