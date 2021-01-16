import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, String[]> pieces = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("\\|");
            String[] hm = new String[]{line[1], line[2]};
            pieces.put(line[0], hm);
        }

        String input;
        while (!(input = scan.nextLine()).equals("Stop")){
            String[] line = input.split("\\|");
            switch (line[0]){
                case "Add":
                    if(!pieces.containsKey(line[1])){
                        String[] hm = new String[]{line[2], line[3]};
                        pieces.put(line[1], hm);
                        System.out.println(line[1] +" by "+ line[2] +" in "+ line[3] +" added to the collection!");
                    }else {
                        System.out.println(line[1] +" is already in the collection!");
                    }
                    break;
                case "Remove":
                    if(pieces.containsKey(line[1])){
                        pieces.remove(line[1]);
                        System.out.println("Successfully removed "+ line[1] +"!");
                    }else {
                        System.out.println("Invalid operation! "+ line[1] +" does not exist in the collection.");
                    }
                    break;
                case "ChangeKey":
                    if(pieces.containsKey(line[1])){
                        String[] hm = pieces.get(line[1]);
                        String[] hm2 = new String[]{hm[0], line[2]};
                        pieces.put(line[1], hm2);
                        System.out.println("Changed the key of "+ line[1] +" to "+ line[2] +"!");
                    }else {
                        System.out.println("Invalid operation! "+ line[1] +" does not exist in the collection.");
                    }
                    break;
            }
        }
        pieces.entrySet().stream().forEach(p ->{
            System.out.printf("%s -> Composer: %s, Key: %s\n", p.getKey(), p.getValue()[0], p.getValue()[1]);
        });
    }
}
