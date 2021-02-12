import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int main = Integer.parseInt(scan.nextLine());
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Predicate <Integer> idDivisible = num ->{
            for (int number : numbers) {
                if(num % number != 0){
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= main; i++) {
            if(idDivisible.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
