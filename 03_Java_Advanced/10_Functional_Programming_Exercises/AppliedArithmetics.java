import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Function<int[], int[]> add = arr -> Arrays.stream(arr).map(num -> num += 1).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(num -> num *= 2).toArray();
        Function<int[], int[]> subtract = arr -> Arrays.stream(arr).map(num -> num -= 1).toArray();

        String input;

        while (!(input = scan.nextLine()).equals("end")){
            switch (input){
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
                    break;
            }
        }
    }
}
