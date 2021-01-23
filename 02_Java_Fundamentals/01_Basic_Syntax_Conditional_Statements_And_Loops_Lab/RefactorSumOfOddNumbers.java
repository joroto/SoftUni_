import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int numCount = 0;

       for (int i = 1; numCount < n; i++) {
           if (!(i % 2 == 0)) {
               System.out.println(i);
               sum += i;
               numCount++;
           }
       }
        System.out.printf("Sum: %d", sum);
    }
}
