import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers  =
                Arrays.stream(scan.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() / 2; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size()- 1 - i);
            System.out.print(sum + " ");
        }
        if (numbers.size() % 2 != 0) {
            System.out.print(numbers.get(numbers.size() / 2));
        }
    }
}
