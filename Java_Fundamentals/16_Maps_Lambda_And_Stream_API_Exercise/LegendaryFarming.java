import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> coolMap = new TreeMap<>();
        Map<String, Integer> shitMap = new TreeMap<>();

        coolMap.put("fragments", 0);
        coolMap.put("shards", 0);
        coolMap.put("motes", 0);

        boolean isObtained = false;
        while (!isObtained){
            String[] tokens = scan.nextLine().split(" ");

            for (int i = 0; i < tokens.length; i+=2) {
                int quantity = Integer.parseInt(tokens[i]);
                String item = tokens[i + 1].toLowerCase();
                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")) {
                    coolMap.putIfAbsent(item, 0);
                    coolMap.put(item, coolMap.get(item) + quantity);
                    if (coolMap.get(item) >= 250) {
                        coolMap.put(item, coolMap.get(item) - 250);
                        if (item.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (item.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isObtained = true;
                        break;
                    }
                } else {
                    shitMap.putIfAbsent(item, 0);
                    shitMap.put(item, shitMap.get(item) + quantity);
                }
            }
        }
        coolMap.entrySet().stream().sorted((a, b) -> {
            return b.getValue().compareTo(a.getValue());
        }).forEach((e -> System.out.println(e.getKey()+ ": " + e.getValue())));
        shitMap.entrySet().stream().sorted((a, b) -> {
            return a.getKey().compareTo(b.getKey());
        }).forEach((e -> System.out.println(e.getKey()+ ": " + e.getValue())));
    }
}

