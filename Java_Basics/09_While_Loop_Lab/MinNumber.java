import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        String input = scan.nextLine();
        
        while (!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if(number < min){
                min = number;
            }
            input = scan.nextLine();
        }
        System.out.println(min);
    }
}

