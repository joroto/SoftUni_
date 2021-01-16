import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                int temp = 0;
                temp = numbers[i] + numbers[j];
                if (temp == magicNum){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
