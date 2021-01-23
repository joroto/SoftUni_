import java.util.Scanner;

public class PalindromeIntegers {
    public static void PaliId (int input){
        int resultNumber = 0;
        for (int i = input; i != 0; i /= 10) {
            resultNumber = resultNumber * 10 + i % 10;
        }
        if (resultNumber == input){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;

        while (!(input = scan.nextLine()).equals("END")){
            PaliId(Integer.parseInt(input));
        }
    }
}
