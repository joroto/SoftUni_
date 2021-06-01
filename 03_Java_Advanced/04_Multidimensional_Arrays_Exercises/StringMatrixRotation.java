import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        int times = 0;

        String rotationInput = scan.nextLine();
        String regex = "(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rotationInput);
        if (matcher.find()) {
            times = Integer.parseInt(matcher.group()) / 90;
        }

        //adding all fluff to a list
        String fluff;
        int bestLength = 0;
        while (!(fluff = scan.nextLine()).equals("END")){
            if(fluff.length() > bestLength) {
                bestLength = fluff.length();
            }
            input.add(fluff);
        }

        char[][] matrix = new char[input.size()][bestLength];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                try {
                    matrix[row][col] = input.get(row).charAt(col);
                }catch (Exception e){
                    matrix[row][col] = ' ';
                }
            }
        }
        if(times != 0){
            matrix = rotation(matrix, times);
        }
        printMatrix(matrix);
        
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
    private static char[][] rotation (char[][] matrix, int times){
        char[][] rotatedMx = new char[matrix[0].length][];
        for (int col = 0; col < matrix[0].length; col++) {
            char[] temp = new char[matrix.length];
            int n = 0;
            for (int row = matrix.length - 1; row >= 0; row--) {
                temp[n] = matrix[row][col];
                n++;
            }
            rotatedMx[col] = temp;
        }
        times--;
        if(times == 0){
            return rotatedMx;
        }else {
            return rotation(rotatedMx, times);
        }
    }
}
