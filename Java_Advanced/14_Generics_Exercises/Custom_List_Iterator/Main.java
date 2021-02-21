package Custom_List_Sorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CoolList<String> coolList = new CoolList<>();

        String input;
        while (!(input = scan.nextLine()).equals("END")){
            String[] tokens = input.split("\\s+");

            switch (tokens[0]){
                case "Add":
                    coolList.add(tokens[1]);
                    break;
                case "Remove":
                    coolList.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(coolList.contains(tokens[1]));
                    break;
                case "Swap":
                    coolList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(coolList.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(coolList.getMax());
                    break;
                case "Min":
                    System.out.println(coolList.getMin());
                    break;
                case "Print":
                    //System.out.println(coolList);
                    coolList.iterator().forEachRemaining(System.out::println);
                    break;
                case "Sort":
                    Sorter.sort(coolList);
                    break;
            }
        }
    }
}
