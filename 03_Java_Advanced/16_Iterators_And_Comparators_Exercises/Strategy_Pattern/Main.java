package Strategy_Pattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Set<Person> setName = new TreeSet<>(new NameComparator());
        Set<Person> setAge = new TreeSet<>(new AgeComparator());


        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            setName.add(person);
            setAge.add(person);
        }
        setName.forEach(System.out::println);
        setAge.forEach(System.out::println);
    }
}
