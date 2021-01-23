import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> crap = new LinkedHashMap<>();
        
        String resource;
        while (!(resource = scan.nextLine()).equals("stop")){
            int quantity = Integer.parseInt(scan.nextLine());
            
            if(crap.containsKey(resource)){
                int current = crap.get(resource);
                crap.put(resource, current + quantity);
            }else {
                crap.put(resource, quantity);
            }
        }
        for (Map.Entry<String, Integer> entry : crap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }
}

