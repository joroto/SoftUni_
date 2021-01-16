import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Integer> arr = new ArrayList<Integer>();
        Integer[] arr2 = new Integer[arr.size()];

        for (int i = 0; i < n ; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            arr.add(a);
            arr.add(b);
        }
        arr2 = arr.toArray(arr2);

        int loopCount = 1;
        for (int i = 0; i < arr2.length; ) {
                System.out.print(arr2 [i] + " ");
                arr2 [i] = 999;
                if (loopCount % 2 == 0){
                    i += 1;
                }else {
                    i += 3;
                }
                loopCount++;
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (!(arr2 [i].equals(999))){
                System.out.print(arr2 [i] + " ");
            }
        }
    }
}
//1 4 5 8
// 3 1 3 1 3 1 3 1 3 1 3 1 3 1 3
