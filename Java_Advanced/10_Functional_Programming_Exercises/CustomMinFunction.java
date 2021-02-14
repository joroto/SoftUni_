import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Function<int[], Integer> func = numbers -> Arrays.stream(numbers).min().getAsInt();

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(func.apply(numbers));
    }
}