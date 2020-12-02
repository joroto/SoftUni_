import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int failedThreshold = Integer.parseInt(scan.nextLine());
        int failedCount = 0;
        double averageScore = 0;
        int gradeCount = 0;
        String task = null;

        while (failedCount < failedThreshold){
            String lastTask = task;
            task = scan.nextLine();

            if (task.equals("Enough")){
                System.out.printf("Average score: %.2f\n", averageScore / gradeCount);
                System.out.println("Number of problems: " + gradeCount);
                System.out.println("Last problem: " + lastTask);
                break;
            }

            int grade = Integer.parseInt(scan.nextLine());
            averageScore += grade;
            gradeCount++;

            if (grade <= 4){
                failedCount++;
            }
        }
        if (failedCount == failedThreshold){
            System.out.println("You need a break, "+ failedCount + " poor grades.");
        }
    }
}

