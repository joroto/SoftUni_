import java.util.Scanner;

public class Rhombus_Of_Stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
//        String del = scan.nextLine();
//        String item = scan.nextLine();

        PrintRhombus(n);

    }

    private static void PrintRhombus(int n) {
        PrintTop(n /*del, item*/);
        PrintBottom(n);
    }

    //could be more abstract.. meh
    private static void PrintTop(int n /*String del, String item*/) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void PrintBottom(int n /*String del, String item*/) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
