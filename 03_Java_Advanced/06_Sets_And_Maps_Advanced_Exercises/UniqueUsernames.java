import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            names.add(scan.nextLine());
        }
        names.forEach(System.out::println);
    }
}
