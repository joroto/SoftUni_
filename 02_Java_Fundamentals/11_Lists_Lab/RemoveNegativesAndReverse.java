import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1 =
                Arrays.stream(scan.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        for (int i = list1.size() - 1; i >= 0; i--) {
            if (list1.get(i) < 0) {
                list1.remove(i);
            }
        }
         if (list1.size() == 0){
             System.out.println("empty");
         }else {
             Collections.reverse(list1);
             for (int i = 0; i < list1.size(); i++) {
                 System.out.print(list1.get(i) + " ");
             }
         }
    }
}

