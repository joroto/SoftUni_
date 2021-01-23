import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = readArray(scan);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row == col){
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();

        for (int row = matrix.length - 1; row >= 0; row--) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(row + col == matrix.length - 1){
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }

    }


    private static int[][] readArray(Scanner scan) {
        int n = Integer.parseInt(scan.nextLine());

        int [][] matrix1 = new int[n][n];

        for (int i = 0; i < matrix1.length; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix1[i] = arr;
        }
        return matrix1;
    }
}
