import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int timeFirst = Integer.parseInt(scan.nextLine());
        int timeSecond = Integer.parseInt(scan.nextLine());
        int timeThird = Integer.parseInt(scan.nextLine());

        int sum = timeFirst + timeSecond + timeThird;

        int minutes = sum / 60;
        int seconds = sum % 60;

        if (seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        }else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}

