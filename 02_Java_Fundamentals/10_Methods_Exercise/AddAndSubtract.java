import java.util.Scanner;

public class AddAndSubtract {
    public static int Add (int a, int b){
        return a + b;
    }

    public static int Subtract (int a, int b, int c){
        return Add(a, b) - c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        System.out.println(Subtract(a, b, c));
    }
}
