import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int n = Integer.parseInt(scan.nextLine());

         int number = 0;
        for (int i = 0; i < n; i++) {
            number++;
            for (int j = 0; j <= i; j++) {
                System.out.print(number +" ");
            }
            System.out.println();
        }
    }
}

