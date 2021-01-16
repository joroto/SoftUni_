import java.util.Scanner;
 
public class Clock {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23 ; hour++) {
            //за всеки един от часовете искаме
            //да вземем всички минути от 0 до 59
            for (int minute = 0; minute <= 59 ; minute++) {
                System.out.printf("%d:%d%n", hour, minute);
            }
        }
 
    }
}
