package Point_In_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ints = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] botXY = Arrays.copyOfRange(ints, 0, 2);
        Point bot = new Point(botXY[0], botXY[1]);
        int[] topXY = Arrays.copyOfRange(ints, 2, 4);
        Point top = new Point(topXY[0], topXY[1]);
        //making life hard
        Rectangle rectangle = new Rectangle(bot, top);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int[] in = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Point point = new Point(in[0], in[1]);
            System.out.println(rectangle.contains(point));
        }
    }
}
