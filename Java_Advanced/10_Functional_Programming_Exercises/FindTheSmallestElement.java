import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Function<List<Integer>, Integer> smallest = arr -> arr.lastIndexOf(arr.stream().min(Integer::compareTo).get());

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(smallest.apply(numbers));
    }
}
