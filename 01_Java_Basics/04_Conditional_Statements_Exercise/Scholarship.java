import java.util.Scanner;
 
public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        double income = Double.parseDouble(scan.nextLine());
        double averageScore = Double.parseDouble(scan.nextLine());
        double minimumWage = Double.parseDouble(scan.nextLine());
 
        double socialScholarship = 0;
        double exellentScholarship =0;
 
        if (income < minimumWage && averageScore > 4.5){
            socialScholarship = 0.35 * minimumWage;
        }
        if (averageScore >= 5.5) {
            exellentScholarship = averageScore * 25;
        }
        if (socialScholarship > exellentScholarship){
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
        }else if (socialScholarship < exellentScholarship){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(exellentScholarship));
        }else{
            System.out.println("You cannot get a scholarship!");
        }
    }
}
