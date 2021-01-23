import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] symbols = scan.nextLine().split("");
        ArrayDeque<String> deq = new ArrayDeque<>();
        ArrayDeque<String> deqRev = new ArrayDeque<>();
        int checked = 0;

        if (symbols.length % 2 == 0) {
            for (int i = 0; i < symbols.length / 2; i++) {
                deq.push(symbols[i]);
            }
            int initDeqSize = deq.size();

            for (int i = symbols.length - 1; i > symbols.length / 2 - 1; i--) {
                deqRev.push(symbols[i]);
            }

            for (int i = 0; i < deq.size(); i++) {
                switch (deq.pop()){
                    case "(":
                        deq.add(")");
                        break;
                    case "[":
                        deq.add("]");
                        break;
                    case "{":
                        deq.add("}");
                        break;
                }
            }
            while (!deq.isEmpty()){
                if(deqRev.pop().equals(deq.pop())){
                    checked++;
                }
            }
            if(checked == initDeqSize){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }else {
            System.out.println("NO");
        }
    }
}