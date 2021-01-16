import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();

        System.out.printf("%s %s %s", c, b, a);
    }
}

