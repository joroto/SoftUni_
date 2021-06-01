import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, ArrayList<Double>> database = new TreeMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            database.putIfAbsent(name, new ArrayList<>());
            database.get(name).add(grade);
        }

        database.forEach((key, value) -> {
            double sum = 0;
            for (Double aDouble : value) {
                sum += aDouble;
            }
            double avgSum = sum / value.size();

            System.out.print(key + " -> ");
            value.forEach(e -> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)%n", avgSum);
        });
    }
}
