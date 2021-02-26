import java.util.Arrays;
import java.util.Scanner;

public class Recursive_Array_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int index = array.length - 1;

        System.out.println(sumArray(array, index));

    }

    private static int sumArray(int[] array, int index){
        if(index == 0){
            return array[0];
        }
        return sumArray(array, index - 1) + array[index];
    }
}
