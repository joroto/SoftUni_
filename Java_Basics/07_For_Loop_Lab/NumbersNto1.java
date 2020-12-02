import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = Integer.parseInt(scan.nextLine());

        for (; i >= 1 ; i--){
            System.out.println(i);
        }
    }
}

