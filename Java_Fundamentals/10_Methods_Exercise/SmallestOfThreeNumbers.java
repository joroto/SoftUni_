import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void SmallestIdentifier(int a, int b, int c){
        if (a < b && a < c){
            System.out.println(a);
        }else if (b < a && b < c){
            System.out.println(b);
        }else if (c < a && c < b){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        SmallestIdentifier(a, b, c);
    }
}
