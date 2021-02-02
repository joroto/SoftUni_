import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> resources = new LinkedHashMap<>();

        String name;
        while (!(name= scan.nextLine()).equals("stop")){
            String email = scan.nextLine();

            if(!(email.contains(".com") || email.contains(".us") ||email.contains(".uk"))){
                resources.put(name, email);
            }
        }

        resources.forEach((k, v) -> System.out.printf("%s -> %s\n", k, v));
    }
}
