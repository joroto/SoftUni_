import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {

    static List<String> guests = null;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        guests = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        String input;
        while (!(input = scan.nextLine()).equals("Party!")){
            String[] tokens = input.split(" ");
            switch (tokens[0]){
                case "Remove":
                    removeName(getPredicate(tokens));
                    break;

                case "Double":
                    addOneMore(getPredicate(tokens));
                    break;
            }
        }

        if(guests.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            Collections.sort(guests);
            System.out.println(guests.toString().replaceAll("\\[|\\]" , "") + " are going to the party!");
        }
    }

    private static void removeName(Predicate<String> predicate) {
        guests.removeIf(predicate);
    }

    public static Predicate<String> getPredicate (String[] tokens){
        Predicate<String> predicate;
        switch (tokens[1]) {
            case "StartsWith":
                predicate = name -> name.startsWith(tokens[2]);
                break;
            case "EndsWith":
                predicate = name -> name.endsWith(tokens[2]);
                break;
            case "Length":
                predicate = name -> name.length() == Integer.parseInt(tokens[2]);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + tokens[1]);
        }
        return predicate;
    }

    public static void addOneMore(Predicate<String> predicate){
        List<String> guestsToAdd = new ArrayList<>();
        guests.stream().filter(predicate).forEach(guestsToAdd::add);
        guests.addAll(guestsToAdd);
    }
}
