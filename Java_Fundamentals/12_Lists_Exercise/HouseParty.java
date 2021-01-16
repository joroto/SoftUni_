import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] commands = input.split(" ");

            switch (commands[2]){
                case "going!":
                    if(!(names.contains(commands[0]))) {
                        names.add(commands[0]);
                    }else {
                        System.out.println(commands[0] + " is already in the list!");
                    }
                    break;
                case "not":
                    if(names.contains(commands[0])) {
                        names.remove(commands[0]);
                    }else {
                        System.out.println(commands[0] + " is not in the list!");
                    }
                    break;
            }
        }
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}

