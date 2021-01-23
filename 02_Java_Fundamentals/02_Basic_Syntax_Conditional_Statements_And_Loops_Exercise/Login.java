import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String inputPassword = null;
        String password = new StringBuffer(username).reverse().toString();
        int wrongPassCount = 0;

        while (!(inputPassword = scan.nextLine()).equals(password)){
            wrongPassCount++;
            if (wrongPassCount > 3){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }

        if (inputPassword.equals(password)){
            System.out.printf("User %s logged in.", username);
        }
    }
}

