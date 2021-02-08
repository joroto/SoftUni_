import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] bounds = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String evenOrOdd = scan.nextLine();

        Predicate<Integer> isEven =
                number -> number % 2 == 0;

        Predicate<Integer> isOdd =
                number -> number % 2 != 0;

        if(evenOrOdd.equals("even")){
            if(isEven.test(bounds[0])){
                for (int i = bounds[0]; i <= bounds[1]; i += 2) {
                    System.out.print(i + " ");
                }
            }else {
                for (int i = bounds[0] + 1; i <= bounds[1] - 1; i += 2) {
                    System.out.print(i + " ");
                }
            }
        }else {
            if(isOdd.test(bounds[0])){
                for (int i = bounds[0]; i <= bounds[1]; i += 2) {
                    System.out.print(i + " ");
                }
            }else {
                for (int i = bounds[0] + 1; i <= bounds[1] - 1; i += 2) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
