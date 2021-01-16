import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map <String, List<String>> database = new LinkedHashMap<>();

        String input;

        while (!(input = scan.nextLine()).equals("end")){
            String[] line = input.split(" : ");
            String courseName = line[0];
            String user = line[1];

            if(!database.containsKey(courseName)){
                database.put(courseName, new ArrayList<>());
                database.get(courseName).add(user);
            }else {
                if(!database.get(courseName).contains(user)){
                    database.get(courseName).add(user);
                }
            }
        }

        database.entrySet().stream().sorted((f,s) -> s.getValue().size() - f.getValue().size())
                .forEach(entry -> {
                    System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted(String::compareTo)
                            .forEach(e -> System.out.printf("-- %s\n", e));
                });
    }
}

