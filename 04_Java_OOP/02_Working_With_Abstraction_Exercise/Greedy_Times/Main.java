package Greedy_Times;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Long> cash = new LinkedHashMap<>();
        Map<String, Long> gems = new LinkedHashMap<>();
        long cashAmount = 0;
        long gemAmount = 0;
        long gold = 0;
        boolean tagged = false;

        //⦁	The gold amount in your bag should always be more than or equal to the gem amount at any time
        //⦁	The gem amount should always be more than or equal to the cash amount at any time

        // gold > gem > cash

        //Prepare for some janky shit

        long n = Long.parseLong((scan.nextLine()));
        String[] input = scan.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i += 2) {
            String[] currentCrap = new String[]{input[i], input[i + 1]};
            String thing = currentCrap[0];
            Long amount = Long.parseLong(currentCrap[1]);
            //System.out.println(Arrays.toString(currentCrap));

            if(thing.equalsIgnoreCase("gold") && n - amount >= 0){
                gold += amount;
                n -= amount;
                tagged = true;
            }else if(thing.toLowerCase().length() == 3){
                if(cashAmount + amount <= gemAmount && n - cashAmount - amount >= 0){
                    cash.putIfAbsent(thing, 0L);
                    cash.put(thing, cash.get(thing) + amount);
                    cashAmount += amount;
                    n -= amount;
                }
            }else if(thing.toLowerCase().endsWith("gem") && thing.length() >= 4){
                if(gemAmount + amount <= gold && n - gemAmount - amount >= 0){
                    gems.putIfAbsent(thing, 0L);
                    gems.put(thing, gems.get(thing) + amount);
                    gemAmount += amount;
                    n -= amount;
                }
            }
        }


        PrintGold(gold, tagged);
        PrintMap(gems, gemAmount, "<Gem> $");
        PrintMap(cash, cashAmount, "<Cash> $");

    }

    private static void PrintMap(Map<String, Long> gems, long gemAmount, String s) {
        if (!gems.isEmpty()) {
            System.out.println(s + gemAmount);
            gems.entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(g -> {
                System.out.printf("##%s - %d\n", g.getKey(), g.getValue());
            });
        }
    }

    private static void PrintGold(long gold, boolean tagged) {
        if(tagged) {
            System.out.println("<Gold> $" + gold);
            System.out.println("##Gold - " + gold);
        }
    }
}
