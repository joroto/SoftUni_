import java.util.Scanner;

public class MathOperations {
    public static int Calculated (int a, String command, int b){
        switch (command){
            case "/":
                return a / b;
            case "*":
                return a * b;
            case "+":
                return a + b;
            case "-":
                return a - b;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());

        System.out.println(Calculated(a, command, b));
    }
}

