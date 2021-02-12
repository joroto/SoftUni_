import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Consumer<String> cons = System.out::println;
        Arrays.stream(scan.nextLine().split(" ")).forEach(cons);
    }
}
