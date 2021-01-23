import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 =
                Arrays.stream(scan.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .sorted((n1, n2) -> n2.compareTo(n1))
                        .collect(Collectors.toList());

        if (list1.size() < 3){
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i) + " ");
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.print(list1.get(i) + " ");
            }
        }
    }
}

