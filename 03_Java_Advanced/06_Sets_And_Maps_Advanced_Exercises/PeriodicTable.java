import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> compounds = new TreeSet<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");

            compounds.addAll(Arrays.asList(input));
        }

        compounds.forEach(c -> System.out.print(c + " "));
    }
}
