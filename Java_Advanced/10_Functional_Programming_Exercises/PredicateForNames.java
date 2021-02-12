import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxLength = Integer.parseInt(scan.nextLine());

        Predicate<String> complyingName = name -> name.length() <= maxLength;

        String[] names = scan.nextLine().split(" ");

        for (String name : names) {
            if(complyingName.test(name)){
                System.out.println(name);
            }
        }
    }
}
