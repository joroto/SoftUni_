import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list1 = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            list1.add(scan.nextLine());
        }
        Collections.sort(list1);

        for (int i = 1; i < list1.size() + 1; i++) {
            System.out.println(i + "." + list1.get(i - 1));
        }
    }
}

