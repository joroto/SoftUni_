import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       ArrayDeque<Integer> numbers = new ArrayDeque<>();
       int[] arrNums = Arrays.stream(scan.nextLine()
               .split(" "))
               .mapToInt(Integer::parseInt)
               .toArray();

        for (int i = 0; i < arrNums.length; i++) {
            numbers.push(arrNums[i]);
        }

        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");
        }
    }
}
