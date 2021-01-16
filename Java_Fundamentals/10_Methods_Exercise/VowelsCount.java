import java.util.Scanner;

public class VowelsCount {
    public static int VowelsCount (String input){
        input = input.toLowerCase();
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            String o = String.valueOf(input.charAt(i));
            if (o.equals("a") || o.equals("e") || o.equals("i")
                    || o.equals("o") || o.equals("u")){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(VowelsCount(input));
    }
}

