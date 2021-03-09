package Shopping_Spree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] people = scan.nextLine().split(";");
        String[] products = scan.nextLine().split(";");
        Map<String,Person> peopleLst = new LinkedHashMap<>();
        Map<String,Product> productLst = new LinkedHashMap<>();

        inputPeople(people, peopleLst);
        inputProducts(productLst, products);

        String input;
        while (!(input = scan.nextLine()).equals("END")){
            String[] tokens = input.split("\\s+");
            if(peopleLst.containsKey(tokens[0])) {
                try {
                    peopleLst.get(tokens[0]).buyProduct(productLst.get(tokens[1]));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        peopleLst.forEach((key, value) -> {
            System.out.println(value);
        });
    }

    private static void inputProducts(Map<String, Product> productLst, String[] products) {
        try {
            for (String product : products) {
                String[] tokens = product.split("=");
                Product product1 = new Product(tokens[0], Double.parseDouble(tokens[1]));
                productLst.putIfAbsent(tokens[0].trim(), product1);
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    private static void inputPeople(String[] people, Map<String, Person> peopleLst) {
        try {
        for (String person : people) {
            String[] tokens = person.split("=");
                Person person1 = new Person(tokens[0], Double.parseDouble(tokens[1]));
                peopleLst.putIfAbsent(tokens[0], person1);
            }
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
