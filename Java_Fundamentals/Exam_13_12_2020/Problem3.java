import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input;
        Map<String, Integer> followers = new TreeMap<>();
        while (!(input = scan.nextLine()).equals("Log out")){
            String[] command = input.split(": ");

            switch (command[0]){
                case "New follower":
                    if (followers.containsKey(command[1])){
                        break;
                    }else {
                        followers.put(command[1], 0);
                    }
                    break;
                case "Like":
                    if (!followers.containsKey(command[1])){
                        followers.put(command[1], Integer.parseInt(command[2]));
                    }else {
                        followers.put(command[1], followers.get(command[1]) + Integer.parseInt(command[2]));
                    }
                    break;
                case "Comment":
                    if (!followers.containsKey(command[1])){
                        followers.put(command[1], 1);
                    }else {
                        followers.put(command[1], followers.get(command[1]) + 1);
                    }
                    break;
                case "Blocked":
                    if (followers.containsKey(command[1])){
                        followers.remove(command[1]);
                    }else {
                        System.out.println(command[1]+" doesn't exist.");
                    }
            }
        }
        System.out.println(followers.size() +" followers");
        followers.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(f -> System.out.println(f.getKey() +": " +  f.getValue()));
    }
}
