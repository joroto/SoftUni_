package Pizza_Calories;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split("\\s+");
        try {
            Pizza pizza = new Pizza(line[1], Integer.parseInt(line[2]));
            String[] line2 = scan.nextLine().split("\\s+");
            pizza.setDough(new Dough(line2[1], line2[2], Integer.parseInt(line2[3])));

            for (int i = 0; i < Integer.parseInt(line[2]); i++) {
                String[] line3 = scan.nextLine().split("\\s+");
                pizza.addTopping(new Topping(line3[1], Double.parseDouble(line3[2])));
            }
            System.out.println(pizza);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
