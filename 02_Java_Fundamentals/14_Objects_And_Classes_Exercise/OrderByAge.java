import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static class Person{
        String name;
        String id;
        int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
        @Override
        public String toString() {
            return String.format("%s with ID: %s is %s years old.\n", getName(), getId(), getAge());
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        String command;
        while (!(command = scan.nextLine()).equals("End")){
            String[] line = command.split(" ");
            Person person = new Person(line[0], line[1], Integer.parseInt(line[2]));
            personList.add(person);
        }
        personList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::print);
    }
}
