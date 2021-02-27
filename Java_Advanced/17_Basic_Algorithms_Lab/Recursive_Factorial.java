import java.util.Scanner;

public class Recursive_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = Integer.parseInt(scan.nextLine());

        System.out.println(fact(n));

    }

    public static long fact(long n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }
}
