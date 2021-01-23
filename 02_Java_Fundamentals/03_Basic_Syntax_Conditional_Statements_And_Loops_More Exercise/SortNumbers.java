import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        Integer[] myNum = {a, b, c,};

        Arrays.sort(myNum, Collections.reverseOrder());

        for (int i = 0; i < myNum.length; i++) {
            System.out.println(myNum[i]);
        }
    }
}
