package Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line1 = scan.nextLine().split("\\s+");
        Tuple<String, String> tuple= new Tuple<>(line1[0] + " " + line1[1], line1[2]);
        System.out.println(tuple);

        String[] line2 = scan.nextLine().split("\\s+");
        Tuple<String, Integer> tuple2 = new Tuple<>(line2[0], Integer.parseInt(line2[1]));
        System.out.println(tuple2);

        String[] line3 = scan.nextLine().split("\\s+");
        Tuple<Integer, Double> tuple3 = new Tuple<>(Integer.parseInt(line3[0]), Double.parseDouble(line3[1]));
        System.out.println(tuple3);
    }
}
