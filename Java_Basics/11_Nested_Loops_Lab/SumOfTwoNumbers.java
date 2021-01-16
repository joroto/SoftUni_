import java.util.Scanner;
 
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false;
 
        for (int firstNumber = start; firstNumber <= end; firstNumber++) { //първо
            for (int secondNumber = start; secondNumber <= end; secondNumber++) { 
                    count++;
                    if (firstNumber + secondNumber == magicNumber) {
                        isFound = true;
                        System.out.printf("Combination N:%d (%d + %d = %d)", count, firstNumber, secondNumber, magicNumber);
                        break;
                    }
            }
            if (isFound) {
                break;
            }
        }
 
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
 
        }
 
 
    }
}
