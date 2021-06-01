import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = fillMatrix(scan);

        int currentRow = 0;
        int currentCol = 0;
        int power = 0;

        String input;
        while (!(input = scan.nextLine()).equals("Nuke it from orbit")) {
            int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            power = arr[2];

            currentRow = arr[0];
            currentCol = arr[1];

            HorizontalLine(matrix, currentRow, currentCol, power);
            for (int row = 0; row < matrix.length; row++) {
                        matrix[row] = Arrays.stream(matrix[row]).filter(e -> e != 0).toArray();
            }
            VerticalLine(matrix, currentRow, currentCol, power);
            for (int row = 0; row < matrix.length; row++) {
                matrix[row] = Arrays.stream(matrix[row]).filter(e -> e != 0).toArray();
            }

        }
        printMatrix(matrix);
    }


    private static int[][] fillMatrix(Scanner scan) {
        int i = 1;
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[arr[0]][arr[1]];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = i;
                i++;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void HorizontalLine(int[][] matrix, int currentRow, int currentCol, int power) {
        for (int col = currentCol + power; col >= currentCol - power; col--) {
            if (isInBoundsCols(currentRow, col, matrix)) {
                matrix[currentRow][col] = 0;
            }
        }
    }

    private static void VerticalLine(int[][] matrix, int currentRow, int currentCol, int power) {
        for (int row = currentRow - power; row <= currentRow + power; row++) {
            if (isInBoundsCols(row, currentCol, matrix) && row != currentRow) {
                matrix[row][currentCol] = 0;
            }
        }
    }

    private static boolean isInBoundsCols(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }


    ////Vertical line
    //        for (int row = rows - power; row <= rows + power; row++) {
    //            if (isInBoundsCols(row, cols, matrix) && row != rows) {
    //                matrix.get(row).remove(cols);
    //            }
    //        }
    //        //Horizontal line
    //        for (int col = cols + power; col >= cols - power; col--) {
    //            if (isInBoundsCols(rows, col, matrix)) {
    //                matrix.get(rows).remove(col);
    //            }
    //        }
    //    }
    //
    //    private static boolean isInBoundsCols(int row, int col, List<List<Integer>> matrix) {
    //        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    //    }
}
