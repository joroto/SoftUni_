import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int capacity = 255;
        int n = scan.nextInt();
        int poured = 0;

        for (int i = 0; i < n; i++) {
            int input = scan.nextInt();
            poured += input;
            if (poured > capacity){
                System.out.println("Insufficient capacity!");
                poured -= input;
            }
        }
        System.out.println(poured);
    }
}
