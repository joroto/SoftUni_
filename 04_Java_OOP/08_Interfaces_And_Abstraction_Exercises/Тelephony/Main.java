package Тelephony;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> numbers = List.of(scan.nextLine().split("\\s+"));
        List<String> urls = List.of(scan.nextLine().split("\\s+"));

        Smartphone smartphone = new Smartphone(numbers,urls);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
