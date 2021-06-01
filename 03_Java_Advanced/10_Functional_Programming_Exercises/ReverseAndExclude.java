import java.util.*;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(numbers);

        int n = Integer.parseInt(scan.nextLine());

        numbers.stream().filter(number -> number % n != 0).forEach(e -> System.out.print(e + " "));
    }
}
