import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (number > max){
                max = number;
            }
        }
        int sumWithoutMax = sum - max;
        if (max == sumWithoutMax){
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        }else {
            int diff = Math.abs(max - sumWithoutMax);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }

    }
}

