import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int goal = 10000;
        int walked = 0;
        int sum = 0;

        while (!input.equals("Going home")){
            int steps = Integer.parseInt(input);
            walked += steps;
            if (walked >= 10000){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", walked - goal);
                break;
            }
            input = scan.nextLine();
        }
         if (walked < 10000) {
             int toHome = Integer.parseInt(scan.nextLine());
             sum = walked + toHome;

             if (sum >= goal) {
                 System.out.println("Goal reached! Good job!");
                 System.out.printf("%d steps over the goal!", sum - goal);
             } else {
                 System.out.printf("%d more steps to reach goal.", goal - sum);
             }
         }
    }
}

