import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("(\\||#)(?<item>[A-Z a-z]+)\\1(?<expDate>\\d{2}/\\d{2}/\\d{2})\\1(?<cal>\\d{1,5})\\1");
        Matcher matcher = pattern.matcher(input);
        Matcher matcher2 = pattern.matcher(input);

        int calories = 0;
        while (matcher.find()){
            calories += Integer.parseInt(matcher.group("cal"));
        }
        System.out.println("You have food to last you for: "+ calories / 2000 +" days!");
        while (matcher2.find()){
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s\n", matcher2.group("item")
                    , matcher2.group("expDate"), matcher2.group("cal"));
        }
    }
}