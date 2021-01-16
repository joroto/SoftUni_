import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map <String, String> database = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");

            switch (input[0]){
                case "register":
                    if (database.containsKey(input[1])){
                        System.out.println("ERROR: already registered with plate number " + database.get(input[1]));
                    }else {
                        database.put(input[1], input[2]);
                        System.out.println(input[1] + " registered " + input[2] + " successfully");
                    }
                    break;
                case "unregister":
                    if (!database.containsKey(input[1])){
                        System.out.println("ERROR: user "+ input[1] + " not found");
                    }else {
                        database.remove(input[1]);
                        System.out.println(input[1] + " unregistered successfully");
                    }
                    break;
            }
        }
        database.entrySet().forEach((e -> System.out.println(e.getKey() + " => " + e.getValue())));
    }
}
