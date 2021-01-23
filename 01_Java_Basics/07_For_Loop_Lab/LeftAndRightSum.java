import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int numbersCount = 2 * n;
        int leftSideSum = 0;
        int rightSideSum = 0;

        for (int i = 1; i <= numbersCount / 2; i++){
            int leftSide = Integer.parseInt(scan.nextLine());
            leftSideSum += leftSide;
        }
        for (int i = 1; i <= numbersCount / 2; i++){
            int rightSide = Integer.parseInt(scan.nextLine());
            rightSideSum += rightSide;
        }

        if (leftSideSum == rightSideSum){
            System.out.printf("Yes, sum = %d", leftSideSum);
        }else if (leftSideSum > rightSideSum){
            System.out.printf("No, diff = %d", leftSideSum - rightSideSum);
        }else {
            System.out.printf("No, diff = %d", rightSideSum - leftSideSum);
        }
    }
}

