import java.util.*;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> phrases =
                Arrays.asList(
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product.");

        List<String> events =
                Arrays.asList("Now I feel good.",
                        "I have succeeded with this product.",
                        "Makes miracles. I am happy of the results!",
                        "I cannot believe but now I feel awesome.",
                        "Try it yourself, I am very satisfied.",
                        "I feel great!");

        List<String> authors =
                Arrays.asList(
                        "Diana",
                        "Petya",
                        "Stella",
                        "Elena",
                        "Katya",
                        "Iva",
                        "Annie",
                        "Eva");

        List<String> cities =
                Arrays.asList(
                        "Burgas",
                        "Sofia",
                        "Plovdiv",
                        "Varna",
                        "Ruse");

        for (int i = 0; i < n; i++) {
            String output = "";
            Collections.shuffle(phrases);
            Collections.shuffle(events);
            Collections.shuffle(authors);
            Collections.shuffle(cities);

            output = output.concat(phrases.get(0) + " ");
            output = output.concat(events.get(0) + " ");
            output = output.concat(authors.get(0) + " - ");
            output = output.concat(cities.get(0) + " ");

            System.out.println(output);
        }
    }
}

