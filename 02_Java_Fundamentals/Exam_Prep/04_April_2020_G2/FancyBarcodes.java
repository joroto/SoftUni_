import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String sum = "";
            String input = scan.nextLine();
            Pattern pattern = Pattern.compile("(@[#]+)(?<word>[A-Z][A-Z-a-z-0-9]{4,}[A-Z])\\1");
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                int notADigit = 0;
                String word = matcher.group("word");
                for (int j = 0; j < word.length(); j++) {
                    char k = word.charAt(j);
                    if(Character.isDigit(k)){
                        sum += k;
                    }else {
                        notADigit++;
                    }
                }
                if(notADigit == word.length()){
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: " + sum);
                }
            }else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
