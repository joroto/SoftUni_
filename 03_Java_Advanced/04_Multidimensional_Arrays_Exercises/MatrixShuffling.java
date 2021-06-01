import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] matrix = readMatrix(scan);
        String input;

        while (!(input = scan.nextLine()).equals("END")){
            String[] command = input.split(" ");

            if(command.length != 5 || !command[0].equals("swap")) {
                System.out.println("Invalid input!");
                continue;
            }

            int firstRow = Integer.parseInt(command[1]);
            int firstCol = Integer.parseInt(command[2]);
            int secondRow = Integer.parseInt(command[3]);
            int secondCol = Integer.parseInt(command[4]);

            if (firstRow >= matrix.length || firstCol >= matrix[0].length
                    || secondRow >= matrix.length || secondCol >= matrix[0].length){
                System.out.println("Invalid input!");
                continue;
            }

            String temp;

            temp = matrix[firstRow][firstCol];
            matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
            matrix[secondRow][secondCol] = temp;

            printMatrix(matrix);
        }
    }

    private static String[][] readMatrix(Scanner scan) {
        String[] input = scan.nextLine().split(" ");

        int rows1 = Integer.parseInt(input[0]);
        int cols1 = Integer.parseInt(input[1]);
        String[][] matrix1 = new String[rows1][cols1];

        for (int i = 0; i < matrix1.length; i++) {
            String[] arr = scan.nextLine().split(" ");

            matrix1[i] = arr;
        }
        return matrix1;
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
