import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= input; i++) {
            int i2 = i;

            int sum = 0;
            while (i2 > 0){
                int last = i2 % 10;
                sum += last;
                i2 /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True\n", i);
            }else {
                System.out.printf("%d -> False\n", i);
            }
        }
    }
}

