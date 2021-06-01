package Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        String input;
        while (!(input = scan.nextLine()).equals("Beast!")){
            try {
                String[] line = scan.nextLine().split("\\s+");
                int age = Integer.parseInt(line[1]);
                switch (input) {
                    case "Cat":
                        Cat cat = new Cat(line[0], age, line[2]);
                        animals.add(cat);
                        break;
                    case "Dog":
                        Dog dog = new Dog(line[0], age, line[2]);
                        animals.add(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(line[0], age, line[2]);
                        animals.add(frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(line[0], age);
                        animals.add(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(line[0], age);
                        animals.add(tomcat);
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        animals.forEach(System.out::println);
    }
}
