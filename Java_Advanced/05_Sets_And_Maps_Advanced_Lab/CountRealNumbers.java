import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Double, Integer> realNumbers= new LinkedHashMap<>();

        double[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (int i = 0; i < numbers.length; i++) {
            if(realNumbers.containsKey(numbers[i])){
                realNumbers.put(numbers[i], realNumbers.get(numbers[i]) + 1);
            }else {
                realNumbers.put(numbers[i], 1);
            }
        }

        for (Double key : realNumbers.keySet()){
            System.out.printf("%.1f -> %d\n", key, realNumbers.get(key));
        }
    }
}
