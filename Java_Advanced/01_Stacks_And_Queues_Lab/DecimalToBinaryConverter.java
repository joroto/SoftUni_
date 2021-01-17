import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> deq = new ArrayDeque<>();

        int number = Integer.parseInt(scan.nextLine());

        while (number != 0){
            deq.push(number % 2);
            number /= 2;
        }
        while (!deq.isEmpty()){
            System.out.print(deq.pop());
        }
    }
}
