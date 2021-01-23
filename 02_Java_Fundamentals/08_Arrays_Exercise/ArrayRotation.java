import java.util.*;
import java.util.stream.Collectors;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<Integer> intList = new ArrayList<Integer>(numbers.length);
        for (int i : numbers)
        {
            intList.add(i);
        }

        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotations; i++) {
            int a = intList.get(0);
            intList.remove(0);
            intList.add(a);
        }

        String result = intList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}

