import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberToReach = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < numberToReach){
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}

