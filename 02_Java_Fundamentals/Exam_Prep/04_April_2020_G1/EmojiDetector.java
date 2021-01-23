import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //emojis are you serious
        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("(?<crap>::|\\*\\*)(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        Pattern pattern2 = Pattern.compile("(?<number>\\d)");
        Matcher matcher2 = pattern2.matcher(input);
        Map<String, Integer> emojis = new LinkedHashMap<>();

        int coolThreshold = 1;

        while (matcher2.find()){
            coolThreshold *= Integer.parseInt(matcher2.group("number"));
        }

        while (matcher.find()){
            String emoji = matcher.group("emoji");
            int coolness = 0;

            for (int i = 0; i < emoji.length(); i++) {
                char a = emoji.charAt(i);
                coolness += a;
            }
            emojis.put(matcher.group("crap") + emoji + matcher.group("crap"), coolness);
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(emojis.size() +" emojis found in the text. The cool ones are:");

        int finalCoolThreshold = coolThreshold;
        emojis.entrySet().stream().forEach(e ->{
            if(e.getValue() > finalCoolThreshold){
                System.out.println(e.getKey());
            }
        });
    }
}
