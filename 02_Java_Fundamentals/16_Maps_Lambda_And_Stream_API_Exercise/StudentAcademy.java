import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if(!students.containsKey(name)){
                students.put(name, new ArrayList<>());
                students.get(name).add(grade);
            }else {
                    students.get(name).add(grade);
            }
        }

        Map<String, Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> k : students.entrySet()){
            double average = k.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (average >= 4.50){
                averageGrade.put(k.getKey(), average);
            }
        }

        averageGrade.entrySet().stream()
                .sorted((g1, g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(grade -> {
                    System.out.printf("%s -> %.2f\n", grade.getKey(), grade.getValue());;
                });
    }

}

