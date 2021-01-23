import java.util.Scanner;

public class BackIn30Mins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int hoursInMins = hours * 60;
        int allMins = hoursInMins + minutes + 30;

        int hours2 = allMins / 60;
        if (hours2 >= 24){
            hours2 = 0;
        }
        int minutes2 = allMins % 60;

        System.out.printf("%d:%02d" , hours2, minutes2);

    }
}

