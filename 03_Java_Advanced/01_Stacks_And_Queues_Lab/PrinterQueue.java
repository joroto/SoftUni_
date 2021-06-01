import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> deq = new ArrayDeque<>();
        String command;

        while (!(command = scan.nextLine()).equals("print")) {
            switch (command) {
                case "cancel":
                    if (deq.isEmpty()) {
                        System.out.println("Printer is on standby");
                    } else {
                        System.out.println("Canceled " + deq.pollFirst());
                    }
                    break;
                default:
                    deq.offer(command);
                    break;
            }
        }

        while (!deq.isEmpty()){
            System.out.println(deq.pollFirst());
        }
    }
}
