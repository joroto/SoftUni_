package Comparing_Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        List<Person> people = new ArrayList<>();

        while (!(input = scan.nextLine()).equals("END")){
            String[] attributes = input.split(" ");
            Person person = new Person(attributes[0], Integer.parseInt(attributes[1]), attributes[2]);
            people.add(person);
        }

        int personIndex = Integer.parseInt(scan.nextLine()) - 1;

        Person man = people.get(personIndex);
        int equal = 0;

        for (Person person : people) {
            if(man.compareTo(person) == 0){
                equal++;
            }
        }

        if(equal == 1){
            System.out.println("No matches");
        }else {
            int diff = people.size() - equal;
            System.out.println(equal + " " + diff + " " + people.size());
        }
    }
}
