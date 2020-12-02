import java.util.Scanner;
 
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
 
        for (int firstDigit = 1; firstDigit <= 9 ; firstDigit++) {
            for (int secondDigit = 1; secondDigit <= 9 ; secondDigit++) {
                for (int thirdDigit = 1; thirdDigit <= 9 ; thirdDigit++) {
                    for (int forthDigit = 1; forthDigit <= 9 ; forthDigit++) {
                        boolean check1 = n % firstDigit == 0;
                        boolean check2 = n % secondDigit == 0;
                        boolean check3 = n % thirdDigit == 0;
                        boolean check4 = n % forthDigit == 0;
 
                        if (check1 && check2 && check3 && check4) {
                            System.out.printf("%d%d%d%d ", firstDigit, secondDigit, thirdDigit, forthDigit);
                        }
                    }
                }
            }
        }
 
    }
}
