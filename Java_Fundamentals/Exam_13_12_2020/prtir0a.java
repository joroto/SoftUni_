import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemNik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Pattern pattern = Pattern.compile("!([A-Z][a-z]{2,})\\!\\:\\[([a-zA-z]{8,})\\]");

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String command = matcher.group(1);
                String hm = matcher.group(2);
                System.out.print(command +":" + " ");

                for (int j = 0; j < hm.length(); j++) {
                    int result = hm.charAt(j);
                    if(j == hm.length() - 1){
                        System.out.print(result);
                    }else {
                        System.out.print(result + " ");
                    }
                }
                System.out.println();
            }
            else {
                System.out.println("The message is invalid");
            }
        }
    }
}
