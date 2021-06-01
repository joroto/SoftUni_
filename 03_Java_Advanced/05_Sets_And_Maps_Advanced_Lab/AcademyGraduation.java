import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, double[]> people = new TreeMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String person = scan.nextLine();
            double[] grades = Arrays.stream(scan.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble).toArray();

            people.put(person, grades);
        }

        people.forEach((key, value) -> {
            double sum = 0;
            for (double v : value) {
                sum += v;
            }
            double avgSym = sum / value.length;

            System.out.println(key + " is graduated with " + avgSym);
        });
    }
}
