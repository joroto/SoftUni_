import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(ReadAndSumArray(scan, ", "));

    }

    private static int ReadAndSumArray(Scanner scan, String splitter) {
        int[] input = Arrays.stream(scan.nextLine().split(splitter)).mapToInt(Integer::parseInt).toArray();

        int rows1 = input[0];
        int cols1 = input[1];
        int [][] matrix1 = new int[rows1][cols1];

        int sum = 0;

        for (int i = 0; i < matrix1.length; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split(splitter)).mapToInt(Integer::parseInt).toArray();

            matrix1[i] = arr;
        }

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                sum += matrix1[row][col];
            }
        }
        System.out.println(rows1);
        System.out.println(cols1);
        return sum;
    }
}
