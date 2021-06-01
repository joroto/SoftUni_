import java.util.Arrays;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] input = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + Arrays.stream(input).sum());
    }
}
