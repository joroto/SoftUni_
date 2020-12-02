import java.util.Scanner;
 
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
 
        for (int firstSymbol = 1; firstSymbol <= n; firstSymbol++) {
            for (int secondSymbol = 1; secondSymbol <= n; secondSymbol++) {
                for (char thirdSymbol = 'a'; thirdSymbol < 'a' + l; thirdSymbol++) {
                    for (char forthSymbol = 'a'; forthSymbol < 'a' + l; forthSymbol++) {
                        for (int fifthSymbol = 1; fifthSymbol <= n; fifthSymbol++) {
                            if (fifthSymbol > firstSymbol && fifthSymbol > secondSymbol) {
                                System.out.printf("%d%d%c%c%d ", firstSymbol, secondSymbol, thirdSymbol, forthSymbol, fifthSymbol);
                            }
                        }
                    }
                }
            }
        }
 
    }
}
