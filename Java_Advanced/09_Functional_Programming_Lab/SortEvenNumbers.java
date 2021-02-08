import java.util.Arrays;
import java.util.Scanner;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine()
                .split(", "))
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .toArray();

        printNumbers(input);
        Arrays.sort(input);
        printNumbers(input);
    }

    private static void printNumbers(int[] numbers) {
        System.out.println(String.join(", ", Arrays.toString(numbers)).replaceAll("\\[|\\]", ""));
    }
}
