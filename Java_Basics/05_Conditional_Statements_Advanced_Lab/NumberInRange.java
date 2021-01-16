import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        if (input >= -100 && input <= 100 && input != 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

