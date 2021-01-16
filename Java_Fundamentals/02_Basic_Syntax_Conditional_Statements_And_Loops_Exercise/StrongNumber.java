import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n = scan.nextLine();
        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            int f = Integer.parseInt(String.valueOf(n.charAt(i)));
            int fact = 1;
            for (int j  = 1; j <= f; j ++) {
                fact *= j;
            }
            sum += fact;
        }
        if (sum == Integer.parseInt(n)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
