import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        int firstLength = input[0];
        int secondLength = input[1];

        for (int i = 0; i < firstLength; i++) {
            firstSet.add(Integer.parseInt(scan.nextLine()));
        }
        for (int i = 0; i < secondLength; i++) {
            secondSet.add(Integer.parseInt(scan.nextLine()));
        }

        if(secondSet.size() <= firstSet.size()) {
            for (Integer i : secondSet) {
                if (firstSet.contains(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
