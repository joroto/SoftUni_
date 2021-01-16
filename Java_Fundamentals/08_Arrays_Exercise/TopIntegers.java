import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> intList = new ArrayList<Integer>(numbers.length);
        for (int i : numbers)
        {
            intList.add(i);
        }

        for (int i = 0; i < intList.size(); i++) {
            boolean bigger = false;
            for (int j = 1; j < intList.size(); j++) {
                if (intList.get(i) > intList.get(j)) {
                    bigger = true;
                }else {
                    bigger = false;
                }
            }
            if (bigger){
                System.out.print(intList.get(i) + " ");
            }
        }
        System.out.print(intList.get(intList.size() - 1));
    }
}

