import java.util.Scanner;

public class IntegerOps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] intArray = new int [4];

        intArray [0] = scan.nextInt();
        intArray [1] = scan.nextInt();
        intArray [2] = scan.nextInt();
        intArray [3] = scan.nextInt();

        int answer = ((intArray [0] + intArray [1]) / intArray [2]) * intArray [3];

        System.out.println(answer);
    }
}
