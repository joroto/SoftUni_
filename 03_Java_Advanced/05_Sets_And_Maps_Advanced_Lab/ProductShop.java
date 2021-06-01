import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        String input;

        while (!(input = scan.nextLine()).equals("Revision")){
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);
        }

        shops.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + "->");
            e.getValue().forEach((k, v) -> System.out.printf("Product: %s, Price: %.1f\n", k, v));
        });
    }
}
