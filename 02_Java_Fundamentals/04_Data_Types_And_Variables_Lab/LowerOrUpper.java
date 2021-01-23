import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();

        boolean hasUppercase = !a.equals(a.toLowerCase());
        boolean hasLowercase = !a.equals(a.toUpperCase());

        if (hasLowercase){
            System.out.print("lower-case");
        }else if (hasUppercase){
            System.out.print("upper-case");
        }
    }
}

