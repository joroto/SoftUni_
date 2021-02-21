package Generic_Swap_Method_Integers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Integer> list= new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            list.add(number);
        }

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Box box = new Box(list);
        box.swap(numbers[0], numbers[1]);
        System.out.println(box);
    }
}
