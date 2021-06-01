import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(", ");
            people.put(input[0], Integer.parseInt(input[1]));
        }

        String youngerOrOlder = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String[] out = scan.nextLine().split(" ");

        //I am aware this is not functional at all but I don't wanna deal with it now so it will do

        switch (youngerOrOlder){
            case "older":
                if(out.length > 1){
                    people.entrySet().stream().filter(k -> k.getValue() >= age).forEach(k ->{
                        System.out.printf("%s - %d\n", k.getKey(), k.getValue());
                    });
                }else {
                    switch (out[0]){
                        case "name":
                            people.entrySet().stream().filter(k -> k.getValue() >= age).forEach(k ->{
                                System.out.printf("%s\n", k.getKey());
                            });
                            break;
                        case "age":
                            people.entrySet().stream().filter(k -> k.getValue() >= age).forEach(k ->{
                                System.out.printf("%d\n", k.getValue());
                            });
                            break;
                    }
                }
                break;
            case "younger":
                if(out.length > 1){
                    people.entrySet().stream().filter(k -> k.getValue() <= age).forEach(k ->{
                        System.out.printf("%s - %d\n", k.getKey(), k.getValue());
                    });
                }else {
                    switch (out[0]){
                        case "name":
                            people.entrySet().stream().filter(k -> k.getValue() <= age).forEach(k ->{
                                System.out.printf("%s\n", k.getKey());
                            });
                            break;
                        case "age":
                            people.entrySet().stream().filter(k -> k.getValue() <= age).forEach(k ->{
                                System.out.printf("%d\n", k.getValue());
                            });
                            break;
                    }
                }
                break;
        }
    }
}
