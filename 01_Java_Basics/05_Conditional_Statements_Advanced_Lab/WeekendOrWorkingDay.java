import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String day = scan.nextLine();
        
        if (day.equals("Monday")){
            System.out.println("Working day");
        }else if (day.equals("Tuesday")){
            System.out.println("Working day");
        }else if (day.equals("Wednesday")){
            System.out.println("Working day");
        }else if (day.equals("Thursday")){
            System.out.println("Working day");
        }else if (day.equals("Friday")){
            System.out.println("Working day");
        }else if (day.equals("Saturday")){
            System.out.println("Weekend");
        }else if (day.equals("Sunday")){
            System.out.println("Weekend");
        }else{
            System.out.println("Error");
        }
    }
}

