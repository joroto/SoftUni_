import java.util.*;

public class StudentAcademy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

           students.putIfAbsent(name, new ArrayList<>());
           students.get(name).add(grade);
        }

        students.entrySet()
                .stream()
                .sorted((f, s) -> {
                    double firstAvg = f.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average().getAsDouble();

                    double secondAvg = s.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average().getAsDouble();

                    return Double.compare(secondAvg, firstAvg);
                }).forEach(s ->{
                    double average = s.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();
                    if(average >= 4.50){
                        System.out.printf("%s -> %.2f", s.getKey(), average);
                       // System.out.println(s.getKey() + " -> " + average);
                    }
        });
    }
}

