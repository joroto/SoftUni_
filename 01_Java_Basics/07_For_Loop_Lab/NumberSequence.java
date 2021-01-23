import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scan.nextLine());
            if (number > min){
                min = number;
            }
            if (number < max){
                max = number;
            }
        }
        System.out.printf("Max number: %d\n", min);
        System.out.printf("Min number: %d", max);
    }
}

