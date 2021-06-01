import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = readArray(scan);

        int n = Integer.parseInt(scan.nextLine());

        findInMatrix(matrix, n);

    }

    private static void findInMatrix(int[][] matrix, int n) {
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == n){
                    System.out.printf("%s %s\n", row, col);
                    isFound = true;
                }
            }
        }
        if(!isFound){
            System.out.println("not found");
        }
    }


    private static int[][] readArray(Scanner scan) {
        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows1 = input[0];
        int cols1 = input[1];
        int [][] matrix1 = new int[rows1][cols1];

        for (int i = 0; i < matrix1.length; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            matrix1[i] = arr;
        }
        return matrix1;
    }
}
