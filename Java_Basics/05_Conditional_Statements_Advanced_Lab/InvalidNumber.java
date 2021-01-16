import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        if (input >= 100 && input <= 200) {

        }else if (input == 0){
            
        }else {
            System.out.println("invalid");
        }
    }
}

