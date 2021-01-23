import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows1 = Integer.parseInt(scan.nextLine());
        int cols1 = Integer.parseInt(scan.nextLine());

        String [][] matrix = new String[rows1][cols1];

        for (int i = 0; i < matrix.length; i++) {
            String[] arr = scan.nextLine().split(" ");

            matrix[i] = arr;
        }

        String [][] matrix2 = new String[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            String[] arr = scan.nextLine().split(" ");

            matrix2[i] = arr;
        }

        printMatrix(findInMatrix(matrix, matrix2, rows1, cols1));

    }

    private static String[][] findInMatrix(String[][] matrix, String[][] matrix2, int rows, int cols) {
        String[][] finalMatrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col].equals(matrix2[row][col])){
                    finalMatrix[row][col] = matrix[row][col];
                }else {
                    finalMatrix[row][col] = "*";
                }
            }
        }
        return finalMatrix;
    }

    private static void printMatrix(String[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
