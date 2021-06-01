package Opinion_Poll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            people.add(person);
        }

        people.stream().filter(p -> p.getAge() > 30).sorted(Comparator.comparing(Person::getName))
                .forEach(p -> System.out.printf("%s - %d\n", p.getName(), p.getAge()));
    }
}
