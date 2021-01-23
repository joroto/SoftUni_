import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int failedCount = 0;
        double mark;
        int grade = -1;
        double sum = 0;
        double avgGrade = 0;
        boolean excluded = false;

        for (int i =1; i <= 12; i++){
            if (failedCount > 1){
                excluded = true;
                System.out.printf("%s has been excluded at %d grade", name, grade);
                break;
            }
            mark = Double.parseDouble(scan.nextLine());
            if(mark < 4.00){
                failedCount++;
            }
            grade++;
            sum += mark;
        }
        if (!excluded) {
            avgGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }
    }
}
