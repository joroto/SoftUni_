import java.util.Scanner;
 
public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countJury = Integer.parseInt(scanner.nextLine());
        double sumGradesAllPresentations = 0;
        int countGrades = 0;
        while (true) {
            String presentation = scanner.nextLine();
            if (presentation.equals("Finish")) {
                break;
            }
            double sumGradesPerPresentation = 0;
            for (int jury = 1; jury <= countJury ; jury++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGradesPerPresentation += grade;
                sumGradesAllPresentations += grade;
                countGrades++;
            }
            double averagePerPresentation = sumGradesPerPresentation / countJury;
            System.out.printf("%s - %.2f.%n",presentation, averagePerPresentation);
        }
 
        double averageForAll = sumGradesAllPresentations / countGrades;
        System.out.printf("Student's final assessment is %.2f.", averageForAll);
 
    }
}
