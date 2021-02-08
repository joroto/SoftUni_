import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> prices = Arrays.stream(scan.nextLine().split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        UnaryOperator<Double> addVat = value -> value * 1.2;

        for (int i = 0; i < prices.size(); i++) {
            prices.set(i, addVat.apply(prices.get(i)));
        }

        System.out.println("Prices with VAT:");
        prices.forEach(e -> System.out.printf("%.2f\n", e));
    }
}
