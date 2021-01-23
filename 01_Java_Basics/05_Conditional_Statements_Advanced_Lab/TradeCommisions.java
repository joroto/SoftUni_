import java.util.Scanner;

public class TradeCommisions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());

        double commision = 0;

        switch (city){
            case "Sofia":
                if (sales >= 0 && sales <=500){
                    commision = 0.05 * sales;
                }else if (sales > 500 && sales <= 1000){
                    commision = 0.07 * sales;
                }else if (sales > 1000 && sales <= 10000){
                    commision = 0.08 * sales;
                }else if (sales > 10000){
                    commision = 0.12 * sales;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <=500){
                    commision = 0.045 * sales;
                }else if (sales > 500 && sales <= 1000){
                    commision = 0.075 * sales;
                }else if (sales > 1000 && sales <= 10000){
                    commision = 0.10 * sales;
                }else if (sales > 10000){
                    commision = 0.13 * sales;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <=500){
                    commision = 0.055 * sales;
                }else if (sales > 500 && sales <= 1000){
                    commision = 0.08 * sales;
                }else if (sales > 1000 && sales <= 10000){
                    commision = 0.12 * sales;
                }else if (sales > 10000){
                    commision = 0.145 * sales;
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        if (commision > 0){
            System.out.printf("%.2f", commision);
        }
    }
}

