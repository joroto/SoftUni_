import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<word>[A-Za-z]{3,})\\1\\1(?<word2>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);

        int pairs = 0;
        int mirrors = 0;
        StringBuilder crap = new StringBuilder();

        while (matcher.find()) {
            pairs++;
            StringBuilder build = new StringBuilder();
            build.append(matcher.group("word2"));
            if (matcher.group("word").equals(build.reverse().toString())) {
                mirrors++;
                crap.append(matcher.group("word")).append(" <=> ").append(matcher.group("word2")).append(", ");
            }
        }
        if(pairs > 0){
            System.out.println(pairs + " word pairs found!");
        }else {
            System.out.println("No word pairs found!");
        }
        if (mirrors > 0){
            System.out.print("The mirror words are:\n");
            String crapToPrint = crap.substring(0, crap.length() - 2);
            System.out.println(crapToPrint);
        }else {
            System.out.println("No mirror words!");
        }
    }
}
