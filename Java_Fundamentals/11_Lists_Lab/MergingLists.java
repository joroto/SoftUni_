import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list1  =
                Arrays.stream(scan.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> list2  =
                Arrays.stream(scan.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> listRdy = new ArrayList<>();

        int a = list1.size();
        int b = list2.size();

        if (a >= b){
            for (int i = 0; i < list2.size(); i++) {
                listRdy.add(list1.get(i));
                listRdy.add(list2.get(i));
            }
            for (int i = list2.size(); i < list1.size(); i++) {
                listRdy.add(list1.get(i));
            }
        }else {
            for (int i = 0; i < list1.size(); i++) {
                listRdy.add(list1.get(i));
                listRdy.add(list2.get(i));
            }
            for (int i = list1.size(); i < list2.size(); i++) {
                listRdy.add(list2.get(i));
            }
        }

        for (int i = 0; i < listRdy.size(); i++) {
            System.out.print(listRdy.get(i));
            if (i < listRdy.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

