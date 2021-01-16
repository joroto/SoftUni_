import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numberOfDay = Integer.parseInt(scan.nextLine());
        
        if (numberOfDay == 1){
            System.out.println("Monday");
        }else if (numberOfDay == 2){
            System.out.println("Tuesday");
        }else if (numberOfDay == 3){
            System.out.println("Wednesday");
        }else if (numberOfDay == 4){
            System.out.println("Thursday");
        }else if (numberOfDay == 5){
            System.out.println("Friday");
        }else if (numberOfDay == 6){
            System.out.println("Saturday");
        }else if (numberOfDay == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Error");
        }
    }
}

