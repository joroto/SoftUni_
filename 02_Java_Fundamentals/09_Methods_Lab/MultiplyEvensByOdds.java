import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static int GetEvenSum (int input){
        int sum = 0;
        if (input < 0){
            input = Math.abs(input);
        }
        while (input > 0) {
            if (input % 10 % 2 == 0){
                sum += input % 10;
            }
            input = input / 10;
        }
        return sum;
    }

    public static int GetOddSum (int input) {
        int sum = 0;
        if (input < 0){
            input = Math.abs(input);
        }
        while (input > 0) {
            if (!(input % 10 % 2 == 0)){
                sum += input % 10;
            }
            input = input / 10;
        }
        return sum;
    }

    public static int MultipliedEvensByOdds (int input){
        int evenSum = GetEvenSum(input);
        int oddSum = GetOddSum(input);

        return evenSum * oddSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        System.out.print(MultipliedEvensByOdds(input));
    }
}

