import java.util.Scanner;

public class TimePlus15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputHours = Integer.parseInt(scan.nextLine());
        int inputMinutes = Integer.parseInt(scan.nextLine());

        int totalInMin = inputHours * 60 + inputMinutes + 15;

        int hours = totalInMin / 60;
        int minutes = totalInMin % 60;

        if (inputMinutes >=60){
            hours++;
        }

        if (hours == 24){
            hours = 0;
        }

        if (minutes <10){
            System.out.printf("%d:0%d", hours, minutes);
        }else{
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}

