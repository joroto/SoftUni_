import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int sum = 0;

        while (input > 0){
            sum += input % 10;
            input = input / 10;
        }
        System.out.print(sum);

    }
}

