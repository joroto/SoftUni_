import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
        String[] kids = scan.nextLine().split("\\s+");
		
        int n = Integer.parseInt(scan.nextLine());
		
        ArrayDeque<String> kidsDeq = new ArrayDeque<>();
		
        Collections.addAll(kidsDeq, kids);

        int count = 0;

        while (kidsDeq.size() != 1){
            count++;
            if (count % n == 0) {
                System.out.println("Removed " + kidsDeq.pollFirst());
            }else {
                String firstKid = kidsDeq.pop();
                kidsDeq.offer(firstKid);
            }
        }
        System.out.println("Last is " + kidsDeq.pop());
    }
}
