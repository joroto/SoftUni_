import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> database = new HashMap<>();

        String input;
        while (!(input = scan.nextLine()).equals("search")){
            String[] tokens = input.split("-");
            String name = tokens[0];
            String number = tokens[1];

            database.put(name, number);
        }

        while (!(input = scan.nextLine()).equals("stop")){
            if(database.containsKey(input)){
                System.out.println(input + " -> " + database.get(input));
            }else {
                System.out.println("Contact "+ input +" does not exist.");
            }
        }
    }
}
