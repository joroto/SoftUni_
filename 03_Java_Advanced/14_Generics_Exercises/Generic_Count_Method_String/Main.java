package Generic_Count_Method_String;
import java.util.Scanner;

public class Main<T> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Box<String> box = new Box<>();

        for (int i = 0; i < n; i++) {
            box.addElement(scan.nextLine());
        }

        System.out.println(box.countGreater(scan.nextLine()));
    }
}
