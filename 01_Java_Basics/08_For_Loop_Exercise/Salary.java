import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for (int i = 1; i<=n; i++){
            String tab = scan.nextLine();
            if (tab.equals("Facebook")){
                salary -= 150;
            }else if (tab.equals("Instagram")){
                salary -= 100;
            }else if (tab.equals("Reddit")){
                salary -= 50;
            }
        }
        if (salary <= 0){
            System.out.println("You have lost your salary.");
        }else{
            System.out.println(salary);
        }
    }
}

