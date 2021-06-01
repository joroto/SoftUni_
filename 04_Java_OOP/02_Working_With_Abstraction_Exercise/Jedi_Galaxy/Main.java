package Jedi_Galaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long result = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] matrixDim = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[][] matrix = createSquareMatrix(matrixDim[0], matrixDim[1]);

        String input;
        while (!(input = scan.nextLine()).equals("Let the Force be with you")) {
            int[] ivo = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int ivoRow = ivo[0];
            int ivoCol = ivo[1];

            int[] evil = getArray(scan);
            int evilRow = evil[0];
            int evilCol = evil[1];

            runEvil(evilRow, evilCol, matrix);
            runIvo(ivoRow, ivoCol, matrix);
        }
        System.out.println(result);

    }

    private static int[] getArray(Scanner scan) {
        return Arrays.stream(scan.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();
    }

    private static void runIvo(int ivoRow, int ivoCol, int[][] matrix) {
        while(ivoRow >= 0 && ivoCol < matrix[0].length){
            if(isInBounds(ivoRow, ivoCol, matrix)){
                result += matrix[ivoRow][ivoCol];
            }
            ivoRow--;
            ivoCol++;
        }
    }

    private static void runEvil(int evilRow, int evilCol, int[][] matrix) {
        while (evilRow >= 0 && evilCol >= 0){
            if(isInBounds(evilRow, evilCol, matrix)){
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static int[][] createSquareMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int num = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = num;
                num++;
            }
        }
        return matrix;
    }

    private static boolean isInBounds(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
