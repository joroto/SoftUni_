package Froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        Lake lake = new Lake(numbers);

        StringBuilder out = new StringBuilder();
        for (Integer integer : lake) {
            out.append(integer).append(", ");
        }
        System.out.println(out.substring(0, out.length() - 2));
    }
}
