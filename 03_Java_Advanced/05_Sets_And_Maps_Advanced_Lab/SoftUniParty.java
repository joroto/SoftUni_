import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> vip = new TreeSet<>();
        Set<String> reg = new TreeSet<>();

        String input;

        while (!(input = scan.nextLine()).equals("PARTY")){
            boolean isDigit = (Character.isDigit(input.charAt(0)));
            if(isDigit){
                vip.add(input);
            }else {
                reg.add(input);
            }
        }

        while (!(input = scan.nextLine()).equals("END")){
            vip.remove(input);
            reg.remove(input);
        }

        System.out.println(vip.size() + reg.size());
        vip.forEach(System.out::println);
        reg.forEach(System.out::println);
    }
}
