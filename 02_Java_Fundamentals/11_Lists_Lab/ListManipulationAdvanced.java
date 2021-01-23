import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1  =
                Arrays.stream(scan.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String input;

        while (!(input = scan.nextLine()).equals("end")){
            String[] commands = input.split(" ");
            String currentCommand = commands[0];

            switch (currentCommand){
                case "Contains":
                    if (list1.contains(Integer.parseInt(commands[1]))){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (commands[1]){
                        case "even":
                            for (int i = 0; i < list1.size(); i++) {
                                if (list1.get(i) % 2 == 0){
                                    System.out.print(list1.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int i = 0; i < list1.size(); i++) {
                                if (!(list1.get(i) % 2 == 0)){
                                    System.out.print(list1.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < list1.size(); i++) {
                        sum += list1.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    switch (commands[1]){
                        case "<":
                            for (int i = 0; i < list1.size(); i++) {
                                if (list1.get(i) < Integer.parseInt(commands[2])){
                                    System.out.print(list1.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < list1.size(); i++) {
                                if (list1.get(i) > Integer.parseInt(commands[2])){
                                    System.out.print(list1.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < list1.size(); i++) {
                                if (list1.get(i) >= Integer.parseInt(commands[2])){
                                    System.out.print(list1.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < list1.size(); i++) {
                                if (list1.get(i) <= Integer.parseInt(commands[2])){
                                    System.out.print(list1.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
            }
        }
    }
}

