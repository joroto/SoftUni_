import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scan.nextLine());
        int sum = 0;

        int[] arr = new int [wagonCount];

        for (int i = 0; i < wagonCount; i++) {
            arr [i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr [i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i] + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}

