import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        int places = rows * columns;
        double profit =0;

        switch (projection) {
            case "Premiere":
                profit = places * 12.00;
                break;
            case "Normal":
                profit = places * 7.5;
                break;
            case "Discount":
                profit = places * 5.00;
                break;
        }
        System.out.println(profit);
    }
}

