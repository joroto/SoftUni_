import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            // Left sum------------------
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers [j];
            }
            // Right sum-----------------
            rightSum = 0;
            for (int k = numbers.length -1; k > i; k--) {
                rightSum += numbers [k];
            }
            if (rightSum == leftSum){
                System.out.println(i);
                break;
            }
        }
        if (leftSum != rightSum) {
            System.out.println("no");
        }
    }
}
