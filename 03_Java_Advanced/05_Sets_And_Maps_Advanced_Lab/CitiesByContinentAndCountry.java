import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            continents.putIfAbsent(continent, new LinkedHashMap<>());
            continents.get(continent).putIfAbsent(country, new ArrayList<>());
            continents.get(continent).get(country).add(city);

        }

        continents.forEach((ky, vy) ->{
            System.out.println(ky + ":");
            vy.forEach((k, v) -> {
                System.out.printf("  %s -> %s\n", k, String.join(", ", v));
            });
        });
    }
}
