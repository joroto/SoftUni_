package Birthday_Celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        List<Birthable> list = new ArrayList<>();
        while (!(input = scan.nextLine()).equals("End")){
            String[] inputArr = input.split("\\s+");

            switch (inputArr[0]){
                case "Citizen":
                    Citizen citizen = new Citizen(inputArr[1], Integer.parseInt(inputArr[2]), inputArr[3], inputArr[4]);
                    list.add(citizen);
                    break;
                case "Pet":
                    Pet pet = new Pet(inputArr[1], inputArr[2]);
                    list.add(pet);
                    break;
            }
        }
        String  ageToPrint = scan.nextLine();
        list.stream().filter(e -> e.getBirthDate().endsWith(ageToPrint)).forEach(e -> System.out.println(e.getBirthDate()));
    }
}
