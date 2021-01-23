import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        String [] days = {"Invalid day!", "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"};

        if (input > 0 && input < 8) {
            System.out.println(days[input]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}

