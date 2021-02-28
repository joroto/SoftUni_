package Sum_Of_Coins;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(line);

        List<Integer> coins = new ArrayList<>();

        while (matcher.find()){
            coins.add(Integer.parseInt(matcher.group()));
        }

        int[] coinsInt = new int[coins.size()];
        //yeah.. I know. Don't care for now tho
        for (int i = 0; i < coins.size(); i++) {
            coinsInt[i] = coins.get(i);
        }

        String[] line2 = scan.nextLine().split(" ");
        int sum = Integer.parseInt(line2[1]);

        Map<Integer, Integer> selectedCoins = ChooseCoins(coinsInt, sum);

        System.out.printf("Number of coins to take: %d\n",
                selectedCoins.values().stream().mapToInt(Integer::intValue).sum());

        for (Integer key : selectedCoins.keySet()) {
            System.out.printf("%d coin(s) with value %d\n", selectedCoins.get(key), key);
        }

    }

    private static Map<Integer, Integer> ChooseCoins(int[] coins, int sum) {
        Map<Integer, Integer> chosenOnes = new LinkedHashMap<>();
        int coinIndex = 0;

        Arrays.sort(coins);
        List<Integer> sortedCoins = Arrays.stream(coins).boxed().collect(Collectors.toList());
        Collections.reverse(sortedCoins);

        while (sum > 0 && coinIndex < sortedCoins.size()){
            int currentCoin = sortedCoins.get(coinIndex);
            int numberToTake = sum / currentCoin;

            if(numberToTake > 0){
                chosenOnes.putIfAbsent(currentCoin, numberToTake);
            }
            sum -= currentCoin * numberToTake;
            coinIndex++;
        }
        return chosenOnes;
    }
}
