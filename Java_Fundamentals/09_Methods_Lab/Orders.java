import java.util.Scanner;

public class Orders {
    public static double Order (String type, int quantity){
        switch (type){
            case "coffee":
                return quantity * 1.50;
            case "water":
                return quantity * 1.00;
            case "coke":
                return quantity * 1.40;
            case "snacks":
                return quantity * 2.00;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f", Order(type, quantity));
    }
}

