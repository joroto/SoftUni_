import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Consumer<String> cons = e -> System.out.println("Sir " + e);

        Arrays.stream(scan.nextLine().split(" ")).forEach(cons);
    }
}
