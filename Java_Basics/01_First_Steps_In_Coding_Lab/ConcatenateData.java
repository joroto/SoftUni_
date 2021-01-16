import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ime = scanner.nextLine();
        String familiq = scanner.nextLine();
        String vyzrast = scanner.nextLine();
        String grad = scanner.nextLine();

        System.out.println("You are " + ime + " " + familiq + ", a " + vyzrast + "-years old person from " + grad + "." );

    }
}
