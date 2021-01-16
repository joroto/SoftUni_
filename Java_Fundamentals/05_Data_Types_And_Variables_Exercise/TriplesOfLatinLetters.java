import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n += 97;

        for (int i = 97; i < n; i++) {
            for (int j = 97; j < n; j++) {
                for (int k = 97; k < n; k++) {
                    System.out.printf("%c%c%c\n",((char) i), ((char) j), ((char) k));
                }
            }
        }
    }
}
