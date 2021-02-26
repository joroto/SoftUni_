package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> list = Arrays.stream(scan.nextLine().split("\\s+")).skip(1).collect(Collectors.toList());
        ListyIterator listyIterator = new ListyIterator(list);

        String input;

        while (!(input = scan.nextLine()).equals("END")){
            switch (input){
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "PrintAll":
                    try {
                        listyIterator.printAll();
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
            }
        }
    }
}
