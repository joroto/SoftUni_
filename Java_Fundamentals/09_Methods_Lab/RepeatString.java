import java.util.Scanner;

public class RepeatString {
    public static String Repeater (String input, int repetitions){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repetitions; i++) {
            result.append(input);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int repetitions = scan.nextInt();

        System.out.print(Repeater(input, repetitions));
    }
}
