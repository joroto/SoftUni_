import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String password = scan.nextLine();

        String passwordConfirm = scan.nextLine();
        while (!passwordConfirm.equals(password)){
            passwordConfirm = scan.nextLine();
        }

        System.out.printf("Welcome %s!", name);

    }
}

