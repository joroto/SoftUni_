import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        if (day.equals("Monday") && hour >=10 && hour <=18 ){
            System.out.println("open");
        }else  if (day.equals("Tuesday") && hour >=10 && hour <=18 ){
            System.out.println("open");
        }else  if (day.equals("Wednesday") && hour >=10 && hour <=18 ){
            System.out.println("open");
        }else  if (day.equals("Thursday") && hour >=10 && hour <=18 ){
            System.out.println("open");
        }else  if (day.equals("Friday") && hour >=10 && hour <=18 ){
            System.out.println("open");
        }else  if (day.equals("Saturday") && hour >=10 && hour <=18 ){
            System.out.println("open");
        }else{
            System.out.println("closed");
        }
    }
}

