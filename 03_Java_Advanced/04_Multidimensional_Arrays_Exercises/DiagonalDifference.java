import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] matrix = readMatrix(scan);

        System.out.println(Math.abs(PrimaryDiagonalSum(matrix) - SecondaryDiagonalSum(matrix)));
    }

    private static int[][] readMatrix(Scanner scan) {
        int n = Integer.parseInt(scan.nextLine());

        int [][] matrix1 = new int[n][n];

        for (int i = 0; i < matrix1.length; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix1[i] = arr;
        }
        return matrix1;
    }

    private static int PrimaryDiagonalSum (int[][] matrix){
        int sum = 0;
        for (int row = 0,  col = 0; row < matrix.length; row++, col++) {
            sum += matrix[row][col];
        }
        return sum;
    }

    private static int SecondaryDiagonalSum (int[][] matrix){
        int sum = 0;
        for (int row = 0, col = matrix[row].length - 1; row < matrix.length; row++, col--) {
            sum += matrix[row][col];
        }
        return sum;
    }
}
