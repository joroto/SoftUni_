import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map <String, Integer> resources = new LinkedHashMap<>();

        String resource;
        while (!(resource = scan.nextLine()).equals("stop")){
            int quantity = Integer.parseInt(scan.nextLine());
            if(resources.containsKey(resource)){
                resources.put(resource, resources.get(resource) + quantity);
            }else {
                resources.put(resource, quantity);
            }
        }

        resources.forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));
    }
}
