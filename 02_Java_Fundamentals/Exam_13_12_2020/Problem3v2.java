import java.util.*;

public class Problem3v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] commands = scan.nextLine().split("->");
        Map<String, List<String>> users = new TreeMap<>();
        int usersCount = 0;

        while (!commands[0].equals("Statistics")){
            switch (commands[0]) {
                case "Add":
                    String user = commands[1];

                    if(!users.containsKey(user)){
                        users.put(user, new ArrayList<>());
                        usersCount++;
                    }else{
                        System.out.println(user + " is already registered");
                    }
                    break;
                case"Send":
                    String sendUser = commands[1];
                    String email = commands[2];

                    if(users.containsKey(sendUser)){
                        users.get(sendUser).add(email);
                    }
                    break;
                case"Delete":
                    String deleteUser = commands[1];

                    if(!users.containsKey(deleteUser)){
                        users.remove(deleteUser);
                        usersCount--;
                    }else{
                        System.out.println(deleteUser + " not found!");
                    }
                    break;
            }
            commands = scan.nextLine().split("->");
        }

        System.out.println("Users count: " + usersCount);
        List <String> crap = new ArrayList<>();

        users.entrySet()
                .stream()
                .sorted((a, b)->{
                    return Integer.compare(b.getValue().size(), a.getValue().size());
                })
                .forEach(e ->{
                    System.out.println(e.getKey());
                    for (int i = 0; i < e.getValue().size(); i++) {
                        crap.add(e.getValue().get(i));

                    }
                    for (int i = 0; i < crap.size(); i++) {
                        System.out.println(crap.get(i));
                    }
                    crap.clear();
                });

    }
}
