import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                int even = Integer.parseInt(scan.nextLine());
                evenSum += even;
            }else {
                int odd = Integer.parseInt(scan.nextLine());
                oddSum += odd;
            }
        }

        if (evenSum == oddSum){
            System.out.print("Yes\n");
            System.out.printf("Sum = %d", evenSum);
        }else if (evenSum > oddSum){
            System.out.printf("No\n");
            System.out.printf("Diff = %d", evenSum - oddSum);
        }else {
            System.out.printf("No\n");
            System.out.printf("Diff = %d",oddSum - evenSum);
        }

    }
}

