import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        char a;
        char b;
        char c;

        for (int i = 0; i < input; i++) {
            String line = scan.nextLine();
            String regex = "^([$%])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<num1>\\d+)\\]\\|\\[(?<num2>\\d+)\\]\\|\\[(?<num3>\\d+)\\]\\|$";


            Pattern pattern = Pattern.compile(regex);
            Matcher match = pattern.matcher(line);


            if (match.find()) {
                a = (char) Integer.parseInt(match.group("num1"));
                b = (char) Integer.parseInt(match.group("num2"));
                c = (char) Integer.parseInt(match.group("num3"));
                System.out.printf("%s: %s%s%s\n",match.group("tag"),a,b,c);
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}