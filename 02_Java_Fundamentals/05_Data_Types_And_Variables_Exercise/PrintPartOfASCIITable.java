import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = scan.nextInt();
        int finish = scan.nextInt();

        for (; start <= finish; start++) {
            System.out.print((char) start + " ");
        }
    }
}
