import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pagesInBook = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysToRead = Integer.parseInt(scan.nextLine());

        int hoursToRead = pagesInBook / pagesPerHour;
        int sum = hoursToRead / daysToRead;
        System.out.println(sum);

    }
}
