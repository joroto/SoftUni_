import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        Map<String, Double> products = new LinkedHashMap<>();
        Map <String, Integer> productsQuantity = new LinkedHashMap<>();

        while (!(input = scan.nextLine()).equals("buy")){
            String [] line = input.split(" ");
            String productId = line[0];
            double price = Double.parseDouble(line[1]);
            int quantity = Integer.parseInt(line[2]);

            if (!products.containsKey(productId)){
                products.put(productId, quantity * price);
                productsQuantity.put(productId, quantity);
            }else{
                productsQuantity.put(productId, productsQuantity.get(productId) + quantity);
                products.put(productId, productsQuantity.get(productId) * price);
            }
        }
        products.forEach((k, v) -> System.out.printf("%s -> %.2f\n", k, v));
    }
}

