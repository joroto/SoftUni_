import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list1 = Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toList());

        String input;

        while (!(input = scan.nextLine()).equals("end")){
            String[] commands = input.split(" ");
            String currentCommand = commands[0];

            switch (currentCommand){
                case "Add":
                    list1.add(commands[1]);
                    break;
                case "Remove":
                    list1.remove(commands[1]);
                    break;
                case "RemoveAt":
                    list1.remove(Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    list1.add(Integer.parseInt(commands[2]), commands[1]);
                    break;
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i));
            if (i < list1.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

