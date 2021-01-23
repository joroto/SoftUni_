import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [][] matrix = readArray(scan);
        int[][] bestMatrix = new int[2][2];

        int sum;
        int bestSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if(sum > bestSum){
                    bestSum = sum;
                    bestMatrix[0][0] = matrix[row][col];
                    bestMatrix[0][1] = matrix[row][col + 1];
                    bestMatrix[1][0] = matrix[row + 1][col];
                    bestMatrix[1][1] = matrix[row + 1][col + 1];
                }
            }
        }

        printMatrix(bestMatrix);
        System.out.println(bestSum);

    }

    private static int[][] readArray(Scanner scan) {
        int[] input = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows1 = input[0];
        int cols1 = input[1];
        int [][] matrix1 = new int[rows1][cols1];

        for (int i = 0; i < matrix1.length; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

            matrix1[i] = arr;
        }
        return matrix1;
    }

    private static void printMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
