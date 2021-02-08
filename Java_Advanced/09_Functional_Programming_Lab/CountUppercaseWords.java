import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        List<String> output = new ArrayList<>();

        Predicate<String> isUppercase =
                string -> Character.isUpperCase(string.charAt(0));


        for (String string : input) {
            if(isUppercase.test(string)){
                output.add(string);
            }
        }
        System.out.println(output.size());
        for (String string : output) {
            System.out.println(string);
        }
    }
}
