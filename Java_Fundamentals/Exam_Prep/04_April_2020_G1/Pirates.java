import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        Map<String, int[]> cities = new TreeMap<>();

        while (!(input=scan.nextLine()).equals("Sail")){
            String[] line = input.split("\\|\\|");
            String town = line[0];
            int population = Integer.parseInt(line[1]);
            int gold = Integer.parseInt(line[2]);

            if(cities.containsKey(town)){
                cities.get(town)[0] += population;
                cities.get(town)[1] += gold;
            }else {
                int[] arr = new int[]{population, gold};
                cities.put(town, arr);
            }
        }

        String imTiredOfThisShit;

        while (!(imTiredOfThisShit = scan.nextLine()).equals("End")){
            String[] line = imTiredOfThisShit.split("=>");
            String town = line[1];

            switch (line[0]){
                case "Plunder":
                    int people = Integer.parseInt(line[2]);
                    int gold = Integer.parseInt(line[3]);

                    cities.get(town)[0] -= people;
                    cities.get(town)[1] -= gold;
                    System.out.println(town +" plundered! "+ gold +" gold stolen, "+ people +" citizens killed.");

                    if (cities.get(town)[0] <= 0 | cities.get(town)[1] <= 0){
                        System.out.println(town +" has been wiped off the map!");
                        cities.remove(town);
                    }
                    break;
                case "Prosper":
                    int goldP = Integer.parseInt(line[2]);
                    if(goldP < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        cities.get(town)[1] += goldP;
                        System.out.println(goldP +" gold added to the city treasury. "+ town +" now has "+ cities.get(town)[1] +" gold."
                        );
                    }
                    break;
            }
        }

        if(cities.size() > 0){
            System.out.println("Ahoy, Captain! There are "+ cities.size() +" wealthy settlements to go to:");
            cities.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue()[1], a.getValue()[1]))
            .forEach(e ->{
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", e.getKey(), e.getValue()[0], e.getValue()[1]);
            });
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
