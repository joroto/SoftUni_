package Class_Box_Data_Validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        try {
            Box box = new Box(length, width, height);
            System.out.println(box);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
