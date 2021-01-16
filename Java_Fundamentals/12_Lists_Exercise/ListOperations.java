import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 =
                Arrays.stream(scan.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input;
        while (!(input = scan.nextLine()).equals("End")) {
            String[] commands = input.split(" ");

            switch (commands[0]) {
                case "Add":
                    list1.add(Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    if (Integer.parseInt(commands[2]) < list1.size() && Integer.parseInt(commands[2]) >= 0) {
                        list1.add(Integer.parseInt(commands[2]), Integer.parseInt(commands[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(commands[1]) < list1.size() && Integer.parseInt(commands[1]) >= 0) {
                        list1.remove(Integer.parseInt(commands[1]));
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    switch (commands[1]) {
                        case "left":
                            for (int i = 0; i < Integer.parseInt(commands[2]); i++) {
                                list1.add(list1.get(0));
                                list1.remove(0);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < Integer.parseInt(commands[2]); i++) {
                                list1.add(0, list1.get(list1.size() - 1));
                                list1.remove(list1.size() - 1);
                            }
                            break;
                    }
                    break;
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }
}

