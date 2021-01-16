import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.next();
        String reversed = new StringBuffer(string).reverse().toString();

        System.out.println(reversed);
    }
}

