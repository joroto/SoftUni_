import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List <Integer> list1 =
                Arrays.stream(scan.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input;
        while (!(input = scan.nextLine()).equals("end")){
            String[] commands = input.split(" ");

            switch (commands[0]){
                case "Delete":
                    list1.removeAll(Collections.singleton(Integer.parseInt(commands[1])));
                    break;
                case "Insert":
                    if (Integer.parseInt(commands[2]) < list1.size() && Integer.parseInt(commands[2]) >= 0) {
                        list1.add(Integer.parseInt(commands[2]), Integer.parseInt(commands[1]));
                    }
                    break;
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }
}

