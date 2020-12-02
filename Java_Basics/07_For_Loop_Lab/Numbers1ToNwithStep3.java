import java.util.Scanner;

public class Numbers1ToNwithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        for(int i = 1; i <= input; i += 3){
            System.out.println(i);
        }
    }
}

