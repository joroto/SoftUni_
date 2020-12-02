import java.util.Scanner;
 
public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        for (int number = firstNumber; number <= secondNumber; number++) {
            int firstDigit = number / 100000;
            int secondDigit = number / 10000 % 10;
            int thirdDigit = number / 1000 % 10;
            int forthDigit = number / 100 % 10;
            int fifthDigit = number / 10 % 10;
            int sixthDigit = number % 10;
 
            int sumEvenPositions = secondDigit + forthDigit + sixthDigit;
            int sumOddPositions = firstDigit + thirdDigit + fifthDigit;
            if (sumEvenPositions == sumOddPositions) {
                System.out.print(number + " ");
            }
        }
 
 
    }
}
