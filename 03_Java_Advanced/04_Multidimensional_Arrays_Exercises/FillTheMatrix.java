import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        int matrixSize = Integer.parseInt(input[0]);

        if(input[1].equals("A")){
            printMatrix(matrixPatternA(matrixSize));
        }else {
            printMatrix(matrixPatternB(matrixSize));
        }

    }

    private static int[][] matrixPatternA (int n){
        int i = 1;
        int [][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[col][row] = i;
                i++;
            }
        }
        return matrix;
    }

    private static int[][] matrixPatternB (int n){
        int clock = 1;
        int i = 1;
        int [][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            if(clock == 1) {
                for (int col = 0; col < matrix[row].length; col++) {
                    matrix[col][row] = i;
                    i++;
                }
                clock = 0;
            }else {
                for (int col = matrix[row].length - 1; col >= 0; col--) {
                    matrix[col][row] = i;
                    i++;
                }
                clock = 1;
            }
        }
        return matrix;
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
