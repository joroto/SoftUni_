import java.util.Scanner;

public class PasswordValidator {
    public static boolean LongEnough (String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean Digits2 (String password) {
        if (password.matches(".*\\d.*")){
            return true;
        }else {
            return false;
        }
    }
    public static boolean NoSpecial (String password) {
        if (password.matches("[a-zA-Z0-9 ]*")){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if (!(LongEnough(password))){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!(NoSpecial(password))){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!(Digits2(password))){
            System.out.println("Password must have at least 2 digits");
        }

        if (NoSpecial(password) && Digits2(password)
               && LongEnough(password)){
            System.out.println("Password is valid");
        }
    }
}
