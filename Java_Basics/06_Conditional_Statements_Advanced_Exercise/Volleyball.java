import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String yearType = scan.nextLine();
        int numberOfHolidays = Integer.parseInt(scan.nextLine());
        int weekendsHometown = Integer.parseInt(scan.nextLine());

        double weekendsInSofia = 48 - weekendsHometown;
        weekendsInSofia = weekendsInSofia * 3 / 4;
        double weekendsHoliday = numberOfHolidays * 2.0 / 3;

        double sum = weekendsHometown + weekendsInSofia + weekendsHoliday;

        if (yearType.equals("normal")){
            System.out.printf("%.0f", Math.floor(sum));
        }else {
            sum = sum + 0.15 * sum;
            System.out.printf("%.0f", Math.floor(sum));
        }
    }
}

