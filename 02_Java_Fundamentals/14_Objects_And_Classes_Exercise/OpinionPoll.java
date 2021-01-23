import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    public static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] crap = scan.nextLine().split(" ");
            Person person = new Person(crap[0], Integer.parseInt(crap[1]));
            personList.add(person);
        }

        personList.sort((Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));

        for (Person person : personList) {
            if(person.getAge() > 30){
                System.out.printf("%s - %s\n", person.getName(), person.getAge());
            }
        }

    }
}
