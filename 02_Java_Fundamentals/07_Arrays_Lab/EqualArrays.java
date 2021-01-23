import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        boolean identical = false;

        int [] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int [] numbers2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] != numbers2 [i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
               identical = false;
               break;
            }else{
                identical = true;
            }
        }

        if (identical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}

