import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> isEven =
                number -> number % 2 == 0;

        Predicate<Integer> isOdd =
                number -> number % 2 != 0;

        Comparator<Integer> comp = (num1, num2) -> {
            if(isEven.test(num1) && isOdd.test(num2)){
                return - 1;
            } else if(isOdd.test(num1) && isEven.test(num2)){
                return 1;
            }
            return num1.compareTo(num2);
        };
        list1.stream().sorted(comp).forEach(e -> System.out.print(e + " "));
    }
}
