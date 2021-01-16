import java.util.Scanner;

public class CharactersInRange {
    private static char CharsInRange (char a1, char b1){
        if (a1 < b1) {
            for (int i = a1 + 1; i < b1; i++) {
                System.out.print(((char) i + " "));
            }
        }else {
            //b1 < a1
            for (int i = b1 + 1; i < a1; i++) {
                System.out.print(((char) i + " "));
            }
        }
        return a1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        char a1 = a.charAt(0);
        String b = scan.nextLine();
        char b1 = b.charAt(0);

        CharsInRange(a1, b1);
    }
}
