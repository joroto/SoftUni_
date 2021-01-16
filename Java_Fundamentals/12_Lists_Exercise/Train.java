import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1  =
                Arrays.stream(scan.nextLine()
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());

        String input;
        while (!((input = scan.nextLine()).equals("end"))){
            String[] commands = input.split(" ");

            if (commands[0].equals("Add")){
                list1.add(Integer.parseInt(commands[1]));
            }else {
                for (int i = 0; i < list1.size(); i++) {
                    if (maxCapacity >= list1.get(i) + Integer.parseInt(commands[0])){
                        list1.set(i, list1.get(i) + Integer.parseInt(commands[0]));
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }
}

