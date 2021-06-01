import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {

    public static boolean isEqual(int[][] matrix1, int[][] matrix2){
        if(matrix1.length != matrix2.length){
            return false;
        }

        for (int row = 0; row < matrix1.length; row++) {
            if (matrix1[row].length != matrix2[row].length){
                return false;
            }
            for (int col = 0; col < matrix1[row].length; col++) {
                if(matrix1[row][col] != matrix2[row][col]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix1 = readArray(scan);

        int[][] matrix2 = readArray(scan);

        if(isEqual(matrix1, matrix2)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
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
