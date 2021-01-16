import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list1 =
                Arrays.stream(scan.nextLine()
                        .split(" "))
                        .collect(Collectors.toList());

        Collections.shuffle(list1);

        for (String s : list1) {
            System.out.println(s);
        }
    }
}
